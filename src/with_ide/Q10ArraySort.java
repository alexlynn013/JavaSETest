package with_ide;

import java.util.Arrays;

public class Q10ArraySort {
    public static void main(String[] args) {
            int arr[] = { 5,4,1,8,6,9};
            int temp = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
            System.out.print(arr[i] + "\t");
        }

            
        }

    }
