package with_ide;

import java.util.Scanner;

public class Q11DeletArr {

    public static void main(String[] args) {

        int arr[] = {2,4,6,8,10};
        System.out.println("Type You want to delete Value Number");
        Scanner obj = new Scanner(System.in);
        int delete = obj.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
