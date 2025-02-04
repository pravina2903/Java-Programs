import java.util.Scanner;
public class FindLargestValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("enter n1 value : ");
		n1=sc.nextInt();
		
		System.out.print("enter n2 value : ");
		n2=sc.nextInt();
		
		System.out.print("enter n3 value : ");
		n3=sc.nextInt();
		
		sc.close();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + " is a largest ");
		}else if(n2>n1 && n2>n3){
			System.out.println(n2 + " is a largest");
		}else {
			System.out.println(n3 + " is a largest");
		}

	}

}
