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
				System.out.println("Student added Successfully");
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
}
