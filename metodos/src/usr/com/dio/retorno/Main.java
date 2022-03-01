package usr.com.dio.retorno;

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Retornos.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Retornos.area(5d, 5d);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Retornos.area(7d,8d,9d);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}