import java.util.Scanner;

/**
 * Created by Indreiu on 05-Apr-16.
 */
/*
5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n
de ex
a =3
b = 2
se va calcula 3*3

a = 3
b = 5
se va calcula 3*3*3*3*3
 */
public class p5 {

    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti un numarul : ");
        int nr1= in.nextInt();
        System.out.println("Introduceti puterea lui : ");
        int nr2= in.nextInt();

        int p=1;
        for(int i=0;i<nr2;i++)
            p=p*nr1;

        System.out.println(nr1+" la puterea " +nr2 +" este "+p+" !");


    }


}
