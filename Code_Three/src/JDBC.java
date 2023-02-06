import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", "root", "Sid@9915519442");
			PreparedStatement ps= conn.prepareStatement("insert into employee value(?,?,?)");
			
			ps.setInt(1, 2);
			ps.setString(2, "Joti");
			ps.setDouble(3, 231.3);

			int x=ps.executeUpdate();
			if(x!=0) {
				System.out.println("inserted succesfully");
			}else {
				System.out.println("Problem with query");
			}
		}
		catch(SQLException g) {
			System.out.println(g.getMessage());
		}finally {
			try {
				conn.close();
			}catch(SQLException r) {
				System.out.println(r.getMessage());
			}
		}
	}

}
