package with_ide;

public class Q3LargestNum {
    public static void main(String[] args) {
        int num[]= {23,24,12,78,62};

        int largestnumb = num[0];
        for (int i = 0; i < num.length; i++) {

            if(largestnumb < num[i])
                largestnumb = num[i];

        }
        System.out.println(largestnumb);
    }
}
