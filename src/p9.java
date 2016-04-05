/**
 * Created by Indreiu on 05-Apr-16.
 */
/*
9. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}

 */
public class p9 {
    public static void main(String[] a) {

        int[] sir = {1, 2, 3, 4, 6 ,5 ,9 ,10 ,77};



        for(int i=0; i < sir.length-1; i++) {
            int min = i;
            for (int next = i + 1; next < sir.length; next++) {
                if (sir[min] > sir[next])
                    min = next;
            }
            if (min != i) {
                int temp = sir[i];
                sir[i] = sir[min];
                sir[min] = temp;
            }
        }
        for(int p : sir)
        {    System.out.print(" "+p);    }
        System.out.println();






    }
}
