package uvsq.fr.pglp_9_9;

public class Triangle implements DrawableShape{
	Point centre;
	int a;
	int b;
	int c;
	
	public Triangle(Point center,int aa,int bb,int cc)
	{
		centre=center;
		a=aa;
		b=bb;
		c=cc;
	}
}
