package OOPS_LEC_02.STATIC;

public class STAT01_USE {
    public static void main(String[] args) {
        STAT01 ins = new STAT01(17,"yogesh",10000,true);
        STAT01 ins01 = new STAT01(18,"hello",2000,false);
        STAT01 ins02 = new STAT01(12,"jjk",325,false);
        System.out.println(STAT01.pop);
    }
}
