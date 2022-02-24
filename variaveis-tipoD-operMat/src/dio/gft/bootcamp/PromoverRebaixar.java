package dio.gft.bootcamp;

public class PromoverRebaixar {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // downcast com perda de informação

        long l1;
        int i1 = 10;
        l1 = i1; // upcast, onde não há perda de informação

        int i2;
        long l2 = 10000000000000L;
        i2 = (int) l2; // downcast com perda de informação

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;  // downcast sem perda de informação

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcast, onde não há perda de informação

        double f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; // downcast com perda de informações

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // haverá perda de informações, aqui houve um truncamento, e as casas decimais foram ignoradas.

        System.out.println("b1= " +b1);
        System.out.println("l1= " +l1);
        System.out.println("i2= " +i2);
        System.out.println("i3= " +i3);
        System.out.println("d1= " +d1);
        System.out.println("f2= " +f2);
        System.out.println("f3= " +f3);
        System.out.println("i4= " +i4);

        b1 = (byte) d3;
        System.out.println("b1= " + b1); // Down com perda de informação

        /*
        * Conclusão, as conversões podem ser feitas para qualquer tipo de dados, mas
        * precisamos ter atenção com os Downcasts, que podem ocasionar perda de informação.
        *
        * Downcast tem que ser Explícito;
        * Upcast não precisa;
        */

    }

}
