public class Student {
	private int rollNo;
	private String name;
	private String address;

	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "RollNo: " + this.getRollNo() + ", Name: " + this.getName() + ", Address: " + this.getAddress();
	}
}