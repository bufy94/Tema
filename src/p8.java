import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
/**
 * Created by Indreiu on 05-Apr-16.
 */
/*
8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .
 */
public class p8 {
    public static void main(String[] a) {
        System.out.println("x= ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("n= ");
        Scanner in1 = new Scanner(System.in);
        int n = in1.nextInt();

        int sum=1;

        for(int i=0;i<=n;i++)
            sum+= Math.pow(x,i);

        System.out.println(sum);


    }
}
