package homework2;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private double perimetr;
	private double area;
	private boolean check;

	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		perimetr = getLengthAB(a, b) + getLengthBC(b, c) + getLengthCA(c, a);
		double p = perimetr / 2;
		area = Math.sqrt((p - getLengthAB(a, b)) * (p - getLengthBC(b, c)) * (p - getLengthCA(c, a)) * p);
		
		if ((getLengthAB(a, b) + getLengthBC(b, c)) > getLengthCA(c, a)
				&& (getLengthBC(b, c) + getLengthCA(c, a)) > getLengthAB(a, b)
				&& (getLengthCA(c, a) + getLengthAB(a, b)) > getLengthBC(b, c)) {
			setCheck(true);
		}

	}

	private static double getLengthAB(Point a, Point b) {
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}

	private static double getLengthBC(Point b, Point c) {
		return Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
	}

	private static double getLengthCA(Point a, Point c) {
		return Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double getPerimetr() {
		return perimetr;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [a = " + a + ", b = " + b + ", c = " + c + ", getPerimetr() = " + getPerimetr()
				+ ", gettArea() = " + getArea() + "]";
	}

}
