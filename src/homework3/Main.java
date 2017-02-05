package homework3;

public class Main {

	public static void main(String[] args) throws Exception {
		Group group = new Group();
		group.addStudent(new Student("Ivan", "Zhukovsky", "male", 78.6, 17, "FEA", 3, 1234098));
		group.addStudent(new Student("Vasiliy", "Muraviev", "male", 80.6, 25, "FIOT", 5, 4321098));
		group.addStudent(new Student("Zhana", "Ivanova", "female", 60.3, 21, "FEA", 3, 1658298));
		group.addStudent(new Student("Stepan", "Babushkin", "male", 75.6, 19, "FEA", 3, 3578418));
		group.addStudent(new Student("Irina", "Ilyina", "female", 58.2, 22, "FEA", 5, 2587416));
		group.addStudent(new Student("Andrey", "Zaytsev", "male", 83.6, 30, "FEA", 2, 8756142));
		group.addStudent(new Student("Leonid", "Kovalsky", "male", 70.8, 22, "FEA", 2, 9658234));
		group.addStudent(new Student("Oleg", "Stroyev", "male", 86.2, 28, "FEA", 4, 7462581));
		group.addStudent(new Student("Tatyana", "Terentyeva", "female", 65.1, 20, "FEA", 2, 3596471));
		group.addStudent(new Student("Shura", "Shishkina", "female", 70.0, 29, "FEA", 5, 2556389));
		// group.addStudent(new Student("Yulia", "Tyurina", "female", 60.6, 33,
		// "FEA", 1, 7554118));
		// group.addStudent(new Student("Pavel", "Lapshin", "male", 79.0, 31,
		// "FEA", 1, 5200136));
		// group.addStudent(new Student("Ruslan", "Nuriyev", "male", 75.7, 26,
		// "FEA", 4, 9856987));
		// group.addStudent(new Student("Zhanna", "Strizh", "female", 63.1, 20,
		// "FEA", 4, 1523647));

		System.out.println(group);
		group.delStudent(new Student("Leonid", "Kovalsky", "male", 70.8, 22, "FEA", 2, 9658234));
		// System.out.println(group);
		// group.addStudent(new Student("Zhanna", "Strizh", "female", 63.1, 20,
		// "FEA", 4, 1523647));
		// System.out.println(group);
		// group.searchStudent("Babushkin");

		// group.sortGroup(5);

		// System.out.println("Add student, input from the keyboard!");
		// System.out.println(
		// "String name, String surname, String gender, double weight, int age,
		// String faculty, int course, int studentID");
		//
		// group.keyboardInput();

		System.out.println(group);

		Commissar reservists = group.getReservist();
		System.out.println("Group reservists: " + reservists);
	}
}
