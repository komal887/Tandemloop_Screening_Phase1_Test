import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();

        int count =(a % 2 == 0)? a - 1 : a;

        for(int i = 1; i <= count; i++) {
            System.out.print((2*i - 1) + " ");
        }
    }
}
