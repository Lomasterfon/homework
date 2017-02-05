package homework2;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(2, 0), new Point(1, 0), new Point(3, 1));
		Shape[] arrayShape = new Shape[4];
		arrayShape[0] = triangle;
		arrayShape[1] = null;
		arrayShape[2] = null;
		arrayShape[3] = null;

		Board br = new Board(arrayShape);

		br.getSumArea();
		br.deleteShape(0);
		br.getSumArea();
		br.addShape(triangle, 3);
		br.addShape(triangle, 2);
		br.getSumArea();
	}

}
