package uvsq.fr.pglp_9_9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCarre extends Dao<Carre>{

	public DaoCarre() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Carre obj) throws SQLException {
		// TODO Auto-generated method stub
		String query = " insert into Carre (nom, centre, cote)"
		        + " values (?, ?, ?)";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connect.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      preparedStmt.setString (1, obj.nom);
	      preparedStmt.setString (2, obj.centre.x+","+obj.centre.y);
	      preparedStmt.setInt   (3, obj.cote);
	      preparedStmt.execute();
		return false;
	}

	@Override
	public boolean delete(Carre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Carre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Carre find(int id) {
		// TODO Auto-generated method stub
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE, 
		        ResultSet.CONCUR_READ_ONLY
		      ).executeQuery("SELECT * FROM Carre WHERE id = " + id);
		        if(result.first())
		          return new Carre(result.getString("nom"), new Point(Integer.parseInt(result.getString("centre").split(",")[0]),Integer.parseInt(result.getString("centre").split(",")[1]))  ,result.getInt("cote"));         
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    return null;
		
	}

}
