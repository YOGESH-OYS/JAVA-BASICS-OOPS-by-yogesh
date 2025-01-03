package OOPS_LEC_03.MULTILEVEL_INHERITANCE;

public class expendable01 extends Parent {
    int exp01 = 101;
    int sum = a+b;

    public expendable01(int d, int k){
        super(d,k);
    }

    void Info(){
        System.out.println("INFO exp01 ==> a = "+a+" , b = "+b);
    }
}
