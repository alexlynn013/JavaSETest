package with_ide;

import java.util.Arrays;

public class Q30PrintArrforeach {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        //Arrays.stream(arr).map(i -> arr[i]).forEach(System.out::println);
        for (int arry : arr
             ) {
            System.out.println(arry);
        }

    }
}
