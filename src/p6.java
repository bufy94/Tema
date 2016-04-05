import java.util.Scanner;
/**
 * Created by Indreiu on 05-Apr-16.
 */

/*
6. Sa se calculeze factorialul unui numar a .
factorialul este definit asa:
factorial  = 1*2*3*4….*a

de ex pentru a = 4, factorialul este 1*2*3*4
 */
public class p6 {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti numarul : ");
        int nr= in.nextInt();
        int fact=1;
        for(int i=2;i<=nr;i++)
            fact=fact*i;

        System.out.println(nr+"!= "+fact);




    }
}
