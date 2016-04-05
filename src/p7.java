/**
 * Created by Indreiu on 05-Apr-16.
 */

/*
7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
 de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8

 */
public class p7 {

    public static void main(String[] a) {

        int[] sir = {11, 13, 9, 8, 16 ,15 ,6 ,40 ,2};

        for (int i = 0; i < sir.length; i++)
            if (sir[i] > sir[i + 1])
                System.out.print(" (" + sir[i] + " , " + sir[i + 1] + " )  ");
    }


}
