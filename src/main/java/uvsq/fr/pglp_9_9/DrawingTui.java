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
     
     cmd.replaceAll(",", " ");
     cmd.replaceAll("=", " ");
     cmd.replaceAll("(", " ");
     cmd.replaceAll(")", " ");
     
     String[] tabCmd=cmd.split(" ");
     
     if(tabCmd[0]=="move")
     {
    	 
     }
     if(tabCmd[0]=="print")
     {
    	 
     }
     if(tabCmd[0]!="print" && tabCmd[0]!="move")
     {
    	 if(tabCmd[1]=="cercle")
    	 {
    		 DrawableShape sp=new Cercle(tabCmd[0],new Point(Integer.parseInt(tabCmd[2]),Integer.parseInt(tabCmd[3])),Integer.parseInt(tabCmd[4]));
    		 return new CreateCommand(sp);
    	 }
    	 if(tabCmd[1]=="carre")
    	 {
    		 DrawableShape sp=new Carre(tabCmd[0],new Point(Integer.parseInt(tabCmd[2]),Integer.parseInt(tabCmd[3])),Integer.parseInt(tabCmd[4]));
    		 return new CreateCommand(sp);
    	 }
    	 if(tabCmd[1]=="rectangle")
    	 {
    		 DrawableShape sp=new Rectangle(tabCmd[0],new Point(Integer.parseInt(tabCmd[2]),Integer.parseInt(tabCmd[3])),Integer.parseInt(tabCmd[4]),Integer.parseInt(tabCmd[5]));
    		 return new CreateCommand(sp);
    	 }
    	 if(tabCmd[1]=="triangle")
    	 {
    		 DrawableShape sp=new Triangle(tabCmd[0],new Point(Integer.parseInt(tabCmd[2]),Integer.parseInt(tabCmd[3])),Integer.parseInt(tabCmd[4]),Integer.parseInt(tabCmd[5]),Integer.parseInt(tabCmd[6]));
    		 return new CreateCommand(sp);
    	 }
    	 if(tabCmd[1]=="composite")
    	 {
    		 DrawableShape sp=new CompositeShape(tabCmd[0],new Point(Integer.parseInt(tabCmd[2]),Integer.parseInt(tabCmd[3])));
    		 return new CreateCommand(sp);
    	 }
     }
      
     
		return null;
		
	}
}
