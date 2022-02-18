# Instalando e Configurando o WSL2 no Windows 10

WSL2 - permite que rodemos linux como um Subsistema, não é dualboot. Possibilita que executemos o linux em linha de código (não carrega a interface linux), e possamos compartilhar, por exemplo, o localhost, programas, e usar o windows normalmente, compartilhando poucos recursos.

## Vamos à instalação

1. requisitos de sistema:

    - Para sistemas x64: Versão 1903 ou superiores, com o Build 18362 ou superiores.
    - Para sistemas ARM64: Versão 2004 ou superiores, com o Build 19041 ou superiores.
    - Os builds inferiores a 18362 não dão suporte a WSL 2. Use o Assistente do Windows Update para atualizar a sua versão do Windows.

    Para saber as configurações do seu computador, como processador e Build, tecle Windows + pause

2. verificada a versão suportada, vamos para a instalação, primeiro vamos habilitar o WSL :

    Antes de instalar qualquer distribuição do Linux no Windows, você precisará primeiro habilitar o recurso opcional "Subsistema do Windows para Linux".

    Abra o PowerShell como Administrador (menu Iniciar > PowerShell > clicar com o botão direito do mouse > Executar como Administrador) e insira este comando:

        dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart

3. agora vamos habilitar o recurso de Máquina Virtual, executando ainda no PowerShell o seguinte comando:

    dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart

4. atualizar o kernel do Linux, é só baixar o arquivo no link abaixo e executar:

    https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi

5. definir o WLS2 como a versão padrão, também no PowerShell, executando essa linha de comando:

    wsl --set-default-version 2

6. instalar a versão do linux da sua escolha, na Miscrosoft Store.

Ao iniciar o ubuntu pela primeira vez após a instalação no botão Iniciar disponível na MS Store mesmo, será solicitado que você crie um usuário e senha.

Pronto, WLS ativado e Ubuntu instalado.

### Agora vamos instalar e pesonalizar o Windows Terminal, que é um terminal mais amigável:

1. Na MS Store procurar por Windows Terminal (WT), instalar e iniciar.

2. configurar para que ele abra por padrão o Ubuntu, na seta ^ ao lado do + de abrir nova guia no WT, vá em configurações, e em perfil padrão altere para a versão do linux instalada. Reinicie o WT para abrir o Ubuntu. Se quiser alterar o idioma, basta clicar em aparência e escolher o idioma da sua preferência.

3. para mudar o tema, é só ir em configurações | padrões (escolha o Linux que instalou), e na tela ao lado, clique em Aparência e altere o Tema em Esquema de Cores.

    Para instalar outros Temas, será por um objeto JSON (copiado nos links abaixo) que deverá ser colado no WT, em configurações | abrir o arquivo JSON, navegue no arquivo até encontrar "schemes", e cole o JSON do tema que copiou. Atenção para colar depois dos colchetes e finalizar com um vírgula. Salve o arquivo e pronto, o tema está instalado. Pronto!

### Dicas

Você pode usar um comando para acessar a pasta em que você está neste ambiente de Ubuntu (a estrutura de pastas é a mesma de uma instalação Linux), no ambiente gráfico do windows (os ambientes são integrados), usando o comando:

    explorer.exe .

Vamos integrar o VSCode com este ambiente. Abrimos o VSCode no windows e instalamos a extensão Remote WSL, bastando instalar para fazer essa integração.

Então basta abrir algum projeto deste ambiente com VSCode no WT com o comando:

    code .

E pronto, você verá no canto inferior esquerdo do VSCode, a informação de que ele está sendo executado no Ubuntu via WSL.

Neste caso, o terminal que será aberto dentro o VSCode é o terminal do ambiente no qual está, seja o Ubuntu ou o Windows.

Por fim, não sei se foi um erro meu, mas ao abrir um projeto o VSCode me informava que estava sendo executado no WLS 1, e para fazer essa conversão para o 2, abra o powerShell e cole o seguinte comando (onde Ubuntu-20.04 deve ser trocado pela distro que estiver usando):

    wsl --set-version Ubuntu-20.04 2

Por hora isso é tudo!

#### Fontes

