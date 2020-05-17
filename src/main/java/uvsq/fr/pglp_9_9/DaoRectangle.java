package uvsq.fr.pglp_9_9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoRectangle extends Dao<Rectangle> {

	public DaoRectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Rectangle obj) throws SQLException {
		// TODO Auto-generated method stub
		String query = " insert into Rectangle (nom, centre, longeur, largeur)"
		        + " values (?, ?, ?, ?)";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connect.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      preparedStmt.setString (1, obj.nom);
	      preparedStmt.setString (2, obj.centre.x+","+obj.centre.y);
	      preparedStmt.setInt   (3, obj.longeur);
	      preparedStmt.setInt(4, obj.largeur);
	      preparedStmt.execute();
		return false;
	}

	@Override
	public boolean delete(Rectangle obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Rectangle obj) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update Rectangle set centre = ? where nom = ?";
	      PreparedStatement preparedStmt = connect.prepareStatement(query);
	      preparedStmt.setString   (1, obj.centre.x+","+obj.centre.y);
	      preparedStmt.setString(2, obj.nom);

	      // execute the java preparedstatement
	      preparedStmt.executeUpdate();
		return false;	}

	@Override
	public Rectangle find(String nom) {
		// TODO Auto-generated method stub
		try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE, 
		        ResultSet.CONCUR_READ_ONLY
		      ).executeQuery("SELECT * FROM Rectangle WHERE nom = '" + nom+"'");
		        if(result.first())
		          return new Rectangle(result.getString("nom"), new Point(Integer.parseInt(result.getString("centre").split(",")[0]),Integer.parseInt(result.getString("centre").split(",")[1]))  ,result.getInt("longeur"),result.getInt("largeur"));         
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    return null;
		
	}

}
