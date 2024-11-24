/*
README - Conversor de Moedas

Descrição:
-----------
Este projeto é um programa Java que realiza conversões de moedas utilizando dados em tempo real 
providos pela API ExchangeRate-API. Ele oferece uma interface baseada em console para que o 
usuário escolha as moedas, insira o valor e veja os resultados das conversões.

Funcionalidades:
-----------------
1. Conversões disponíveis:
   - Dólar para Real
   - Real para Dólar
   - Euro para Iene
   - Iene para Euro
   - Euro para Dólar
   - Dólar para Euro

2. Conexão com API:
   O programa utiliza a API ExchangeRate-API para obter taxas de câmbio atualizadas.

3. Simplicidade:
   Um menu intuitivo no console facilita a interação do usuário.

Pré-requisitos:
----------------
1. Java JDK 8 ou superior.
2. Biblioteca Gson para manipulação de JSON:
   - Adicione a biblioteca ao seu projeto (via Maven ou manualmente).
     Exemplo para Maven:
     <dependency>
         <groupId>com.google.code.gson</groupId>
         <artifactId>gson</artifactId>
         <version>2.8.8</version>
     </dependency>
3. Chave de acesso válida para a ExchangeRate-API.
   - Substitua a chave "0c42db960eee03bdc5acec92" na classe `Conversor` pela sua chave pessoal.

Como usar:
-----------
1. Compile o código:
   $ javac Main.java Conversor.java

2. Execute o programa:
   $ java Main

3. Siga as instruções no menu:
   - Escolha a opção de conversão.
   - Insira o valor a ser convertido.

Exemplo de saída:
------------------
Opção: 1 (Dólar para Real)
Valor: 100
Saída:
  A taxa de cambio é 5.34
  O valor final é de 534.0

Estrutura do código:
---------------------
1. Classe `Main`:
   - Gerencia o menu e a interação com o usuário.
   - Realiza chamadas à classe `Conversor` para executar as conversões.

2. Classe `Conversor`:
   - Faz a conexão com a API e obtém os dados.
   - Calcula o valor convertido com base na taxa de câmbio.

Melhorias futuras:
-------------------
1. Adicionar suporte a mais pares de moedas.
2. Melhorar a interface de usuário com uma GUI.
3. Permitir salvamento de conversões para uso futuro.
*/
