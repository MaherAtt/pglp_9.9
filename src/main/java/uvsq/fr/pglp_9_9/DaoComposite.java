package uvsq.fr.pglp_9_9;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoComposite  extends Dao<CompositeShape>{

	

		public DaoComposite() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean create(CompositeShape obj) throws SQLException {
			// TODO Auto-generated method stub
			String query = " insert into CompositeShape (nom,centre, fils)"
			        + " values (?, ?, ?)";
			PreparedStatement preparedStmt = null;
			try {
				preparedStmt = connect.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String childs="";
		      preparedStmt.setString (1, obj.nom);
		      preparedStmt.setString (2, obj.centre.x+","+obj.centre.y);
		      for(int h=0;h<obj.shapes.size();h++)
		      {
		    	  childs+= obj.shapes.get(h).nom+",";
		      }
		      childs=childs.substring(0, childs.length()-1);
		      preparedStmt.setString (3, childs);
		      preparedStmt.execute();
			return false;
		}

		@Override
		public boolean delete(CompositeShape obj) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean add(String nom,DrawableShape sp)
		{
			
			try {
			      ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE, 
			        ResultSet.CONCUR_READ_ONLY
			      ).executeQuery("SELECT * FROM Cercle WHERE nom = " + nom);
			        if(result.first())
			        {
			        	String req = "update Cercle set fils = ? where nom = ?";
					      PreparedStatement preparedStmt = connect.prepareStatement(req);
					      preparedStmt.setString   (1,result.getString("fils"));
					      preparedStmt.setString(2, nom);

					      // execute the java preparedstatement
					      preparedStmt.executeUpdate();
			        }
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
			
			
			return false;
			
		}

		@Override
		public boolean update(CompositeShape obj) {
			// TODO Auto-generated method stub
			
			return false;
		}

		@Override
		public CompositeShape find(String nom) {
			// TODO Auto-generated method stub
			
			try {
			      ResultSet result = this.connect.createStatement(
			        ResultSet.TYPE_SCROLL_INSENSITIVE, 
			        ResultSet.CONCUR_READ_ONLY
			      ).executeQuery("SELECT * FROM CompositeShape WHERE nom = '" + nom+"'");
			        if(result.first())
			        {		
			        	CompositeShape sh=new CompositeShape(nom,new Point(0,0));
			        	sh.centre=new Point(Integer.parseInt(result.getString("centre").split(",")[0]),Integer.parseInt(result.getString("centre").split(",")[1]));
			        	sh.nom=result.getString("nom");
			        	for(int rp=0;rp<result.getString("fils").split(",").length;rp++)
			        	{
			        		if(new DaoCarre().find(result.getString("fils").split(",")[rp])!=null) 
			        		{
			        			sh.ajouterShape(new DaoCarre().find(result.getString("fils").split(",")[rp]));
			        		}
			        		if(new DaoCercle().find(result.getString("fils").split(",")[rp])!=null) 
			        		{
			        			sh.ajouterShape(new DaoCercle().find(result.getString("fils").split(",")[rp]));
			        		}
			        		if(new DaoRectangle().find(result.getString("fils").split(",")[rp])!=null) 
			        		{
			        			sh.ajouterShape(new DaoRectangle().find(result.getString("fils").split(",")[rp]));
			        		}
			        		if(new DaoTriangle().find(result.getString("fils").split(",")[rp])!=null) 
			        		{
			        			sh.ajouterShape(new DaoTriangle().find(result.getString("fils").split(",")[rp]));
			        		}
			        	
			        	}
			        	return sh;

			        }
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
			    return null;
			
		}
}
