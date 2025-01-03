package OOPS_LEC_03.SINGLE_INHERITANCE;


// PROPERTIES OF OOPS


public class Basics {
    public static void main(String[] args) {
        //call by child
        extendable k = new extendable();
        System.out.println(k.l);
        k.Information();

        //call by parent
        Parent l = new Parent(2,3,4);
        System.out.println(l.l);
        Parent g = new Parent(l);
        System.out.println(g.h);
        l.Information();

        //access parent via child is possible but the opposite is can't

        System.out.println(k.hh);//child to child
        System.out.println(k.h); //child to parent
        //System.out.println(l.hh);//parent to child not possible

        //passing parameters to parents class constructor via child class
        extendable pass = new extendable(1,2,3);
        pass.Information();

        Parent jk = new extendable(6,7,8);
        Parent kj = new extendable(pass);
    }
}



