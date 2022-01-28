import java.util.Arrays;
import java.util.Random;

/**
 * Created by LENOVO ALMAZEN on 20/01/2022.
 */
public class array3 {
    public static void main(String[] args) {
        int [] b={1,2,3,4,5};
        System.out.println(Arrays.toString(elrim(b)));
    }
    public static int[] elrim(int[]y){

        Random s=new Random();
        int index=s.nextInt(y.length-1);
        System.out.println(index);;
        for (int i = 0; i <y.length ; i++) {
            if (index <= i) {
                y[i] = -1;
            }

        }
        return y;
    }
}
