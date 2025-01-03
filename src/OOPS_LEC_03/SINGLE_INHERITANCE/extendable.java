package OOPS_LEC_03.SINGLE_INHERITANCE;

public class extendable extends Parent{

    int hh = 60;
    extendable(){ }

    public extendable(int a, int b, int c) {
        super(a, b, c);
    }

    extendable(extendable g) {
        super(g);
    }
}

