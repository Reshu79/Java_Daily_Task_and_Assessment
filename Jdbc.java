package controller2;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model2.Get_set;
import model2.DBconnection;
import controller2.Jsp_2;

public class Jdbc {
	String insert="insert into employee values(?,?,?,?,?,?);";
	public String toInsert(Get_set gs) throws ClassNotFoundException {
		String result=null;
		try {
			Connection conn=DBconnection.dbconnection();
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1, gs.getId());
			ps.setString(2, gs.getName());
			ps.setInt(3, gs.getAge());
			ps.setString(4, gs.getDept());
			ps.setLong(5, gs.getSalary());
			ps.setString(6, gs.getEmail());
			int row=ps.executeUpdate();
			if(row==1) {
				result="Registration success....";
			}
			else {
				result="Registration failed....";
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	String display="select * from employee;";
	public ArrayList<Get_set> toDisplay() throws ClassNotFoundException {
		Connection conn=DBconnection.dbconnection();
		ArrayList<Get_set>values=new ArrayList<>();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(display);
			while(rs.next()) {
				Get_set gs=new Get_set();
				gs.setId(rs.getInt("id"));
				gs.setName(rs.getString("name"));
				gs.setAge(rs.getInt("age"));
				gs.setDept(rs.getString("dept"));
				gs.setSalary(rs.getInt("salary"));
				gs.setEmail(rs.getString("email"));
				values.add(gs);
				Jsp_2 js=new Jsp_2();
				
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return values;
	}
	
	String update="update employee set dept=?,salary=? where id=?";
	public String toUpdate(Get_set gs) throws ClassNotFoundException {
		Connection conn=DBconnection.dbconnection();
		String result=null;
		try {
			PreparedStatement ps=conn.prepareStatement(update);
			ps.setString(1, gs.getDept());
			ps.setLong(2,gs.getSalary());
			ps.setInt(3, gs.getId());
			int row=ps.executeUpdate();
			if(row==1) {
				result="Updated Successfully";
			}
			else {
				result="Updation failed";
			}
		}catch(SQLException e) {
			System.out.println("error"+e.getMessage());
		}
		return result;
	}
	
	String delete="delete from employee where id=?;";
	public String toDelete(Get_set gs) throws ClassNotFoundException {
		Connection conn=DBconnection.dbconnection();
		String result=null;
		try {
			PreparedStatement ps=conn.prepareStatement(delete);
			ps.setInt(1,gs.getId());
			int row=ps.executeUpdate();
			if(row==1) {
				result="Record wad deleted successfully";
			}
			else {
				result="Incorrect datas";
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	String search="select * from employee where dept=?;";
	public ArrayList<Get_set> toSearch(String dept) throws ClassNotFoundException {
		Connection conn=DBconnection.dbconnection();
		ArrayList<Get_set>data=new ArrayList<>();
		try {
			PreparedStatement ps=conn.prepareStatement(search);
			ps.setString(1,dept);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Get_set gs=new Get_set();
				gs.setId(rs.getInt("id"));
				gs.setName(rs.getString("name"));
				gs.setAge(rs.getInt("age"));
				gs.setDept(rs.getString("dept"));
				gs.setSalary(rs.getLong("salary"));
				gs.setEmail(rs.getString("email"));;
				data.add(gs);
				
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return data;
		}

}
