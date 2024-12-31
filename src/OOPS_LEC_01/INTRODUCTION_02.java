//   PLEASE REFER WITH THE PAPER NOTES PROVIDED















package OOPS_LEC_01;

public class INTRODUCTION_02 {
    public static void main(String[] args) {
        S pr = new S();//main object
        S p = new S(pr);
        System.out.println(p.ad);
        System.out.println(p.ab);
    }
}
class S{
    int ad = 10;
    int ab = 1000;
    S(){
        this.ad = 80;
    }
    S(S name){  // call by the object itself
        this.ad = name.ab;
        this.ab = name.ad;
    }
}