[WSL 2 - A solução para rodar Linux dentro do Windows 10 - Root #08 - Rocketseat:](https://www.youtube.com/watch?v=hd6lxt5iVsg)

[Guia da microsoft:](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqblNsTHZpdDhmSHFPeGttZFB5TFY1emtocERzZ3xBQ3Jtc0trd3EzOHhGdW4xZEs0bUFNLUd0M3hKZFRRYzJVd2xaS3lSbjZkQS1HU2RIcmlGb1Nhb0NLMkU5TjFydDFQSGx2RlVydnl0bEpJd0QzZXpfeFVZT09GLVVTWk1fdVlacWY3QmlxcTh4X1ppU1IwR0tldw&q=https%3A%2F%2Fdocs.microsoft.com%2Fpt-br%2Fwindows%2Fwsl%2Finstall-win10)

[Ubuntu (Microsoft Store):](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbTBhVWJWalR3b0VQdFk5Z090WU9NTFlFWWo4Z3xBQ3Jtc0ttZFM1MHRvV1N0UHZNNUhEQ2VXSG9WZ3d0a3BObE1RTzVPS0dyVFJ1MzRMY2NZazJ1SU1TWGtyRTJMT3g1X3pnZ0VNNV9USzVJQjBsZFB1amJuYVZ5UXhSOFpQVmJxNUVWd3Rsam1mYzVFMllyTEtJZw&q=https%3A%2F%2Fwww.microsoft.com%2Fpt-br%2Fp%2Fubuntu-2004-lts%2F9n6svws3rx71%3Factivetab%3Dpivot%3Aoverviewtab)

[Windows Terminal (Microsoft Store):](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqa1pTb0RXTWtqTF9tUTJzaGJYUXFrbHFjNTNqQXxBQ3Jtc0tuNTE0TXR6OU5HeXlNZjFfSHF3bGt5VWVuWDYyemlmV0VxV09XdFVoQzMzY2prN3I1TF80Z0g3aXlYT2tBazB2S3YzSW0zOXdBYVFRM0J0czVmVk1GOUVkbXFNYmU0Vzh5LUhlNVlWZHZsTTRmN3B2Yw&q=https%3A%2F%2Fwww.microsoft.com%2Fpt-br%2Fp%2Fwindows-terminal%2F9n0dx20hk701%23activetab%3Dpivot%3Aoverviewtab)

[Temas para Windows terminal:](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbHNDN014QlI0eGN0RFR1c1p3cFk1OHRvOFlKQXxBQ3Jtc0ttamZmcW5TbmJYM1ZuSV9HdFpIczBBTExwMHBBbUZ6bjdiSjlkaHNRdC1sa3JJbk94cUI3NTRJeUR6UUUzREhjV0E1bHVseGJubUZvWHhxTlU4b3QydTFVSGZ1RnUyaWNoTnNoUjlBUkotUG4wcWg5WQ&q=https%3A%2F%2Fwindowsterminalthemes.dev)

[Omni para Windows Terminal:](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbGhBZzRRUWU4NW90NVJKN1JxMnRDck5samNxQXxBQ3Jtc0tuTGJTRnhFc3J3ZzVCTWtnakdWRXpMRVBBaTZsREhXV1h5LTZCYW9aT2VBOHB4bmw2cTI1T2ZzSWlkV3RzcFVubVFneEVnN1hHQVh6cUlOX01INVNncGxPQlFIZ3VZdmgycU5wVk9OZzF3Z1Y4S1dMNA&q=https%3A%2F%2Fgithub.com%2Fgetomni%2Fwindows-terminal)

[Para usar o WSL com o VSCode:](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbXB3RlQtUmM1M0p1bmVSMDJRMGt6ZjRldnM1QXxBQ3Jtc0tsZ25vaFpxOHNzRHIyblUzMk1vVjJsd0IyNzdSNzd4UWVLclR5R3NHbTlGX2pWQmZBdUlCTWtBRE1xeHZiVUp5alByTks4MzhPRmtjQU0zeWJIMWFLMUNZTHByYXpFbnNVQXd6ZGtLemg3ejcxcVlRaw&q=https%3A%2F%2Fgithub.com%2FMicrosoft%2Fvscode-remote-release)