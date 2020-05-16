package uvsq.fr.pglp_9_9;

public abstract class DrawableShape {
	Point centre;
	String nom;
	
	// Le déplacement ce fait en ajoutant les coordonées au centre du Shape
	// Par Exemple un cercle dans (0,1) si on le deplace de (1,2) sa nouvelle
	// Position est (1;3)
	public void move(Point p) {
		this.centre.x+=p.x;
		this.centre.y+=p.y;
	}
	public abstract void draw();
}
