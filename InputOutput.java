import java.util.Scanner;
public class InputOutput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The numbers you entered are "+a + " " + b + " "+ c);
		
		System.out.println("Enter if you want to add/sub/mul/div the numbers: (a/s/m/d)");
		char choice = sc.next().charAt(0);
		
		if(choice == 'a'){
			int sum = a+b+c;
			System.out.println("Sum is "+sum);
		}
		else if(choice == 's'){
			int diff = a-b-c;
			System.out.println("Diff is "+diff);
		}
		else if(choice == 'm'){
			int prod = a*b*c;
			System.out.println("Product is "+prod);
		}
		else if(choice == 'd'){
			if(b != 0 && c != 0){
				int div = a/b/c;
				System.out.println("Dividend is "+div);
			}
			else{
				System.out.println("Division by zero is not valid");
			}
		}
			
		
	}
}
