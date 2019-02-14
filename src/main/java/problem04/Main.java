package problem04;

public class Main {
	public static void main(String[] args) {
		int a = (int)(Math.random() *9) +1;
		int b = (int)(Math.random() *9) +1;
		int c = (int)(Math.random() *9) +1;
		
		
		if(a==b || a==c || b==c) {
			System.out.println(a+""+b+""+c);
		}else {
			System.out.println(a+""+b+""+c);
		}
	}
}