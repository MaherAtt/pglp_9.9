package uvsq.fr.pglp_9_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class DrawingTui {

	public Command nextCommand(String cmd) throws IOException
	{
		
     
     cmd.replaceAll(" ", "");
     
    Pattern regCreateCercleCarre = Pattern.compile("([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+)\\)");
 	Pattern regCreateRect = Pattern.compile("([a-zA-Z]+)=(Rectangle)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+)\\)([a-zA-Z]+)=([a-zA-Z]+)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+)\\)");
 	Pattern regCreateTriangle = Pattern.compile("([a-zA-Z]+)=(Triangle)\\(\\(([0-9]+),([0-9]+)\\),([0-9]+),([0-9]+),([0-9]+)\\)");
 	Pattern regmove = Pattern.compile("move\\(([a-zA-Z]+),\\(([0-9]+),([0-9]+)\\)\\)");
 	Pattern regprint = Pattern.compile("print\\(([a-zA-Z]+)\\)");
 	Pattern regComp = Pattern.compile("([a-zA-Z]+)=(Composite)\\(\\(([0-9]+),([0-9]+)\\)\\)");
 	Pattern regAdd = Pattern.compile("add\\(([a-zA-Z]+),([a-zA-Z]+)\\)");

 	
 	java.util.regex.Matcher m = regCreateCercleCarre.matcher(cmd);
 	java.util.regex.Matcher m2 = regCreateRect.matcher(cmd);
 	java.util.regex.Matcher m3 = regCreateTriangle.matcher(cmd);
 	java.util.regex.Matcher m4 = regmove.matcher(cmd);
 	java.util.regex.Matcher m5 = regprint.matcher(cmd);
 	java.util.regex.Matcher m6 = regComp.matcher(cmd);
 	java.util.regex.Matcher m7 = regAdd.matcher(cmd);

 	if(m.matches() )
 	{
 		//Ici c'est une création
 		
 		if(m.group(2).equals("Cercle"))
 		{
 		DrawableShape dp=new Cercle(m.group(1),new Point(Integer.parseInt(m.group(3)),Integer.parseInt(m.group(4))),Integer.parseInt(m.group(5)));
 		return new CreateCommand(dp);
 		}
 		if(m.group(2).equals("Carre"))
 		{
 		DrawableShape dp=new Carre(m.group(1),new Point(Integer.parseInt(m.group(3)),Integer.parseInt(m.group(4))),Integer.parseInt(m.group(5)));
 		return new CreateCommand(dp);
 		}
 		
 	}
 	
 	if(m2.matches() )
 	{
 		//Ici c'est une création
		 DrawableShape sp=new Rectangle(m2.group(1),new Point(Integer.parseInt(m2.group(3)),Integer.parseInt(m2.group(4))),Integer.parseInt(m2.group(5)),Integer.parseInt(m2.group(6)));
		 return new CreateCommand(sp);
 	}
 	
 	if(m3.matches() )
 	{
 		//Ici c'est une création
 		DrawableShape sp=new Triangle(m3.group(1),new Point(Integer.parseInt(m3.group(3)),Integer.parseInt(m3.group(4))),Integer.parseInt(m3.group(5)),Integer.parseInt(m3.group(6)),Integer.parseInt(m3.group(7)));
		 return new CreateCommand(sp);	
 	}
 	
 	if(m4.matches())
 	{
 		//Ici c'est un move
 		DaoCarre dc=new DaoCarre();
 		DaoRectangle dr=new DaoRectangle();
 		DaoTriangle dt=new DaoTriangle();
 		DaoCercle dcer=new DaoCercle();
 		DaoComposite dcomp=new DaoComposite();
 		
 		if(dc.find(m4.group(1))!=null)
 		{
 			DrawableShape Cr=dc.find(m4.group(1));
 			return new MoveCommande(Cr,new Point(Integer.parseInt(m4.group(2)),Integer.parseInt(m4.group(3))));
 		}
 		if(dr.find(m4.group(1))!=null)
 		{
 			DrawableShape Cr=dr.find(m4.group(1));
 			return new MoveCommande(Cr,new Point(Integer.parseInt(m4.group(2)),Integer.parseInt(m4.group(3))));

 		}
 		if(dt.find(m4.group(1))!=null)
 		{
 			DrawableShape Cr=dt.find(m4.group(1));
 			return new MoveCommande(Cr,new Point(Integer.parseInt(m4.group(2)),Integer.parseInt(m4.group(3))));

 		}
 		if(dcer.find(m4.group(1))!=null)
 		{
 			DrawableShape Cr=dcer.find(m4.group(1));
 			return new MoveCommande(Cr,new Point(Integer.parseInt(m4.group(2)),Integer.parseInt(m4.group(3))));

 		}
 		if(dcomp.find(m4.group(1))!=null)
 		{
 			DrawableShape Cr=dcomp.find(m4.group(1));
 			return new MoveCommande(Cr,new Point(Integer.parseInt(m4.group(2)),Integer.parseInt(m4.group(3))));
 		}
 	}
 	
 	if(m5.matches())
 	{
 		//Ici c'est un print
 		DaoCarre dc=new DaoCarre();
 		DaoRectangle dr=new DaoRectangle();
 		DaoTriangle dt=new DaoTriangle();
 		DaoCercle dcer=new DaoCercle();
 		
 		if(dc.find(m5.group(1))!=null)
 		{
 			DrawableShape Cr=dr.find(m5.group(1));
 			System.out.println(Cr.nom);
 			return new PrintCommand(Cr); 		}
 		if(dr.find(m5.group(1))!=null)
 		{
 			DrawableShape Cr=dr.find(m5.group(1));
 			System.out.println(Cr.nom);
 			return new PrintCommand(Cr);
 		}
 		if(dt.find(m5.group(1))!=null)
 		{
 			DrawableShape Cr=dt.find(m5.group(1));
 			System.out.println(Cr.nom);
 			return new PrintCommand(Cr);

 		}
 		if(dcer.find(m5.group(1))!=null)
 		{
 			DrawableShape Cr=dcer.find(m5.group(1));
 			System.out.println(Cr.nom);
 			return new PrintCommand(Cr);
 		}
 	}
     
     if(m6.matches())
     {
    	 DrawableShape Comp=new CompositeShape(m6.group(1),new Point(Integer.parseInt(m6.group(3)),Integer.parseInt(m6.group(4))));
    	 return new CreateCommand(Comp);
     }
     
     if(m7.matches())
     {
    	 DaoCarre dc=new DaoCarre();
  		DaoRectangle dr=new DaoRectangle();
  		DaoTriangle dt=new DaoTriangle();
  		DaoCercle dcer=new DaoCercle();
  		DaoComposite dcomp=new DaoComposite();
  		
  		if(dc.find(m4.group(2))!=null)
  		{
  			DrawableShape Cr=dc.find(m4.group(2));
  			return new AddCommand(dcomp.find(m4.group(1)),Cr);
  		}
  		if(dr.find(m4.group(1))!=null)
  		{
  			DrawableShape Cr=dr.find(m4.group(2));
  			return new AddCommand(dcomp.find(m4.group(1)),Cr);
  		}
  		if(dt.find(m4.group(1))!=null)
  		{
  			DrawableShape Cr=dt.find(m4.group(2));
  			return new AddCommand(dcomp.find(m4.group(1)),Cr);
  		}
  		if(dcer.find(m4.group(1))!=null)
  		{
  			DrawableShape Cr=dcer.find(m4.group(2));
  			return new AddCommand(dcomp.find(m4.group(1)),Cr);
  		}
  		if(dcomp.find(m4.group(1))!=null)
  		{
  			DrawableShape Cr=dcomp.find(m4.group(2));
  			return new AddCommand(dcomp.find(m4.group(1)),Cr);
  		}
     }
     
        
		return null;
		
	}
}
