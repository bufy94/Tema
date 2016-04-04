import java.util.Scanner;
/**
 * Created by Indreiu Ovidiu on 05-Apr-16.
 */

public class p1 {

    public static void main(String[] a) {
       /*1. Se da un sir de numere ordonate crescator.
        Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
        Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
                sirul va fi definit asa, numerele sunt de exemplu.
        int[] a = {1,3,4,6,7,8,10,12,14,23};  */


        int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        System.out.println("Introduceti numarul cautat: ");
        Scanner in = new Scanner(System.in);
        int nr= in.nextInt();
        int i=0;
        boolean f=false;

        for(i=0;i<10;i++)
            if(sir[i] == nr)
            {
                System.out.println("Pozitia numarului este: " + i+" (numerotarea a inceput de la 0.)");
                i=10;
                f=true;
            }
        if(f==false){
            System.out.println("-1");
        }
    }
}
