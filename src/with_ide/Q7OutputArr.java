package with_ide;

public class Q7OutputArr {
    public static void main(String[] args) {
        int arr[] = {2,4,12,14,6,8,10};
        int temp;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
}
