package employee;

public class DataBase {
	private String userName;
	private String password;
	private Employee []employeeDB=new Employee[10];
	
	private int size;
	private boolean islogin;
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
	
	
		
	}
	
	

