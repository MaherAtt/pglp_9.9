package uvsq.fr.pglp_9_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	String dburl="jdbc:derby:MaBdd;";
    	Connection aa=DriverManager.getConnection(dburl);
    	java.sql.Statement stt=aa.createStatement();
    	DaoCarre cr= new DaoCarre();
    	
    	
    	
    	//stt.execute("Create table Carre (id int GENERATED ALWAYS AS IDENTITY,centre varchar(5),cote integer)");
    	//stt.execute("Create table Rectangle (id int GENERATED ALWAYS AS IDENTITY,centre varchar(5),longeur integer,largeur integer)");
    	//stt.execute("Create table Triangle (id int GENERATED ALWAYS AS IDENTITY,centre varchar(5),a integer,b integer,c integer)");
    	//stt.execute("Create table Cercle (id int GENERATED ALWAYS AS IDENTITY,centre varchar(5),rayon integer)");

    }
}
