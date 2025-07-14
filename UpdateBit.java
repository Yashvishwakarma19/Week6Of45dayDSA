import java.util.Scanner;

public class UpdateBit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int oper = s.nextInt();

        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
        System.out.println(newNumber);

        }

    }
}