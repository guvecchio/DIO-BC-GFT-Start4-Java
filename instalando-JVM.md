# Atualizando os pacotes do Linux

O curso nos exige a execução de uma distro linux, usarei o Debian2021* rodando no VMBox.

Primeiro vamos atualizar os pacotes e a lista de pacotes do Linux;

ctrl + alt + t para acessar o terminal
sudo apt-get upgrade
sudo apt-get update

#### Automatizando a ação:

1. criar um arquivo no /bin:

    vim /bin/atualizar (sudo se não estiver como root)

2. cole este conteúdo no arquivo:

    #!/bin/bash
    apt-get update
    apt-get upgrade

OBS: mantenha o "#!" ** do início

3. dê permissão para executar o arquivo:

    chmod +x /bin/atualizar (sudo se não estiver como root)

Pronto, quando for atualiza, basta digitar:

    sudo atualizar (se não estiver como root)
    atualizar (casp esteja como root)

#### Agora vamos para as instalações da JVM:

1. instalando o CURL

    sudo apt install curl

2. intalando o Java Version Manager, que é necessário pela variedade de programas usando versões diferentes (ou pode instalar pelo próprio repositório do sistema operacional)

    curl -sL https://github;com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh

#### Lista de comandos do Jabba

jabba ls-remote _lista todas as versões_
jabba install [versao] _instala outras versões da JVM_
jabba use [versao] _altera a versão que está em uso_
java -version _informa a versão que está em uso_

No curso usaremos a versão openjdk@1.11, portanto execute o comando:

jabba install openjdk@1.11

Instale também a versão 1.10 só para alternaros entre versões e ver como funciona.

jabba ls _para ver as versões instaladas_
jabba use openjdk@1.11 _para setar a 10_
java -version _para confirmar se setou a 10_
jabba use openjdk@1.11 _para setar a 11_
java -version _para confirmar se alterou para a 11_

FIM.

### Notas:

* Desisti do Debian na VM (VirtualBox), e configurei o WSL2 (*Windows Subsystem for Linux*) no Windows Terminal, com o ubuntu na versão 20.04LTS.

** Também é possível colocar todos o comando bash linux em um arquivo .sh e executá-los a partir da linha de comando.

#### Escrevendo um script bash

Digamos que haja um script bash com o seguinte conteúdo:

#!/bin/bash
echo “Olá, mundo!”

O script começa com “#!”, que é uma diretiva especial que o Unix trata de forma diferente. Isso porque é uma convenção permitir que o shell interativo saiba o tipo de interpretador a ser executado para o programa a seguir. Essa linha informa ao Unix que o arquivo deve ser executado por “/bin/bash”. 

Essa é a localização-padrão do shell Bourne em quase todos os sistemas Unix. Adicionar “#!/bin/bash” como a primeira linha de seu script informa ao sistema operacional que o shell bash deve executar os comandos seguintes no script.

O “#!”, frequentemente referido como “hash-bang”, “she-bang” ou “sha-bang”, só é acionado se o script for lido como um executável. Enquanto digitar “./scriptname.extension” faz ele buscar o intérprete na primeira linha, executar o script com a extensão bash (“scriptname.sh”) faz essa linha ser ignorada.

#### Exemplo1

Por isso, é possível executar o script da seguinte forma. Para tornar o arquivo executável, deve-se chamar este comando sob sudo chmod u+x “nome do arquivo”:

$ ./meuScriptBash.sh
echo “Olá, mundo!”

O script possui apenas duas linhas. O primeiro indica qual interpretador usar para executar o arquivo (neste caso, bash). A segunda linha é o comando que queremos usar, “echo”, seguido pelo que queremos imprimir, “Olá, mundo!”.

Às vezes, o script não é executado e o comando acima retorna um erro. Isso acontece devido às permissões definidas no arquivo. Para evitá-lo, antes de executar o script, faça:

$ chmod u+x meuScriptBash.sh

Obrigado.

Fontes:
[Confira o guia completo sobre o comando Bash](https://www.hostgator.com.br/blog/guia-sobre-comando-bash/#:~:text=O%20script%20come%C3%A7a%20com%20%E2%80%9C%23!,%E2%80%9C%2Fbin%2Fbash%E2%80%9D.)

[Introdução ao Ecossistema e Documentação Java](https://web.dio.me/course/introducao-ao-ecossistema-e-documentacao-java/learning/c21a83f7-e7ec-4f47-8a35-51fe3cca9f2d?back=/track/gft-start-4-java)

