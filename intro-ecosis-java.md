# Entendendo o Java

- compilada
*o nosso código .java é compilado pelo Javac(Java Compiler) em bytecodes .class*
- interpretada
*os bytecodes, por sua vez, são interpretados pela JVM*
- fortemente tipada
- linguagem de alto nível
- executada em uma máquina virtual JVM

# Entendendo a JVM

- (tradutor JAVA) que traduz os bytecodes compilados em código de máquina de cada sistema operacional
- reponsável pela:
    - execução de plhas
    - gerenciamento de memória
    - gerenciamento de threads
    - otimização de código (compilação JIT - just in time)
    - garbage collector (GC) *limpeza de memória suja*

#### Diferença para utras linguagens compiladas.

Enquanto em outras linguagens o código deve ser complicado para cada SO diferente, no Java se faz somente uma compilação em .class(bytecodes), que será traduzido pelas diferentes JVMs instaladas em cada SO.

#### Diferença entre o JRE e o JDK.

JRE Java Runtime Enviroment - *responsável por executar os programas em Java* (é a própria JVM)

JDK Java Development Kit - *conjunto de utilitários que permite o desenvolvimento de programas em Java, onde possui também a JVM para execução dos programas desenvolvidos.

Resumidamento são utilizados:

- JRE, usado para executar um programa em Java;
- JDK, usado para o desenvolvimento em Java.

#### Tipos de plataformas Java

Java SE - *contém todas as especificações do Java; com as implementações:

    - OpenJDK; (usado nesta aula)
    - Oracle JDK;
    - AdoptOpenJDK;
    - Amazon Corretto;
    - GraalVM Corretto;
    - Azul Zulu...

Java EE - contém o SE mais programas úteis para execução em servidores, em 2019 renomeado para Jakarta EE

Java ME - contém todas as especificações para dispositivos pequenos (mobile).