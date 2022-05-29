package with_ide;

import java.util.Scanner;

public class Q26PrimeNumberSeries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        int number = obj.nextInt();

        int primenumber = number%3;
        if(primenumber == 0){
            System.out.println(number + " is prime number");
        }else{
            System.out.println("Your number is not prime number");
        }





    }

}
