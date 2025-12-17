import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    boolean perfectsquare=false;
	    for(int i=1;i*i<=num;i++){
	        if(i*i==num){
	            perfectsquare=true;
	            //break;
	        }
	    }
	    if(perfectsquare){
	        System.out.print("perfectsquare");
	    }
	    else
	        System.out.print("not perfectsquare");
	}
}

