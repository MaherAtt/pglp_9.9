package uvsq.fr.pglp_9_9;

public class Carre extends DrawableShape {
	Point centre;
	int cote;
	
	public Carre(String nom,Point center,int cot)
	{
		this.nom=nom;
		centre=center;
		cote=cot;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("(Carre "+nom+" Centre("+centre.x+","+centre.y+") coté="+cote);

	}
}
