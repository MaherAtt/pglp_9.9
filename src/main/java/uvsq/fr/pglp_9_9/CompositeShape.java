package uvsq.fr.pglp_9_9;

import java.util.ArrayList;

public class CompositeShape extends DrawableShape {

	ArrayList<DrawableShape> shapes;
	
	public CompositeShape(String nm,Point centr)
	{
		nom=nm;
		centre=centr;
		shapes=new ArrayList<DrawableShape>();
	}
	
	public void ajouterShape(DrawableShape shape)
	{
		shapes.add(shape);
	}
	
	@Override
	public void move(Point p)
	{
		
		for(int i=0;i<shapes.size();i++)
		{
			shapes.get(i).move(p);
		}
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("{ Composite : "+nom+" Centre ("+centre.x+","+centre.y+")");
		
		for(int i=0;i<shapes.size();i++)
		{	System.out.print("[");
			shapes.get(i).draw(); 
			System.out.println("]");	
		}
		System.out.print("}");
	}

}
