import java.util.Scanner;
/**
 * Created by Indreiu Ovidiu on 05-Apr-16.
 */
/*
4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.
 */
public class p4 {
    public static void main(String[] a) {

        System.out.println("Introduceti un numar in intervalul [9,24] : ");
        Scanner in = new Scanner(System.in);
        int nr= in.nextInt();
        boolean t=true;
        if(nr>=9 && nr<=24)
            System.out.println(t);
        else
            System.out.println(!t);
    }
}
