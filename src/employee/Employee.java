package employee;

public class Employee {
	String ename;
	int empno;
	int mgr;
	int sal;
	String job;
	String  hiredate;
	int comm;
	int deptno;
	
	
	public Employee(String ename,int empno,int mgr,int sal,String job,String  hiredate,int comm,int deptno) {
		this.ename=ename;
		this.empno=empno;
		this.sal=sal;
		this.mgr=mgr;
		this.job=job;
		this.deptno=deptno;
		this.hiredate=hiredate;
		this.comm=comm;
	}
    public Employee() {
		
	}
	public String toString() {
		return "[EMPNO : "+empno +" ENAME : " +ename +" JOB : " +job + " MGR:" +mgr + " HIREDATE: " + hiredate+
				" SAL:" + sal+ " COMM: "+comm+" DEPTNO:"+deptno + "]";
	}
	

}
