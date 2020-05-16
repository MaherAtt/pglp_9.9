package uvsq.fr.pglp_9_9;

public class Triangle extends DrawableShape{
	int a;
	int b;
	int c;
	
	public Triangle(String nom,Point center,int aa,int bb,int cc)
	{	this.nom=nom;
		centre=center;
		a=aa;
		b=bb;
		c=cc;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("(Triangle "+nom+" Centre("+centre.x+","+centre.y+") a="+a+" b="+b+" c="+c+")");
		
	}
}
