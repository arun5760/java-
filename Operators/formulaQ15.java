15)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double rad=sc.nextDouble();
	     double h=sc.nextDouble();
	    double s=2*3.14*rad*(rad+h);
	    double w=3.14*rad*rad*h;
		System.out.println(s);
		System.out.println(w);
	}

}