package com.assignment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ManagingEmployeeBinaryFile {
	public ArrayList<Employee> list;
	static ManagingEmployeeBinaryFile memp;
	static String filePath = "E:\\myfile.txt";
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void manageEmployee() throws Exception {
		int n;
		List<Employee> list = new ArrayList<Employee>();
		memp = new ManagingEmployeeBinaryFile();

		System.out.println("1= addemployee,  2=printallemployees, 3=editemployee,\n 4=deleteemployee, 5=to exit");
		System.out.println("choose u r action");

		n = Integer.parseInt(br.readLine());

		do {
			switch (n) {
			case 1:
				memp.addEmployee();
				break;
			case 2:
				memp.displayEmployeeList();
				break;
			case 3:
				memp.editEmployee();
				break;

			case 4:
				memp.removeEmployee();
				break;
			default:
				System.out.println("enter proper value");

			}
			System.out.println("choose u r action");
			System.out.println("1= addemployee,  2=printallemployees, 3=editemployee,\n 4=deleteemployee, 5=to exit");
			n = Integer.parseInt(br.readLine());
		} while (n != 5);

	}
	
	public void displayEmployeeList(){
		list = (ArrayList<Employee>) memp.readFromFile(filePath);
		memp.printlist(list);
	}

	public void removeEmployee() throws NumberFormatException, IOException {
		System.out.println("enter employee id to remove");
		int id = Integer.parseInt(br.readLine());
		list = (ArrayList<Employee>) memp.readFromFile(filePath);
		for (int i = 0; i < list.size(); i++)
			if (id == list.get(i).getEmpID()) {
				System.out.println("deleting");
				list.remove(list.get(i));
				break;
			}
		memp.writeToFile(list, filePath);
	}

	public void addEmployee() throws NumberFormatException, IOException {

		System.out.println("enter empid");
		int id = Integer.parseInt(br.readLine());
		System.out.println("enter empname");
		String name = br.readLine();
		System.out.println("enter salry");
		double sal = Integer.parseInt(br.readLine());
		System.out.println("enter job");
		String job = br.readLine();
		System.out.println("enter dept");
		String dept = br.readLine();
		list = (ArrayList<Employee>) memp.readFromFile(filePath);
		list.add(new Employee(id, name, sal, job, dept));
		memp.writeToFile(list, filePath);

	}

	public void editEmployee() throws NumberFormatException, IOException {
		System.out.println("enter employee id to edit");
		int id = Integer.parseInt(br.readLine());
		list = (ArrayList<Employee>) memp.readFromFile(filePath);
		for (int i = 0; i < list.size(); i++)
			if (id == list.get(i).getEmpID()) {
				System.out.println("editing");
				Employee editemp = list.get(i);

				System.out.println("enter new name");
				String name = br.readLine();
				editemp.setEmpName(name);
				
				System.out.println("enter new job");
				String job = br.readLine();
				editemp.setJob(job);

				list.add(i, editemp);
				list.remove(i + 1);
				break;
			}
		memp.writeToFile(list, filePath);
	}

	private static void printlist(List<Employee> employs) {
		// TODO Auto-generated method stub
		System.out.println("empid \t name \t  sal \t       job \tdept");
		for (Employee p : employs) {
			System.out.println(p.getEmpID() + "\t" + p.getEmpName() + "\t " + p.getSal() + " \t" + p.getJob()
					+ "\t" + p.getDept());
		}
	}

	private List<Employee> readFromFile(String filePath) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		Scanner inFile = null;
		try {
			inFile = new Scanner(new File(filePath));
			while (inFile.hasNext()) {
				Employee emp = new Employee();
				emp.setEmpID(inFile.nextInt());
				emp.setEmpName(inFile.next());
				emp.setSal(inFile.nextDouble());
				emp.setJob(inFile.next());
				emp.setDept(inFile.next());
				list.add(emp);
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening file.");
			fileNotFoundException.printStackTrace();
		} catch (NoSuchElementException noSuchElementException) {
			System.err.println("Error in file record structure");
			noSuchElementException.printStackTrace();
		} catch (IllegalStateException illegalStateException) {
			System.err.println("Error reading from file.");
			illegalStateException.printStackTrace();
		} finally {
			if (inFile != null)
				inFile.close();
		}
		return list;
	}

	private void writeToFile(List<Employee> list2, String filePath) {
		// TODO Auto-generated method stub
		Formatter outFile = null;
		try {
			outFile = new Formatter(filePath);
			for (Employee p : list2) {
				outFile.format("%d %s %f %s %s \n", p.getEmpID(), p.getEmpName(), p.getSal(), p.getJob(), p.getDept());
			}

		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error creating file.");
		} catch (FormatterClosedException formatterClosedException) {
			System.err.println("Error writing to file.");
		} finally {
			if (outFile != null)
				outFile.close();
		}
	}
}