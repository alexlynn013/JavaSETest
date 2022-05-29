package with_ide;

public class Q23OutputFollowingFormat {
    public static void main(String[] args) {
        int arrs[] = {5,5,5,5};
        for (int i = 0; i < arrs.length; i++) {

            int z= arrs[i];
            for (int j = 0; j<z; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
