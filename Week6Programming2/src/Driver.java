import java.util.ArrayList;
public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(14, "Steven Dimmit", "23 Ocean Ave"));
		students.add(new Student(23, "John Williams", "45 June Creek"));
		students.add(new Student(45, "Trent Stevenson", "32 Wilson Way"));
		students.add(new Student(11, "Freddy Baker", "32 Main Street"));
		students.add(new Student(15, "Joe Adams", "123 Jones Circle"));
		students.add(new Student(19, "Haley Collins", "321 Malcom Ave"));
		students.add(new Student(22, "Reid Smith", "14 Pitkin Street"));
		students.add(new Student(44, "Kim Johnson", "22 Stetson Ave"));
		students.add(new Student(17, "Alex Rapp", "1 Pikes Peak Way"));
		students.add(new Student(77, "Dayna Thomson", "5 Sherlin Drive"));
		
		SelectionSort.selectionSort(students, new ComparatorName());
		System.out.println("Students Sorted By Name:");
		printStudents(students);

		SelectionSort.selectionSort(students, new ComparatorRollNo());
		System.out.println("Students Sorted By RollNo:");
		printStudents(students);
	
		
	}
	public static void printStudents(ArrayList<Student> students) {
		for (Student student: students) {
			System.out.println(student.toString());
		}
	}
}
