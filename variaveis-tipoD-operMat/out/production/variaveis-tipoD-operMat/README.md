# Variáveis, Tipos de Dados e Operadores Matemáticos em JAVA

# CONCEITUAÇÃO

*"Um espaço na memória do computador, onde se pode guardar valores."*

### Existem quatro tipos de variáveis:

- instância: objeto;
- classe: classe;
- local: dentro de métodos;
- parâmetro: na assinatura do método.

#### Vamos falar aqui do tipo *local*:

Um ponto de partida para programas simples na linguagem JAVA é o método *main*. Que é 
um método que usamos para disparar a execução do nosso programa.

Será no método *main* que criaremos as variáveis iniciais.

### Padrão de Definição:

    <?visibilidade?> <?modificador?> tipo nome <?=valorInicial?>

    V (visibilidade): "public", "protected" e "private";
    M (modificador): "static" e "final";
    T (tipo): tipo de dado;
    N (nome): nome que é fornecido à variável;
    VI (valor inicial): um valor inicial, caso se deseje;

    nota: os valores entre <??> não são obrigatórios, os demais são:

Quando definimos em JAVA a variável *final*, significa que a variável é constante, ou seja,
o seu valor não será alterado durante a execução do programa.

Java é uma linguagem fortemente tipada, ou seja, você sempre tem que informar o tipo de
dado que será recebido pela variável.

### Convenções e regras na criação de variáveis:

- não devem começar com números;
- embora pemitido "$" e "_", devem ser evitados;
- são CaSe-sEnSiTIve;
- não devem ter espaços entre os caracteres;
- não podem ser usadas palavras reservadas do JAVA.

#### boas práticas:

- sempre começar com letras minúsculas;
- usar nomes expressivos, ou seja, que possam identificar bem a que se refere a variável;
- notacaoCamelo;
- quando constante(final), tudo maiúscula e separada por "_".

# Links Úteis:

[Palavras Reservadas do Java e a sua Definição](https://www.codificante.com.br/voce-conhece-todas-as-palavras-reservadas-do-java)

