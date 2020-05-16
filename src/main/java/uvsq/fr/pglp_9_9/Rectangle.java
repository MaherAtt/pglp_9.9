package uvsq.fr.pglp_9_9;

public class Rectangle extends DrawableShape{
	int longeur;
	int largeur;
	
	public Rectangle(String nom,Point center,int longe,int larg)
	{
		this.nom=nom;
		centre=center;
		longeur=longe;
		largeur=larg;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("(Rectangle "+nom+" Centre("+centre.x+","+centre.y+") Longeur="+longeur+" Largeur="+largeur+")");

		
	}
}
