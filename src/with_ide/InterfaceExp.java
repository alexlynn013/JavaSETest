package with_ide;

public interface InterfaceExp {

    void sum();
    void sum1();
    void sum2();
    void sum3();

}

interface B{
    void call();
}
class call implements InterfaceExp,B{


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

    @Override
    public void call() {

    }
}