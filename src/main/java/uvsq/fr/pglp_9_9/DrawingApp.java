package uvsq.fr.pglp_9_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class DrawingApp {

	void run() throws SQLException, IOException
	{
DrawingTui tu=new DrawingTui();
    	
    	while(true)
    	{
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String cmd = null;
		try {
			cmd = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(cmd);
    		tu.nextCommand(cmd).execute();
    	}
	}
}
