# Conversor de Moedas

Bem-vindo ao projeto de Conversor de Moedas! Este é um aplicativo de linha de comando em Java que utiliza a API da ExchangeRateAPI para converter valores entre diferentes moedas. Este projeto também faz uso das bibliotecas `gson` para a conversão de JSON e `dotenv-java` para a segurança da API key.

## Funcionalidades

- Converter Dólar (USD) para Peso Argentino (ARS)
- Converter Peso Argentino (ARS) para Dólar (USD)
- Converter Dólar (USD) para Real Brasileiro (BRL)
- Converter Real Brasileiro (BRL) para Dólar (USD)
- Converter Dólar (USD) para Peso Colombiano (COP)
- Converter Peso Colombiano (COP) para Dólar (USD)

## Pré-requisitos

- Java 8 ou superior
- Maven
- Conta na [ExchangeRateAPI](https://exchangerate-api.com/) para obter a API key

## Instalação

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/conversor-de-moedas.git
    cd conversor-de-moedas
    ```

2. Instale as dependências:
    ```sh
    mvn clean install
    ```

3. Configure sua API key:
    - Crie um arquivo `.env` na raiz do projeto.
    - Adicione sua chave da API no arquivo `.env`:
        ```env
        EXCHANGERATE_API_KEY=sua_api_key_aqui
        ```

## Como Usar

1. Compile o projeto:
    ```sh
    mvn clean package
    ```

2. Execute o aplicativo:
    ```sh
    java -jar target/conversor-de-moedas-1.0.jar
    ```

3. Siga as instruções no menu para realizar conversões de moeda.

## Estrutura do Projeto

- `src/main/java/me/sloowy/currencyconverter/cli/Menu.java`: Classe principal que contém o menu e a lógica para interação com o usuário.
- `src/main/java/me/sloowy/currencyconverter/services/ApiService.java`: Classe que faz as chamadas à API e realiza a conversão de moedas.

## Exemplo de Uso

```sh
******************************************************
[ Seja bem-vindo(a) ao Conversor de Moedas ]

(1) Dólar ==> Peso Argentino
(2) Peso Argentino ==> Dólar
(3) Dólar ==> Real Brasileiro
(4) Real Brasileiro ==> Dólar
(5) Dólar ==> Peso Colombiano
(6) Peso Colombiano ==> Dólar
(0) Sair

Escolha uma opção válida:
******************************************************

Digite a opção desejada:
3
Digite o valor que deseja converter:
100
Resultado: 100 USD é igual a X BRL
