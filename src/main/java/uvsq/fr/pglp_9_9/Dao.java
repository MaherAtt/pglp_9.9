package uvsq.fr.pglp_9_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao<T> {
	Connection connect;
	
	public Dao(){
		String dburl="jdbc:derby:MaBdd;";
		try{
            connect = DriverManager.getConnection(dburl);
            
        } catch (SQLException e) {
        	
            e.printStackTrace();
        }
	    
	  }
	   
	  /**
	  * Méthode de création
	  * @param obj
	  * @return boolean 
	 * @throws SQLException 
	  */
	  public abstract boolean create(T obj) throws SQLException;

	  /**
	  * Méthode pour effacer
	  * @param obj
	  * @return boolean 
	  */
	  public abstract boolean delete(T obj);

	  /**
	  * Méthode de mise à jour
	  * @param obj
	  * @return boolean
	 * @throws SQLException 
	  */
	  public abstract boolean update(T obj) throws SQLException;

	  /**
	  * Méthode de recherche des informations
	  * @param id
	  * @return T
	  */
	  public abstract T find(String nom);

}
