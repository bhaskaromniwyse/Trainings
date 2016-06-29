package com.test5;
import org.junit.Test;

import com.assignment5.ManagingEmployeeBinaryFile;

public class TestManagingEmployeeBinaryFile {

	@Test
	public void testaddEmployee() throws Exception {
		ManagingEmployeeBinaryFile  emp = new ManagingEmployeeBinaryFile();
		emp.manageEmployee();		
	}

	/*@Test
	public void testdisplayEmployeeList() throws NumberFormatException, IOException {
		ManagingEmployeeBinaryFile  emp = new ManagingEmployeeBinaryFile();
		emp.displayEmployeeList();		
	}
	

	@Test
	public void testeditEmployee() throws NumberFormatException, IOException {
		ManagingEmployeeBinaryFile  emp = new ManagingEmployeeBinaryFile();
		emp.editEmployee();	
	}
	
	@Test
	public void testremoveEmployee() throws NumberFormatException, IOException {
		ManagingEmployeeBinaryFile  emp = new ManagingEmployeeBinaryFile();
		emp.removeEmployee();	
	}*/
}
