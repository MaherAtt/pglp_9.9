package uvsq.fr.pglp_9_9;

import java.sql.SQLException;

public class CreateCommand implements Command {

	DrawableShape shape;
	
	public CreateCommand(DrawableShape dp)
	{
		shape=dp;
	}
	
	public void execute() throws SQLException {
		// TODO Auto-generated method stub
		if (shape instanceof CompositeShape)
		{
			DaoComposite dac=new DaoComposite();
			dac.create((CompositeShape) shape);
		}
		if (shape instanceof Carre)
		{
			DaoCarre dc=new DaoCarre();
			dc.create((Carre) shape);
		}
		if (shape instanceof Rectangle)
		{
			DaoRectangle dr=new DaoRectangle();
			dr.create((Rectangle) shape);
			
		}
		if (shape instanceof Triangle)
		{
			DaoTriangle dt=new DaoTriangle();
			dt.create((Triangle) shape);
		}
		if (shape instanceof Cercle)
		{
			DaoCercle dc=new DaoCercle();
			dc.create((Cercle) shape);
		}
	}

}
