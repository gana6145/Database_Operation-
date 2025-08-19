package Student_Array;

public class Student {
	String name;
	int age;
	int year;
	String degree;
	final String college="CWIT";
	String blood;
	char gender;
	int roll;
	int marks;
	
	
	public Student() {
	
	}
	public Student(String name,int age,int year,String degree,int marks,String blood,char gender,int roll) {
		this.name=name;
		this.age=age;
		this.year=year;
		this.degree=degree;
		this.marks=marks;
		this.blood=blood;
		this.gender=gender;
		this.roll=roll;
		
	
	}
	@Override
	public String toString() {
		return "[ Student name : " +name + " Age: "+age + " Year: "+ year+ " degree : " + degree + " Marks: " + marks 
				+ " Blood:"+ blood+" Gender:" + gender + "Roll no: " + roll + " ]" ;
		
	}
	public void displayStudent() {
		System.out.println("----Student details----");
		System.out.println("Name:" + name);
		System.out.println("Roll No:" + roll);
		System.out.println("Age:" + age);
		System.out.println("Year:" + year);
		System.out.println("Degree:" + degree);
		System.out.println("Marks:" + marks);
		System.out.println("Blood:" + blood);
		System.out.println("Gender:" + gender);
		System.out.println("---------------------------------");
		
		
		
	}

}
