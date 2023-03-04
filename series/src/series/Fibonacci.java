package series;
import java.util.Scanner;

public class Fibonacci {

	
	
	
	
	public static void main(String[] args) {
		Fibonacci fibonacci=new Fibonacci();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the how many number you need");
		int num=scanner.nextInt();
		int a=0,b=1,c;
		
		for(int i=1;i<=num;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
			
			
			
		
		
		
		}
	}
	
	
	
	
}
