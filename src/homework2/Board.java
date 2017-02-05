package homework2;

import java.util.Arrays;

public class Board {
	private Shape[] sh = new Shape[4];

	public Board() {
		super();
	}

	public Board(Shape[] sh) {
		super();
		this.sh = sh;
	}

	public boolean addShape(Shape shape, int n) {
		if (sh[n] == null) {
			sh[n] = shape;
			return true;
		} else {
			System.out.println("The cell is occupied");
			return false;
		}
	}

	public boolean deleteShape(int n) {
		if ((0 <= n) & (n <= 3)) {
			this.sh[n] = null;
			System.out.println("Shape removed!");
			return true;
		} else {
			return false;
		}
	}

	public void getSumArea() {
		double ar = 0;
		for (Shape shape : sh) {
			if (shape != null) {
				System.out.println(shape.getArea());
				ar += shape.getArea();
			}
		}
		System.out.println("Summary Area = " + ar);

	}

	@Override
	public String toString() {
		return "Board [sh = " + Arrays.toString(sh) + "]";
	}

}