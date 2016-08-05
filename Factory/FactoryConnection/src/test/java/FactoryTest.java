
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.danielsmanioto.factory.connection.ConnectionFactory;

public class FactoryTest {

	@Test
	public void conectarBancoDeDados() throws SQLException {
		Connection c = new ConnectionFactory().getConnection();
		PreparedStatement ps = c.prepareStatement("select * from jpa_t_clientes");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("nome"));
		}

		rs.close();
		c.close();
	}

}
