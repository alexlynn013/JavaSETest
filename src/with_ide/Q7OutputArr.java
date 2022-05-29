package with_ide;

public class Q7OutputArr {
    public static void main(String[] args) {
        int arr[] = {2,4,12,14,6,8,10};
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > min){
                min = arr[i];


            }
            System.out.println(min);

        }

    }
}
