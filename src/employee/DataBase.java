package employee;

import java.util.Scanner;

public class DataBase {
	private String userName;
	private String password;
	private Employee []employeeDB=new Employee[10];
	
	private int size;
	private boolean islogin;
	Scanner scan=new Scanner(System.in);
	public DataBase(String userName, String password) {
		super();
		this.userName=userName;
		this.password=password;
		System.out.println("connected");
		islogin=true;
		
	} 
	public DataBase() {
		
	}
	public void addEmployee(String ename,int empno,int mgr,int sal,String job,String  hiredate,int comm,int deptno) {
		if(islogin) {
			if(employeeDB.length-size>employeeDB.length*0.7) {
				employeeDB[size]=new Employee(ename,empno,mgr,sal,job,hiredate,comm,deptno);
				size++;
			}
			else {
				Employee [] arr=new Employee[size*2];
				for(int i=0;i<size;i++) {
					arr[i]=employeeDB[i];
				}
				employeeDB=arr;
				employeeDB[size]=new Employee(ename,empno,mgr,sal,job,hiredate,comm,deptno);
				size++;
		}
		}
		
		
	}
	
	public void displayEmp() {
		for(int i=0;i<size;i++) {
			System.out.println(employeeDB[i]);
		}
	}
	public void displayEmpByDeptno(int deptno) {
		for(int i=0;i<size;i++) {
			if(employeeDB[i].deptno==deptno) {
				System.out.println(employeeDB[i]);
			}
			}
		}
	
	public void displayEmployeeByEmno(int empno) {
		for(int i=0;i<size;i++) {
			if(employeeDB[i].empno==empno) {
				System.out.println(employeeDB[i]);
			}
			}
		
	}
	public void displayEmployeeUnderEmployee(String ename) {
		int empno = 0;
		for(int i=0;i<size;i++) {
			if(employeeDB[i].ename.equalsIgnoreCase(ename)) {
				empno=employeeDB[i].empno;
				}
			
			}
		for(int i=0;i<size;i++) {
			
			if(employeeDB[i].mgr==empno) {
				System.out.println(employeeDB[i]);
				
			}
			
			}
	
	}
	private  Employee [] sortBy() {
		Employee [] arr=new Employee[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=employeeDB[i];
		}
		return arr;
		
		
	}
	public void showEmployeeBySal(int  sal) {
		for(int i=0;i<size;i++) {
			if(employeeDB[i].sal==sal) {
				System.out.println(employeeDB[i]);
				
			}
		}
	}
	public void serachEmpbySalRange(int a,int b) {
		for(int i=0;i<size;i++) {
			if(employeeDB[i].sal>a && employeeDB[i].sal<b) {
				System.out.println(employeeDB[i]);
				
			}	}
	}
	
	public void updateEmployeeDetails() {
		System.out.println("Enter a employee number to update details:");
		int empno1=scan.nextInt();
		int i;
		for(i=0;i<size;i++) {
			if(employeeDB[i].empno==empno1) {
				break;
			}
		}
		
			if(i==size) {
				System.out.println("Employee not exist");
			
		}
			else {
				System.out.println("Enter 1 to update manager,2 for sal,3 for commission,4 for the designation,5 for the deptno");
				int num=scan.nextInt();
				switch(num) {
				case 1:{
					System.out.println("Enter a mgr number to set new ");
					int nMgr=scan.nextInt();
					employeeDB[i].mgr=nMgr;
					System.out.println("mgr no update successfully");
				}
				break;
				case 2:{
					System.out.println("Enter a sal  to set new Sallary:");
					int nMgr=scan.nextInt();
					employeeDB[i].sal=nMgr;
					System.out.println("sal updated  successfully");
				}
				break;
				case 3:{
					System.out.println("Enter a commission  to set new commission:");
					int nMgr=scan.nextInt();
					employeeDB[i].comm=nMgr;
					System.out.println("commission updated  successfully");
				}
				break;
				case 4:{
					System.out.println("Enter a commission  to set new commission:");
					String job=scan.next();
					employeeDB[i].job=job;
					System.out.println("job updated  successfully");
				}
				break;
				case 5:{
					System.out.println("Enter a deptno  to set new deptno;:");
					int  no=scan.nextInt();
					employeeDB[i].deptno=no;
					System.out.println("job updated  successfully");
				}
				break;
				
				}
			}
		
	}
	 public void deleteEmployee() {
		 System.out.println("Enter a empno to delete the employee:");
		 Employee temp[]=new Employee[employeeDB.length];
		 int empNo=scan.nextInt();
		 int index=-1;
		 for(int i=0;i<size;i++) {
			 if(employeeDB[i].empno==empNo) {
				 index=i;
				 break;
				 
		 }
		 }
			 if(index!=-1) {
				 for(int j=0;j<size;j++) {
					 if(j==index) {
						 continue;
					 }
					 if(j>index) {
						 temp[j-1]=employeeDB[j];
						 
					 }
					 else {
						 temp[j]=employeeDB[j];
                     }
					 
					 
				 }
				 
				 employeeDB=temp;
				 size--;
				 System.out.println("Employee Deleted Successfully");
			 }
			 else {
				 System.out.println("Employee not exist");
			}
	
		 
	}
}
	
	

