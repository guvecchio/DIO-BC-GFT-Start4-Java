<<<<<<< HEAD
# Atualizando os pacotes do Linux

O curso nos exige a execução de uma distro linux, usarei o Debian2021 rodando no VMBox.

Primeiro vamos atualizar os pacotes e a lista de pacotes;

ctrl + alt + t para acessar o terminal
sudo apt-get upgrade
sudo apt-get update

Automatizando a ação

1. criar um arquivo no /bin:

vim /bin/atualizar (sudo se não estiver como root)

2. cole este conteúdo no arquivo:

#!/bin/bash
apt-get update
apt-get upgrade

OBS: mantenha o "#!" do início

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

## Lista de comandos do Jabba

jabba ls-remote _lista todas as versões_
jabba install [versao] _instala outras versões da JVM_
jabba use [versao] _altera a versão que está em uso_
java -version _informa a versão que está em uso_

No curso usaremos a versão openjdk@1.11, portanto execute o comando:

jabba install openjdk@1.11

Instale também a versão 1.10 só para alternaros entre versão e ver como funciona.

jabba ls _para ver as versões instaladas_
jabba use openjdk@1.11 _para setar a 11_
java -version _para confirmar se setou a 11_

FIM DA AULA.
=======
# Atualizando os pacotes do Linux

O curso nos exige a execução de uma distro linux, usarei o Debian2021 rodando no VMBox.

Primeiro vamos atualizar os pacotes e a lista de pacotes;

ctrl + alt + t para acessar o terminal
sudo apt-get upgrade
sudo apt-get update

Automatizando a ação

1. criar um arquivo no /bin:

vim /bin/atualizar (sudo se não estiver como root)

2. cole este conteúdo no arquivo:

#!/bin/bash
apt-get update
apt-get upgrade

OBS: mantenha o "#!" do início

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

## Lista de comandos do Jabba

jabba ls-remote _lista todas as versões_
jabba install [versao] _instala outras versões da JVM_
jabba use [versao] _altera a versão que está em uso_
java -version _informa a versão que está em uso_

No curso usaremos a versão openjdk@1.11, portanto execute o comando:

jabba install openjdk@1.11

Instale também a versão 1.10 só para alternaros entre versão e ver como funciona.

jabba ls _para ver as versões instaladas_
jabba use openjdk@1.11 _para setar a 11_
java -version _para confirmar se setou a 11_

FIM DA AULA.
>>>>>>> 227a831f9bf0bb50ab75a6b3465cc454f0117a89
