package dio.gft.bootcamp;

public class Main {

    public static void main(String[] args) {

        int i;
        // int i; não posso declarar variáveis com o mesmo nome.
        int I; // case sensitive, difetente do i, minúsculo.
        // int 1a; variáveis não podem ser iniciadas com números.
        int _1a; // não é uma boa prática.
        int $aq; // não é uma boa prática.

        i = 5;
        I = 10;
        _1a = 20; // só para exemplificar que, não há erro de compilação, não é uma boa prática.
        $aq = 7; // só para exemplificar que, não há erro de compilação, não é uma boa prática.

        final int j = 10; // variáveis "final" são aquelas que não sofrem alteração, ou seja, constantes.
        // j = 15; da (erro), porque não consigo mudar o valor de j, sendo uma constante.
        int asrn2467md; // não é uma boa prática, pois o nome não é representativo e dificulta a leitura do código.
        // int asrn2467 md; não pode ter espaços no nome de uma variável.
        int asrn2$4678_md; // também não é uma boa prática
        // int asrn2$46%78_md = 10; não aceitam outros caracteres especiais (% @ (), etc).

        asrn2467md = 100; // só para exemplificar que, não há erro de compilação, não é uma boa prática.
        asrn2$4678_md = 10; // não é uma boa prática.

        int quantidadeProduto = 50; // notacaoCamelo.
        // int QuantidadeProduto; não é uma boa prática.
        final int NUMERO_TENTATIVAS = 5; // regra de nomenclatura para constantes.
        final int numeroTentativas = 5; // não é uma boa prática para constantes.
        int QUANTIDADE_OPCOES = 25; // não é uma boa prática, pois não é constante.
        int qtdProd; // não é uma boa prática, pois o nome não tem expressividade.

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2467md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }

}
