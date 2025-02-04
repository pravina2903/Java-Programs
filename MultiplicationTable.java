import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			System.out.print("eneter a number : ");
		  int num=sc.nextInt();
		  
		  sc.close();
		  
		 
		  for(int multiplier=1;multiplier<=10;multiplier++) {
			 
			 // System.out.println(num*multiplier);
			  
			  System.out.printf("%d * %d = %d\n",num,multiplier,(num*multiplier));
		  }
	}

}
