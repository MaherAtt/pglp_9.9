package uvsq.fr.pglp_9_9;

import java.sql.SQLException;

public class MoveCommande implements Command {

	DrawableShape shape;
	Point deplacement;
	
	public MoveCommande(DrawableShape dp,Point depl)
	{
		shape=dp;
		deplacement=depl;
	}
	public void execute() throws SQLException {
		// TODO Auto-generated method stub
		shape.centre.x+=deplacement.x;
		shape.centre.y+=deplacement.y;
		System.out.println(shape.centre.x+" "+shape.centre.y);
		if (shape instanceof Carre)
		{
			DaoCarre dc=new DaoCarre();
			dc.update((Carre) shape);
		}
		if (shape instanceof Rectangle)
		{
			DaoRectangle dr=new DaoRectangle();
			dr.update((Rectangle) shape);
			
		}
		if (shape instanceof Triangle)
		{
			DaoTriangle dt=new DaoTriangle();
			dt.update((Triangle) shape);
		}
		if (shape instanceof Cercle)
		{
			DaoCercle dc=new DaoCercle();
			dc.update((Cercle) shape);
		}
		
		
	}

}
