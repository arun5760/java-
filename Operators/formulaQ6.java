6)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double heat=sc.nextDouble();
	    double celcius=(5.0/9)*(heat-32);
		System.out.println(celcius);
	}
}
