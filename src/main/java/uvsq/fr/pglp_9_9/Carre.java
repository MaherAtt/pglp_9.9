package uvsq.fr.pglp_9_9;

public class Carre extends DrawableShape {
	
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
		System.out.print("(Carre "+nom+" Centre("+centre.x+","+centre.y+") coté="+cote+")");

	}
}
