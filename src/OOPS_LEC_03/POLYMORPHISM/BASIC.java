package OOPS_LEC_03.POLYMORPHISM;

public class BASIC {
    public static void main(String[] args) {
        Parent l = new Parent();
        extendable01 k = new extendable01();
        extendable02 p = new extendable02();

        l.info();
        k.info();
        p.info();

        Parent o = new extendable01();
        //since it has same name and overriding is possible  a parent can access the method of child
        o.info();
        //but if it does not have same stuff like variables of sub class ....it cant be accessed
        //o.aa;
        //o.hello();


        //OVERLOADING

        Parent j = new Parent(9,10,90.9f);
        Parent n = new Parent(13,90.9f,14);
        Parent m = new Parent(90.9f,33,44);

        j.info();
        n.info();
        m.info();
    }
}
