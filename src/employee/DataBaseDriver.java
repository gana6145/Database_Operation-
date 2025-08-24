package employee;

public class DataBaseDriver {

	public static void main(String[] args) {
		DataBase emp=new DataBase("scott","tiger");
		emp.addEmployee("SMITH", 7369, 7902, 800, "CLERK","17-DEC-80", 0, 20);
		emp.addEmployee("ALLEN", 7499, 7698, 1600, "SALESMAN", "20-FEB-81", 300, 30);
        emp.addEmployee("WARD", 7521, 7698, 1250, "SALESMAN", "22-FEB-81", 500, 30);
        emp.addEmployee("JONES", 7566, 7839, 2975, "MANAGER", "02-APR-81", 0, 20);
        emp.addEmployee("MARTIN", 7654, 7698, 1250, "SALESMAN", "28-SEP-81", 1400, 30);
        emp.addEmployee("BLAKE", 7698, 7839, 2850, "MANAGER", "01-MAY-81", 0, 30);
        emp.addEmployee("CLARK", 7782, 7839, 2450, "MANAGER", "09-JUN-81", 0, 10);
        emp.addEmployee("SCOTT", 7788, 7566, 3000, "ANALYST", "19-APR-87", 0, 20);
        emp.addEmployee("KING", 7839, 0, 5000, "PRESIDENT", "17-NOV-81", 0, 10);
        emp.addEmployee("TURNER", 7844, 7698, 1500, "SALESMAN", "08-SEP-81", 0, 30);
        emp.addEmployee("ADAMS", 7876, 7788, 1100, "CLERK", "23-MAY-87", 0, 20);
        emp.addEmployee("JAMES", 7900, 7698, 950, "CLERK", "03-DEC-81", 0, 30);
        emp.addEmployee("FORD", 7902, 7566, 3000, "ANALYST", "03-DEC-81", 0, 20);
        emp.addEmployee("MILLER", 7934, 7782, 1300, "CLERK", "23-JAN-82", 0, 10);
		
		emp.displayEmp();
		//emp.displayEmpByDeptno(10);
		//emp.displayEmployeeByEmno(7698);
		//emp.displayEmployeeUnderEmployee("BLAKE");
		//emp.showEmployeeBySal(800);
		//emp.serachEmpbySalRange(800, 2000);
        //emp.updateEmployeeDetails();
       // emp.displayEmployeeByEmno(7369);
		emp.deleteEmployee();
		emp.deleteEmployee();
		emp.displayEmp();
        
        
		
	}

}
