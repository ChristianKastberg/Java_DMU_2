package opgaver;

import java.sql.*;

public class SQLAlle {

	public static void main(String[] args) {
		try {
			Connection minConnection;
			minConnection = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=AndebyBank;user=sa;password=Kastberg1;");

			Statement stmt = minConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // opretter
																															// statement
																															// object

//			ResultSet res = stmt.executeQuery("select navn, regNr from Afdeling");
			ResultSet res = stmt.executeQuery("select * from Afdeling");

			while (res.next()) {

				String navn = res.getString("navn");
				String regNr = res.getString("regNr");
				String adresse = res.getString("adresse");
				String tlfNr = res.getString("tlfNr");
				System.out.println(navn + " " + regNr + " " + adresse + " " + " " + tlfNr);
//				System.out.println(navn);
//				System.out.println(res.getString(1) + "    " + res.getString(2));

			}
			res.previous();
			res.previous();
//			System.out.println(res.getString(1) + "    " + res.getString(2));
			if (res != null)
				res.close();
			if (stmt != null)
				stmt.close();
			if (minConnection != null)
				minConnection.close();
		} catch (Exception e) {
			System.out.println("fejl:  " + e.getMessage());
		}
	}
}