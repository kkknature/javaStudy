package wrapper1;

public class CalculatorEx {
    public static void main(String[] args) {

       Integer i1 = 10;
       Integer i2 = 10;

       int i3 = i1;
       int i4 = i2;

       Calc c = new Calc();

       System.out.println(c.mul(i3, i4));
       System.out.println(c.add(i3, i4));
       System.out.println(c.sub(i3, i4));


    }
}
