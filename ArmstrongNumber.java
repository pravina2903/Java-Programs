import java.util.*;
public class ArmstrongNumber {

    public static void main(String[] args) {

        int x,y,num=0,rem;

        System.out.println("Enter number:");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=x;
        while(x>0) {
            rem=x%10;
            num=(rem*rem*rem)+num;
            x=x/10;

        }
        if(y==num) {
            System.out.println("is an Armstrong number");

        }else
            System.out.println("is not an Armstrong number");


    }

}