/**
 * Created by Indreiu on 05-Apr-16.
 */
/*
10. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,
 pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.
 */
public class p10 {
    public static void main(String[] a) {
        int[] sir = {1, 2, 5, 4, 6 , 9 ,-4 ,10 ,11};
        for(int i=0;i<sir.length;i++)
            if(i<(sir.length/2))
                System.out.print(" "+(sir[i]*sir[i]));
            else if(sir[i]%2!=0)
                System.out.print(" "+(sir[i]*sir[i]*sir[i]));
            else
                System.out.print(" "+sir[i]);
    }
}
