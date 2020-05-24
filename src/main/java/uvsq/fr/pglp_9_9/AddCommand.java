package uvsq.fr.pglp_9_9;

import java.sql.SQLException;

public class AddCommand implements Command {

	CompositeShape shape;
	DrawableShape shape2;
	
	public AddCommand(CompositeShape dp,DrawableShape dp2)
	{
		shape=dp;
		shape2=dp2;
	}
	public void execute() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(shape);
		System.out.println(shape2);
		shape.ajouterShape(shape2);
		DaoComposite daoC=new DaoComposite();
		System.out.println(shape.nom);
		daoC.add(shape.nom, shape2);
		
	}

}
