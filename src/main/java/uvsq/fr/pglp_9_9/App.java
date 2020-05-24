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
    	
    	DrawingTui tu=new DrawingTui();
    	
    	while(true)
    	{
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String cmd = reader.readLine();
         System.out.println(cmd);
    		tu.nextCommand(cmd).execute();
    	}
    
       
    	
    	
    }
}
