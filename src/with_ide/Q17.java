package with_ide;

class Mom{
    void Work(){
        System.out.println("Sar Load");
    }
}
class Daw extends Mom{
    void doIt(){
        System.out.println("Sar Load");
    }
}


public class Q17 extends Daw{
    public static void main(String[] args) {
        Q17 obj = new Q17();
        obj.Work();

        Q17 obj2 = new Q17();
        obj2.doIt();


    }
}
