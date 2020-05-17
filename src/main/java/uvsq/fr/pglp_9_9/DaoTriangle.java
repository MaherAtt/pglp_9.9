package uvsq.fr.pglp_9_9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoTriangle extends Dao<Triangle>{

	public DaoTriangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Triangle obj) throws SQLException {
		// TODO Auto-generated method stub
		String query = " insert into Triangle (nom, centre, a, b, c)"
		        + " values (?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connect.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      preparedStmt.setString (1, obj.nom);
	      preparedStmt.setString (2, obj.centre.x+","+obj.centre.y);
	      preparedStmt.setInt   (3, obj.a);
	      preparedStmt.setInt(4, obj.b);
	      preparedStmt.setInt    (5, obj.c);
	      preparedStmt.execute();
		return false;
	}

	@Override
	public boolean delete(Triangle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Triangle obj) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update Triangle set centre = ? where nom = ?";
	      PreparedStatement preparedStmt = connect.prepareStatement(query);
	      preparedStmt.setString   (1, obj.centre.x+","+obj.centre.y);
	      preparedStmt.setString(2, obj.nom);

	      // execute the java preparedstatement
	      preparedStmt.executeUpdate();
		return false;
	}

	@Override
	public Triangle find(String nom) {
		// TODO Auto-generated method stub

	    try {
	      ResultSet result = this.connect.createStatement(
	        ResultSet.TYPE_SCROLL_INSENSITIVE, 
	        ResultSet.CONCUR_READ_ONLY
	      ).executeQuery("SELECT * FROM Triangle WHERE nom = '" + nom+"'");
	        if(result.first())
	          return new Triangle(result.getString("nom"), new Point(Integer.parseInt(result.getString("centre").split(",")[0]),Integer.parseInt(result.getString("centre").split(",")[1]))  ,result.getInt("a"),result.getInt("b"),result.getInt("c"));         
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return null;
		
	}

}
