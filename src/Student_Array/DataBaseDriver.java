package Student_Array;

public class DataBaseDriver {

	public static void main(String[] args) {
		DataBase DB1=new DataBase("Ganesh","root");
		DB1.islogin("ganesh", "root");
		DB1.addStudent("Ganesh", 21, 2025, "BE", 76, "B+", 'M', 11);
		DB1.addStudent("Rani", 31, 2025, "BE", 73, "A+", 'M', 10);
		DB1.addStudent("Ganesh", 41, 2025, "BE", 72, "B+", 'f', 12);
		DB1.addStudent("shrikant", 51, 2025, "BE", 40, "AB+", 'M', 13);
		DB1.addStudent("Tejas", 51, 2025, "BE", 41, "B+", 'M', 14);
		DB1.addStudent("om", 54, 2025, "BE", 43, "B+", 'M', 15);
		DB1.addStudent("Pratik", 25, 2025, "BE", 85, "AB-", 'F', 16);
		DB1.addStudent("Ajinkya", 18, 2025, "BE", 70, "B+", 'M', 18);
		DB1.addStudent("Raju", 17, 2025, "BE", 91, "B+", 'M', 17);
		DB1.addStudent("Neha", 23, 2025, "BE", 70, "O", 'f', 9);
		//DB1.displayDb();
		DB1.displayStudentSortedByMarksDesc();
		
		
		
	}

}
