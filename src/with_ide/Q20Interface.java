package with_ide;

public interface Q20Interface {

        void sum();
        void sum1();
        void sum2();
        void sum3();

}
interface InterfaceExpp extends Q20Interface{
    public static void main(String[] args) {
        InterfaceExpp obj = new InterfaceExpp() {
            @Override
            public void sum() {

            }

            @Override
            public void sum1() {

            }

            @Override
            public void sum2() {

            }

            @Override
            public void sum3() {

            }
        };
    }
}
