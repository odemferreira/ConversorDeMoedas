# Conversor De Moedas
Este código é um aplicativo de conversão de moedas escrito em Java. Ele usa a API `exchangerate-api.com` para obter as taxas de câmbio atuais e realizar conversões entre diferentes moedas.

O aplicativo é composto por duas classes principais:

1. `CurrencyConverterApp`: Esta é a classe principal que contém o método `main`. Ela cria uma instância da classe `ConversorDeMoedas` e entra em um loop, permitindo que o usuário escolha entre várias opções de conversão de moeda. O usuário pode converter entre Dólar, Peso Argentino, Real Brasileiro e Peso Colombiano. O aplicativo continua a executar até que o usuário escolha a opção para sair.

2. `ConversorDeMoedas`: Esta classe é responsável por obter as taxas de câmbio da API `exchangerate-api.com`. Ela faz isso ao enviar uma solicitação GET para a API e analisar a resposta JSON para obter a taxa de câmbio relevante.

O aplicativo é simples e fácil de usar, fornecendo uma interface de usuário baseada em texto que guia o usuário através das opções disponíveis. Ele demonstra o uso de várias técnicas de programação em Java, incluindo manipulação de strings, entrada/saída, manipulação de exceções e interação com APIs da web. Além disso, ele também faz uso da biblioteca Gson para analisar a resposta JSON da API. 

Por favor, note que você precisa substituir a chave da API no construtor `ConversorDeMoedas` com uma chave válida para a API de taxa de câmbio.
**Tecnologias Utilizadas:**
- Java: A linguagem de programação usada para escrever o código.
- API de taxa de câmbio: Usada para obter as taxas de câmbio atuais.

**Dependências e Versões Necessárias:**
- Java Development Kit (JDK): Necessário para compilar e executar o código Java. Recomenda-se usar a versão mais recente do JDK.
- Gson: Uma biblioteca Java que é usada para converter objetos Java em sua representação JSON e vice-versa. É necessário adicionar essa dependência ao seu projeto.

**Como rodar o projeto:**
1. Certifique-se de que o JDK está instalado em seu sistema.
2. Adicione a biblioteca Gson ao seu projeto.
3. Compile o código Java usando um compilador Java (como `javac`).
4. Execute o programa usando a JVM (Java Virtual Machine). O ponto de entrada é a classe `CurrencyConverterApp`.

**Como rodar os testes:**
Atualmente, o código não inclui nenhum teste automatizado. Você pode testar o programa manualmente executando-o e interagindo com ele.

**Rotas:**
O código não usa rotas no sentido tradicional de uma aplicação web. Em vez disso, ele se conecta à API de taxa de câmbio para obter as taxas de câmbio atuais.

**Retorno:**
O programa retorna a quantidade convertida de uma moeda para outra, com base na taxa de câmbio atual obtida da API de taxa de câmbio. Ele imprime essa informação no console. Se ocorrer um erro ao obter a taxa de câmbio, o programa lançará uma exceção. 

Por favor, note que você precisa substituir a chave da API no construtor `ConversorDeMoedas` com uma chave válida para a API de taxa de câmbio.
