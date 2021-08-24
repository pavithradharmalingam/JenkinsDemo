package com.example.demo;
import java.util.HashMap;

public class EmployeeData {
	static	HashMap<Integer,String> emps=new HashMap<Integer,String>();
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int addEmployee(int empId ,String empName)
	{
		emps.put(empId,empName);
	return	emps.size();//1
	}
	public static String  updateEmployee(int empId ,String empName)
	{
		return emps.put(empId,empName); //returns previous employee's name that is overridden
	//return	emps.size();//1
	}
	public static String fetchEmployee(int empId)
	{
		System.out.println(emps.get(empId));
		return emps.get(empId);
	//return	emps.size();//1
	}
	public static HashMap<Integer,String> fetchAllEmployees()
	{
		return emps;
	//return	emps.size();//1
	}
}

