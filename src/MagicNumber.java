import java.util.Scanner;

public class MagicNumber {
    public static void magicCheck(int number)
    {
        int sum=0;
        while(number>9){
            while(number!=0){
                sum+=number%10;
                number/=10;
            }
            number=sum;
            sum=0;
        }
        if(number==1)
        {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        magicCheck(num);

    }
}
