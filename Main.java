package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  KGF-2 ","  YASH  "," Srindhi Shetty ",2022," Prashanth Neel ");
	insert("  COMALI  ","Jayam Ravi"," Kajal Aggarwal ",2019," Pradeep Ranganathan ");
	insert(" WAR "," Kabir "," Naina ",2019," Siddarth Anand ");
	insert(" D-16 "," Santhosh Krishna "," Anjana Jayaprakash ",2016,"Karthick Naren");
	insert("    KAITHI  "," Karthi "," Deepthi ",2019,"Lokesh Kanagaraj");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
