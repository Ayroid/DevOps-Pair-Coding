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
}
