import java.util.Scanner;
public class HCF {
    
    public static int findHCF(int a, int b){
        while(b!=0){
         int temp=b;
         b=a%b;
         a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a's value : ");
        int x=sc.nextInt();
        System.out.print("enter b's value : ");
        int y=sc.nextInt();

        int hcf=findHCF(x,y);
        System.out.println("the hcf is : " +hcf);
    }
}
