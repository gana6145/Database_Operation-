package Student_Array;

public class DataBase {
	private String userName;
	private String password;
	private Student []db=new Student[10];
	private int size;
	public DataBase(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		System.out.println("Db created Successfully");
	} 
	public DataBase() {
		
	}
	boolean login;
	public boolean islogin(String user,String pass) {
		if(this.userName.equalsIgnoreCase(user) && this.password.equalsIgnoreCase(pass)) {
			login=true;
			System.out.println("login successful.");
			return login;
			
		}
		
		System.out.println("invalid Credentials");
		return false;
		
	}
	public boolean addStudent(String name,int age,int year,String degree,int marks,String blood,char gender,int roll) {
		if(login) {
			if(size<db.length-0.7) {
				db[size]=new Student(name,age,year,degree,marks,blood,gender,roll);
				size++;
				
				return true;
			}
			else {
				Student temp[]=new Student[size*2];
				for(int i=0;i<size;i++) {
					temp[i]=db[i];
					
				}
				db=temp;
				db[size]=new Student(name,age,year,degree,marks,blood,gender,roll);
				size++;
				return true;
				
			}
			
		}
		else {
			System.out.println("First login to do operation");
			return false;
		}
		
	}
 public void displayDb() {
	 if(login) {
		 for(int i=0;i<size;i++) {
			 db[i].displayStudent();
		 }
		 
	 }
	 else {
		 System.out.println("please Login");
		 
	 }
	
 }
 public void displayDb(Student arr[]) {
	 if(login) {
		 for(int i=0;i<size;i++) {
			 arr[i].displayStudent();
		 }
		 
	 }
	 else {
		 System.out.println("please Login");
		 
	 }
	
 }
 public void searchByName(String name) {
	 if(login)
	 {
		 int i;
		 for(i=0;i<size;i++) {
			if(db[i].name.equalsIgnoreCase(name)) {
				db[i].displayStudent();
				break;
			}
		 }
		 if(i==size) {
			 
			 System.out.println("Student not exist");
		 }
		 
	 }
	 else {
		 System.out.println("please Login");
		 
	 }
 }
 
 public void displayStudentSortedByRollNo() {
	 Student [] arr=sortByRollNo();
	 displayDb(arr);
	 
 }
 
 private Student[] sortByRollNo() {
	 Student[] temp=new Student[size];
	 for(int i=0;i<size;i++) {
		 temp[i]=db[i];
	 }
	 
	 for(int i=0;i<size;i++) {
		 for(int j=i+1;j<size;j++) {
			 if(temp[i].roll>temp[j].roll) {
				 Student a=temp[i];
				 temp[i]=temp[j];
				 temp[j]=a;
				 
			 }
		 }
		 
	 }
	 return temp;
	 
	 
	 
 }
 public void displayStudentSortedByMarks() {
	 Student [] arr=sortByMarks();
	 displayDb(arr);
	 
 }
 
 private Student[] sortByMarks() {
	 Student[] temp=new Student[size];
	 for(int i=0;i<size;i++) {
		 temp[i]=db[i];
	 }
	 
	 for(int i=0;i<size;i++) {
		 for(int j=i+1;j<size;j++) {
			 if(temp[i].marks>temp[j].marks) {
				 Student a=temp[i];
				 temp[i]=temp[j];
				 temp[j]=a;
				 
			 }
		 }
		 
	 }
	 return temp;
	 
	 
	 
 }
 public void displayStudentSortedByMarksDesc() {
	 Student [] arr=sortByMarksDesc();
	 displayDb(arr);
	 
 }
 private Student[] sortByMarksDesc() {
	 Student[] temp=new Student[size];
	 for(int i=0;i<size;i++) {
		 temp[i]=db[i];
	 }
	 
	 for(int i=0;i<size;i++) {
		 for(int j=i+1;j<size;j++) {
			 if(temp[i].marks<temp[j].marks) {
				 Student a=temp[i];
				 temp[i]=temp[j];
				 temp[j]=a;
				 
			 }
		 }
		 
	 }
	 return temp;
	 
	 
	 
 }
 
 public void displayStudentSortedByname() {
	 Student [] arr=sortByName();
	 displayDb(arr);
	 
 }
 
 private Student[] sortByName() {
	 Student[] temp=new Student[size];
	 for(int i=0;i<size;i++) {
		 temp[i]=db[i];
	 }
	 
	 for(int i=0;i<size;i++) {
		 for(int j=i+1;j<size;j++) {
			 if(temp[i].name.compareToIgnoreCase(temp[j].name) > 0) {
				 Student a=temp[i];
				 temp[i]=temp[j];
				 temp[j]=a;
				 
			 }
		 }
		 
	 }
	 return temp;
	 
	 
	 
 }
 
}
