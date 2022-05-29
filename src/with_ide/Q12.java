package with_ide;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int arry[] = { 1,2,3,4,5,5,6,7,8};
        for (int i = 0; i < arry.length ; i++){
            System.out.print(arry[i]+ "\t");
        }
        System.out.println();
        System.out.println("Type your arrays index room that you want to delete");
        Scanner obj = new Scanner(System.in);
        int delenum = obj.nextInt();

        switch (delenum){
            case 0:
                System.out.println();
        }
    }
}
