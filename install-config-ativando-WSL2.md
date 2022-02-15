# Instalando e Configurando o WSL2 no Windows 10

# Links Úteis:

[WSL 2 - A solução para rodar Linux dentro do Windows 10 - Root #08 - Rocketseat
](https://www.youtube.com/watch?v=hd6lxt5iVsg)


# Vamos à instalação:

1. requisitos de sistema:

- Para sistemas x64: Versão 1903 ou superiores, com o Build 18362 ou superiores.
- Para sistemas ARM64: Versão 2004 ou superiores, com o Build 19041 ou superiores.
- Os builds inferiores a 18362 não dão suporte a WSL 2. Use o Assistente do Windows Update para atualizar a sua versão do Windows.

2. já com a versão suportada, vamos para a instalação:

Antes de instalar qualquer distribuição do Linux no Windows, você precisará primeiro habilitar o recurso opcional "Subsistema do Windows para Linux".

Abra o PowerShell como Administrador (menu Iniciar > PowerShell > clicar com o botão direito do mouse > Executar como Administrador) e insira este comando:

dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart




