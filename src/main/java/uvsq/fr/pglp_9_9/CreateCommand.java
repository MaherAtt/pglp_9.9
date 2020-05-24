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
			if(dac.find(shape.nom)!=null) dac.update((CompositeShape) shape);
			else
			dac.create((CompositeShape) shape);
		}
		if (shape instanceof Carre)
		{
			DaoCarre dc=new DaoCarre();
			if(dc.find(shape.nom)!=null) dc.update((Carre) shape);
			else
			dc.create((Carre) shape);
		}
		if (shape instanceof Rectangle)
		{
			DaoRectangle dr=new DaoRectangle();
			if(dr.find(shape.nom)!=null) dr.update((Rectangle) shape);
			else
			dr.create((Rectangle) shape);
			
		}
		if (shape instanceof Triangle)
		{
			DaoTriangle dt=new DaoTriangle();
			if(dt.find(shape.nom)!=null) dt.update((Triangle) shape);
			else
			dt.create((Triangle) shape);
		}
		if (shape instanceof Cercle)
		{
			DaoCercle dc=new DaoCercle();
			if(dc.find(shape.nom)!=null) dc.update((Cercle) shape);
			else
			dc.create((Cercle) shape);
		}
	}

}
