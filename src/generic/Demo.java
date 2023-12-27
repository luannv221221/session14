package generic;

public class Demo <T>{
    private T t;

    public Demo() {
    }

    public Demo(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
