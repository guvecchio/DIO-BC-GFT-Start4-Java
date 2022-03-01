# MÉTODOS

## CONCEITUAÇÃO:

"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Esse é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."

Não existe método que não esteja dentro de uma classe. O Conceito de classe será abordado em outra aula.

### Padrão de definição:

<?visibilidade?><?tipo?>retorno nome<?parâmetros()?><?exceções?>corpo

O que está entre interrogações é opcional, os demais itens são obrigatórios.

onde:

*V:* "public", "protected" ou "private"; // POO - será visto mais adiante

T: concreto ou abstrato; // POO - será visto mais adiante

M: "static" ou "final"; // POO - será visto mais adiante

*R:* tipo de dado ou "void"; // tipo de dados: qualquer um dos tipos de dados 
primitivos/básicos, ou um objeto ou classe. Já o "void" o método executa e não retorna nada.

*N:* nome que é fornecido ao método; // tudo que vale na nomeação de variáveis vale para os métodos.

*P:* parâmetro que pode receber;

E: exceções que pode lançar; // erro que podem ser disparados.

*C:* código que possui ou não vazio; // vazio: POO - será visto mais adiante.

*os mais utilizados estão em itálico*

### EXEMPLOS:

 - public String getNome() { ... };
 - public double cancularTotalNota(){ ... };
 - public int verificarDistancia(int coordenada1, int coordenada2){ ... };
 - public abstract void executar();
 - public void alterarFabricante(Fabricante fabricante){ ... };
 - public Relatorio gerarDadosAnalitocs(Cliente cliente, List<Compra> compras){ ... };

**public sattic R N(P){ ... }** // será a fórmula mais utilizada em nossos exercícios.

## UTILIZAÇÃO

nome_da_classe.nome_do_metodo() ou nome_da_classe.nome_do_metodo(...);
nome_do_objeto.nome_do_metodo() ou nome_do_objeto.nome_do_metodo(...);

Exemplo:

- com classe: // classes sempre com a primeira letra em MAIÚSCULAS;
    Math.random(); ou Math.sqrt(4);

- com objeto: // objetos sempre com a primeira letra em minúsculas; POO
    usuario.getEmail(); ou usuario.alterarEndereco(endereco);

## PARTICULARIDADES



