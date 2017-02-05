package homework3;

public class Student extends Human {
	private String faculty;
	private int course;
	private int studentID;

	public Student() {
		super();
	}

	public Student(String name, String surname, String gender, double weight, int age, String faculty, int course,
			int studentID) {
		super(name, surname, gender, weight, age);
		this.faculty = faculty;
		this.course = course;
		this.studentID = studentID;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return getName() + ' ' + getSurname() + ", " + getGender() + ", " + "Weight: " + getWeight() + ", " + "age: " + getAge() + ", faculty: "
				+ faculty + ", course: " + course + ", student ID: " + studentID;
	}

}
