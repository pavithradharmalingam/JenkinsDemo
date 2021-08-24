package com.example.demo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCases {
	@BeforeAll
	public static void m1() {
		System.out.println("Executed BeforeALL and once");
	}
	@AfterAll
	public static void m2() {
		System.out.println("Execute AfterALL and once");
	}
	@AfterEach
	public  void m3() {
		System.out.println("Execute AfterEach testcase ");
	}
	@BeforeEach
	public  void m4() {
		System.out.println("Execute BeforeEach testcase ");
	}
	
	@Test
	public void testAddEmployee()
	{
		int result=EmployeeData.addEmployee(111,"sandeep");
		assertEquals(1,result);
				
	}
	

	@Test
	public void testUpdateEmployee()
	{
		int result=EmployeeData.addEmployee(111,"sandeep");
	String oldName=EmployeeData.updateEmployee(111,"pratheek");
		assertEquals("sandeep",oldName);				
	}
	

	@Test
	public void testfetchEmployee()
	{
		int result=EmployeeData.addEmployee(111,"sandeep");
		String ename=EmployeeData.fetchEmployee(111);
		assertEquals("sandeep",ename);
				
	}
	
	@Test
	public void testfetchAllEmployee()
	{
		int result=EmployeeData.addEmployee(111,"sandeep");
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		emp=EmployeeData.fetchAllEmployees();
		assertEquals(1,emp.size());
				
	}
	
	//@Test
	@Ignore
	public void testdiv()
	{
		System.out.println("test3");
		int result=EmployeeData.div(12,2);
		
		assertEquals(6,result);
	}
}
