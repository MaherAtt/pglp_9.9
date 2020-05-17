package uvsq.fr.pglp_9_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingTui {

	public Command nextCommand() throws IOException
	{
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
     String cmd = reader.readLine();
     
     cmd.replace(" ", "");
      
     // create a matcher that will match the given input against this pattern
     
		return null;
		
	}
}
