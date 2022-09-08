import java.util.*;
public class PairCoding{
    Scanner sc = new Scanner(System.in);
    public void primeNumber(){
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int factors=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors++;
            }
        }
        if(factors==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
    
    public static void main(String[] args) {
        PairCoding pc = new PairCoding();
        System.out.println("Enter:\n1- Prime Number\n2- Multiplication Table");
        int choice = pc.sc.nextInt();
        switch(choice){
            case 1:
            pc.primeNumber();
            break;

            default:
            System.out.println("Wrong Choice");
        }
    }
}
