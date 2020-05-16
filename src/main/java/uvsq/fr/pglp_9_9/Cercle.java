package uvsq.fr.pglp_9_9;

public class Cercle extends DrawableShape{
	int rayon;
	
	public Cercle(String nom,Point center,int r)
	{
		this.nom=nom;
		centre=center;
		rayon=r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("(Cercle "+nom+" Centre("+centre.x+","+centre.y+") rayon="+rayon);
		
	}

}
