package OOPS_LEC_03.HIERARCHIAL_INHERITANCE;

public class BASICS {
    public static void main(String[] args) {
        expendable03 l = new expendable03(4,9);
        l.Info();
        expendable01 o = new expendable01();
        o.Info();
        expendable02 p = new expendable02();
        System.out.println(p.b);

        Parent y = new Parent();
        y.Info();
        Parent i = new expendable03(7,5);
        i.Info();

        System.out.println(l.a);
        System.out.println(o.a);
        System.out.println(p.a);
    }
}
