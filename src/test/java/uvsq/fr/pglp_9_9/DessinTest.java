package uvsq.fr.pglp_9_9;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

public class DessinTest {

	@Test
	public void testCreationCercle() throws SQLException, IOException {
		DrawingTui tu=new DrawingTui();
		tu.nextCommand("UnRond=Cercle((0,0),5)").execute();
		DaoCercle cir=new DaoCercle();
		assert(cir.find("UnRond").centre.x==0 && cir.find("UnRond").centre.y==0 && cir.find("UnRond").rayon==5);
	}
	
	@Test
	public void testCreationCarre() throws SQLException, IOException {
		DrawingTui tu=new DrawingTui();
		tu.nextCommand("UnCarre=Carre((0,0),5)").execute();
		DaoCarre cir=new DaoCarre();
		assert(cir.find("UnCarre").centre.x==0 && cir.find("UnCarre").centre.y==0 && cir.find("UnCarre").cote==4);
	}
	
	@Test
	public void testCreationRectangle() throws SQLException, IOException {
		DrawingTui tu=new DrawingTui();
		tu.nextCommand("UnRect=Rectangle((0,0),5,5)").execute();
		DaoRectangle cir=new DaoRectangle();
		assert(cir.find("UnRect").centre.x==0 && cir.find("UnRect").centre.y==0 && cir.find("UnRect").longeur==5&& cir.find("UnRect").largeur==5);
	}
	
	@Test
	public void testCreationTriangle() throws SQLException, IOException {
		DrawingTui tu=new DrawingTui();
		tu.nextCommand("UnTriangle=Triangle((0,0),5,5,5)").execute();
		DaoTriangle cir=new DaoTriangle();
		assert(cir.find("UnTriangle").centre.x==0 && cir.find("UnTriangle").centre.y==0 && cir.find("UnTriangle").a==5&& cir.find("UnTriangle").b==5&& cir.find("UnTriangle").c==5);
	}
	
	@Test
	public void testCreationComposite() throws SQLException, IOException {
		DrawingTui tu=new DrawingTui();
		tu.nextCommand("UnComp=Composite((0,0))").execute();
		DaoComposite cir=new DaoComposite();
		assert(cir.find("UnComp")!=null);
	}

}
