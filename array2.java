/**
 * Created by LENOVO ALMAZEN on 20/01/2022.
 */
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LENOVO ALMAZEN on 18/01/2022.
 */
public class array2
{

    public  static int[] copy(){
        int []x ={1,2,3,4,5};
        int[] s = new int[x.length];
        s = x ;
        return s;
    }
    public static void main(String[] args) {


        System.out.println(Arrays.toString(copy()));
    }


}


