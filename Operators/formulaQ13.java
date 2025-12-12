13)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double l=sc.nextDouble();
	    double v=sc.nextDouble();
	    double h=sc.nextDouble();
	    double s=2*(l*v+l*h+v*h);
	    double w=l*v*h;
		System.out.println(s);
		System.out.println(w);
	}

}
