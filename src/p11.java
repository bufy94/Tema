import java.util.Scanner;
/**
 * Created by Indreiu Ovidiu on 05-Apr-16.
 */
/*
11. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
 */
public class p11 {
    public static void main(String[] a) {
        int[] sir = {1, 2, 5, 4, 6, 9, -4, 10, 11 , 3};
        int sir1[] = new int[10];
        int j=0,n=0;
        int min = -12;
        int max = 4;
        for (int i = 0; i < sir.length; i++) {
            if(sir[i]>min && sir[i]<max)
            {
                sir1[j]=sir[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {    System.out.print(" "+sir1[i]);    }
        System.out.println();
    }
}
