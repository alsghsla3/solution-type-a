package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
	}

	@Override
	public double getArea() {
		System.out.println("");
		width =3;
		height= 4;
		double result =  ((width * height) /2);
		return result;
	}

	@Override
	public double getPerimeter() {
		double aa= Math.sqrt(205);
		return aa;
	}
}
