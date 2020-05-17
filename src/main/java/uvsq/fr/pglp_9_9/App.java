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
    	//stt.execute("Create table CompositeShape (nom varchar(10),centre varchar(5),fils varchar(50))");

    	DaoCarre cr= new DaoCarre();
    	DrawableShape sp=new Carre("CarreTest",new Point(0,0),4);
    	CreateCommand cmd=new CreateCommand(sp);
    	cmd.execute();
    	MoveCommande cmd2=new MoveCommande(sp,new Point(3,0));
    	cmd2.execute();
    	CompositeShape comp=new CompositeShape("Majmoua",new Point(1,1));
    	comp.ajouterShape(sp);
    	CreateCommand cm=new CreateCommand(comp);
    	//comp.draw();
    	cm.execute();
    	(new DaoComposite().find("Majmoua")).draw();
    	
    	//new DaoCarre().find("CarreTest").draw();
    	//stt.execute("drop table Carre");
    	//stt.execute("drop table Rectangle");
    	//stt.execute("drop table Triangle");
    	//stt.execute("drop table Cercle");
    	
    	
    	//stt.execute("Create table Carre (nom varchar(10),centre varchar(5),cote integer)");
    	//stt.execute("Create table Rectangle (nom varchar(10),centre varchar(5),longeur integer,largeur integer)");
    	//stt.execute("Create table Triangle (nom varchar(10),centre varchar(5),a integer,b integer,c integer)");
    	//stt.execute("Create table Cercle (nom varchar(10),centre varchar(5),rayon integer)");
    	//stt.execute("Create table Shape (nom varchar(10),type varchar(10))");

    }
}
