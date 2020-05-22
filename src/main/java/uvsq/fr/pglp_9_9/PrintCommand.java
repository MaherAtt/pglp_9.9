package uvsq.fr.pglp_9_9;

import java.sql.SQLException;

public class PrintCommand implements Command {

	DrawableShape shape;
	
	public PrintCommand(DrawableShape sp)
	{
		shape=sp;
	}

	public void execute() throws SQLException {
		// TODO Auto-generated method stub
		shape.draw();
		
	}
}
