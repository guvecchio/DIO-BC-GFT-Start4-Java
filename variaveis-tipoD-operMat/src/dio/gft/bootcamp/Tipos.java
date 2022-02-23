package dio.gft.bootcamp;

public class Tipos {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3; // por padrão 0

        short s1 = 10000;
        // short s2 = 40000; o tamanho estrapola o tamanho suportado pelo short
        short s3 = 0; // por padrão 0

        // int i1 = -1000000000000;  o tamanho estrapola o tamanho suportado pelo short
        int i2 = 28500;
        int i3 = 0; // por padrão 0

        long l1 = 251242151254125141L;
        long l2 = -25201252125422545L;
        long l3 = 0; // por padrão 0L

        // float f1 = 4.5; o float quem que obrigatóriamente ser identificado pelo (f) no final do valor.
        float f2 = 10.68f;
        float f3 = 0f; // por padrão 0f ou 0

        double d1 = 85.69;
        double d2 = 99.84d;
        double d3 = 0d; // por padrão 0 ou 0d

        char c1 = 'W';
        // char c2 = 'Tw'; o char suporta apenas um caractere
        char c3 = '\u0057'; // é a representação do w em unicode.
        // char c4 = "W"; o valor de (char) tem que ser informado com aspas simples;
        char c5 = 0; // por padrão '/u0000' ou 0

        String st1 = "F";
        // String st2 = 'Cicrano'; aspas simples somente para caracteres literais, usando (char).
        String st3 = "ashdlas sd y 387246 AGDJHAD *&¨%$#)(";
        String st4 = null; // por padrão null

        String dt1 = "09/02/1981"; // tipo de data incorreta, há um tipo de dados específicos para trabalhar com datas.

        boolean bo1 = true;
        boolean bo2 = false;
        boolean bo3 = false; // por padrão false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c5);
        System.out.println(st1);
        System.out.println(st3);
        System.out.println((String) null);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println(bo3);

    }
}
