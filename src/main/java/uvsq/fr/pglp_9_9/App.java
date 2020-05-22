package uvsq.fr.pglp_9_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException
    {
    	/*String dburl="jdbc:derby:MaBdd;";
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
    	 */
    	BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
    	String cmd = reader.readLine();
    	Pattern regCreateCercleCarre = Pattern.compile("([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+)\\)");
    	Pattern regCreateRect = Pattern.compile("([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+)\\)([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+)\\)");
    	Pattern regCreateTriangle = Pattern.compile("([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+),([0-9]+)\\)");
    	Pattern regmove = Pattern.compile("move\\(([a-zA-Z]+),\\(([0-9]+),([0-9]+)\\)\\)");
    	Pattern regprint = Pattern.compile("print\\(([a-zA-Z]+)\\)");


    	
    	java.util.regex.Matcher m = regCreateCercleCarre.matcher(cmd);
    	java.util.regex.Matcher m2 = regCreateRect.matcher(cmd);
    	java.util.regex.Matcher m3 = regCreateTriangle.matcher(cmd);
    	java.util.regex.Matcher m4 = regmove.matcher(cmd);
    	java.util.regex.Matcher m5 = regprint.matcher(cmd);

    	if(m.matches() )
    	{
    		//Ici c'est une création
    		DrawableShape dp=new Cercle(m.group(1),new Point(Integer.parseInt(m.group(2)),Integer.parseInt(m.group(3))),Integer.parseInt(m.group(4)));
    		CreateCommand cmdCr=new CreateCommand(dp);

    	}
    	
    	if(m2.matches() )
    	{
    		//Ici c'est une création
    		
    	}
    	
    	if(m3.matches() )
    	{
    		//Ici c'est une création
    		
    	}
    	
    	if(m4.matches())
    	{
    		//Ici c'est un move
    	}
    	
    	if(m5.matches())
    	{
    		//Ici c'est un print
    	}
    	
    	
    	boolean b = m.matches();
    	 System.out.println(b);
    }
}
