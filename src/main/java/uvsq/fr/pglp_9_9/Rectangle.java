package uvsq.fr.pglp_9_9;

public class Rectangle implements DrawableShape{
	Point centre;
	int longeur;
	int largeur;
	
	public Rectangle(Point center,int longe,int larg)
	{
		centre=center;
		longeur=longe;
		largeur=larg;
	}
}
