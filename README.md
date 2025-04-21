## Selenium Java Automation
Este projeto contém a automação de testes utilizando Selenium e Java, configurado para rodar com JDK 19. A automação é implementada utilizando a estrutura de testes JUnit e Cucumber com BDD (Behavior Driven Development). O Maven é utilizado como ferramenta de build e gerenciamento de dependências.

# Pré-requisitos
Antes de rodar o projeto, você precisa garantir que os seguintes requisitos estão instalados e configurados corretamente em sua máquina:

1. Java Development Kit (JDK)
   Este projeto foi configurado para rodar com JDK 19. Você pode baixar o JDK a partir do site oficial da OpenJDK ou utilizar uma distribuição como Adoptium.

Para garantir que o JDK 19 está configurado corretamente, execute:


- java -version

Se a versão exibida não for JDK 19, siga as instruções abaixo para configurar a variável JAVA_HOME corretamente.

2. Maven

O Maven é utilizado para gerenciar dependências e executar os testes. Você pode verificar se o Maven está instalado com o comando:


- mvn -version

Caso o Maven não esteja instalado, siga as instruções de instalação no site oficial do Maven.

3. Configuração da variável JAVA_HOME
   Após instalar o JDK, é necessário configurar a variável de ambiente JAVA_HOME para o diretório onde o JDK está instalado. No Windows, adicione a variável de ambiente JAVA_HOME apontando para o diretório do JDK.

Exemplo de como definir JAVA_HOME para JDK 19:

- Vá em Configurações do sistema > Variáveis de ambiente.

- Adicione uma nova variável de ambiente:

- Nome: JAVA_HOME

- Valor: O diretório onde o JDK 19 foi instalado, por exemplo, C:\Program Files\Java\jdk-19.

- Atualize a variável Path e adicione ;%JAVA_HOME%\bin ao final do valor.

Após a configuração, execute o comando novamente para verificar:


- echo %JAVA_HOME%

4. Configuração do Maven no IntelliJ


   Abra o IntelliJ IDEA.

- Vá para File > Project Structure.

- Em Project SDK, selecione JDK 19.

- Garanta que o Maven esteja utilizando o JDK 19 na configuração do SDK.


# Como rodar os testes
1. Compilar e rodar os testes via Maven
   Abra o terminal no diretório do projeto e execute o seguinte comando para compilar e rodar os testes:


- mvn clean test
2. Rodando os testes via IntelliJ IDEA
   No IntelliJ, vá até a classe do Runner.

- Clique com o botão direito e selecione Run 'NomeDoRunner'.

Isso deve rodar os testes de forma interativa e gerar o relatório de execução.

# Dependências do Projeto
Este projeto usa as seguintes dependências principais:

Selenium Java - Para automação de testes de UI.

Cucumber - Para implementar BDD (Behavior Driven Development).

JUnit - Framework de testes unitários.

As dependências são gerenciadas através do Maven no arquivo pom.xml.


# Observações

Se houver algum erro relacionado a versão do Java, verifique se o JAVA_HOME está configurado corretamente.

Caso o Maven esteja com problemas de dependências, rode o comando para limpar o repositório local do Maven:

- mvn clean install

Para mais detalhes sobre a execução de testes com Cucumber, consulte a documentação oficial.

