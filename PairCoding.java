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

    public void table(){
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    
    public static void main(String[] args) {
        PairCoding pc = new PairCoding();
        int t;
        do
        {
        System.out.println("Enter:\n1- Prime Number\n2- Multiplication Table");
        int choice = pc.sc.nextInt();
        switch(choice){
            case 1:
            pc.primeNumber();
            break;

            case 2:
            pc.table();
            break;

            default:
            System.out.println("Wrong Choice");
        }
            System.out.println("If you want to continue enter 1 or enter 0 for exit");
             t = pc.sc.nextInt();
    }while(t==1); 
}
}
