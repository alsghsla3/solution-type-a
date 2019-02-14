package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
	}

	@Override
	public void resize(double rate) {
	}

	@Override
	public double getArea() {
		width =3;
		height= 5;
		double result =  ((width * height) /2);
		return result;
	}

	@Override
	public double getPerimeter() {
		return 1.;
	}
}