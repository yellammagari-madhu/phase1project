package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrasactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Load the DB
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connect the DB
		String dburl = "jdbc:mysql://localhost:3306/movies";
		String username = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(dburl, username, password);
		System.out.println("Succesfully connected");

		String q1 = "insert into movies values('movie10','Anaimation','Director_Ani', 2023)";
		String q2 = "update movies set Director='Mohit' where Title='movie10'";
		String q3 = "delete from movies where title='newmovie'";

		boolean flag = false;

		conn.setAutoCommit(false);

		Statement stmt = conn.createStatement();

		stmt.addBatch(q1);
		stmt.addBatch(q2);
		stmt.addBatch(q3);

		int[] result = stmt.executeBatch();

		for (int i = 0; i < result.length; i++) {

			System.out.println(i);

			if (result[i] == 0) {

				flag = true;
				break;
			}

		}
		if (flag == false) {

			conn.commit();
			System.out.println("Transaction Successful");
		} else {

			conn.rollback();
			System.out.println("Transaction is not Successful");
		}

		conn.close();

	}

}