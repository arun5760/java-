14)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double rad=sc.nextDouble();
	    double s=4*3.14*rad*rad;
	    double w=(4.0/3)*(3.14*rad*rad*rad);
		System.out.println(s);
		System.out.println(w);
	}

}
