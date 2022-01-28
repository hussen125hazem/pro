import java.util.Arrays;

/**
 * Created by LENOVO ALMAZEN on 20/01/2022.
 */
public class array1 {
    public static int[] rtev(int [] s){

        for (int i = 0; i <s.length/2 ; i++) {

            int t = s [i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=t;


        }
        return s;
    }

    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        System.out.println(Arrays.toString(rtev(a)));
    }
}
