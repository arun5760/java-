5)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double x1=sc.nextdouble();
	    int y1=sc.nextInt();
	    int x2=sc.nextInt();
	    int y2=sc.nextInt();
	    int dx=x2-x1;
	    int dy=y2-y1;
	    int dis=(dx*dx)+(dy*dy);
		System.out.println(dis);
	}
}
