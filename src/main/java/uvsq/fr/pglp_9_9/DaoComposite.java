package uvsq.fr.pglp_9_9;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoComposite  extends Dao<CompositeShape>{

	

		public DaoComposite() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean create(CompositeShape obj) throws SQLException {
			// TODO Auto-generated method stub
			String query = " insert into Composite (nom, fils)"
			        + " values (?, ?)";
			PreparedStatement preparedStmt = null;
			try {
				preparedStmt = connect.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      preparedStmt.setString (1, obj.nom);
		      preparedStmt.setString (2, "");
		      preparedStmt.execute();
			return false;
		}

		@Override
		public boolean delete(CompositeShape obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean update(CompositeShape obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public CompositeShape find(int id) {
			// TODO Auto-generated method stub
			return null;
			
		}
}
