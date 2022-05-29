package with_ide;

public class Q8OutputMultiArr {
    public static void main(String[] args) {
        int arrs[][] = {
                {1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}
        };
        for (int[] ints : arrs) {
            for (int i : ints) {
                System.out.print(i+"\t");

            }
            System.out.println();


        }
    }
}
