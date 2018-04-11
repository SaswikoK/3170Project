import java.util.Scanner;
import java.sql.*;
import java.io.*;
public class CSCI3170Proj {

	public static String dbAddress = "jdbc:mysql://projgw.cse.cuhk.edu.hk:2312/db00";
	public static String dbUsername = "Group10";
	public static String dbPassword = "";

	public static Connection connectToOracle(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbAddress, dbUsername, dbPassword);
		} catch (ClassNotFoundException e){
			System.out.println("[Error]: Java MySQL DB Driver not found!!");
			System.exit(0);
		} catch (SQLException e){
			System.out.println(e);
		}
		return con;
	}

}