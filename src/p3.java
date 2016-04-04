import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Indreiu on 05-Apr-16.
 */
/*
3. Se citesc numere naturale pânã când se introduce numãrul 0. Afisati suma obtinutã prin adunarea primei si a ultimei cifre din fiecare numar citit. Numerele cu mai putin de 2 cifre nu se
iau in considerare.
Exemplu: dacã se introduc numerele 3455 66 7 8 23 11221 0 atunci se va afisa 27 (3+5+6+6+2+3+1+1).

 */
public class p3 {

    public static void main(String[] a) {

        int s=0;
        int nr;
        int zeci;
        int unitati;

        do {
            System.out.println("Introduceti un numar: ");
            Scanner in = new Scanner(System.in);
            nr = in.nextInt();

            if(nr !=0 ) {
                if(nr>10)
                {

                unitati = nr % 10;
                zeci = nr;

                while (zeci > 9) {
                    zeci = zeci / 10;
                }

                s = s + unitati + zeci;
                }
            }

        } while (  nr != 0);

        System.out.println("Suma primei si ultimei cifre pana la introducerea lui 0 este : " +s);
    }
}