# Problema Exemplo

Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta.

## Implementação da Interface

### Estrutura do Programa

O programa está dividido em três pacotes: `application`, `util`, e `model.entities`. Cada pacote contém classes que
desempenham funções específicas.

- **Classe Product**:  
  A classe `Product` representa um produto com atributos de nome e preço. Inclui métodos para acessar e modificar esses 
atributos, além de um método `toString` para formatar a saída.

- **Classe UpperCaseName**:  
  A classe `UpperCaseName` implementa a interface `Function` para converter o nome de um produto em caixa alta. O método
`apply` é onde a transformação acontece.

- **Classe Program**:  
  A classe `Program` contém o método `main`, onde a lista de produtos é criada e populada. Utiliza streams para transformar
a lista de produtos em uma lista de seus nomes em caixa alta, exibindo o resultado no console.

### Uso de Streams

A utilização de streams e a função `map` são uma maneira concisa e eficiente de transformar dados em Java. Nesse caso,
cada produto na lista é passado para a função `UpperCaseName`, que retorna o nome em caixa alta.

### Conclusão

O programa demonstra como usar a programação funcional em Java para manipular coleções de objetos de maneira clara e
eficiente. É uma boa prática de programação separá-los em diferentes classes e pacotes para melhor organização e reutilização do código.

## Reference Method com Método Estático

### Explicação das Modificações

- **Método Estático `staticUpperCaseName`**:  
  Um novo método estático foi adicionado à classe `Product`. Este método aceita um objeto `Product` como parâmetro e
retorna o nome do produto em caixa alta. Isso permite que você use a referência de método `Product::staticUpperCaseName`
na expressão de stream.

- **Uso de Referência de Método**:  
  Na classe `Program`, o método `map` agora utiliza a referência de método para o método estático `staticUpperCaseName` 
da classe `Product`. Isso torna o código mais limpo e elimina a necessidade de uma classe separada para a conversão.

### Conclusão

Essa abordagem simplifica o código e mantém a lógica de transformação relacionada à classe `Product`, facilitando a leitura
e a manutenção. Além disso, usar referências de método é uma prática recomendada quando se trabalha com streams em Java,
pois melhora a legibilidade do código.

## Reference Method com Método Não Estático

### Explicação das Modificações

- **Uso do Método Não Estático**:  
  O método `nonStaticUpperCaseName` é um método de instância, o que significa que ele deve ser chamado em uma instância 
da classe `Product`. Na expressão de stream, você pode usar `Product::nonStaticUpperCaseName`, mas isso é válido apenas 
se você estiver passando uma instância de `Product`. Como este método não é estático, o código atual já está correto e funcional.

- **Referência de Método**:  
  O uso de `Product::nonStaticUpperCaseName` como referência de método é apropriado, pois a expressão `map` é aplicada a
cada elemento da lista `list`, que é uma coleção de `Product`. O método é chamado em cada instância individual da classe `Product`.

### Observações

Quando você usa um método não estático, a referência de método é resolvida em tempo de execução e chamada na instância
correta. Essa abordagem é uma prática comum em programação funcional e melhora a legibilidade do código, tornando-o mais expressivo.

### Conclusão

O código agora utiliza corretamente um método não estático para transformar o nome dos produtos em caixa alta, demonstrando
como referenciar métodos de instância em streams. Essa prática é vantajosa para manter o código limpo e fácil de entender.

## Expressão Lambda Declarada

### Detalhes sobre a Expressão Lambda

- **Importação da Interface Function**:  
  A interface `Function` é uma interface funcional que aceita um argumento e produz um resultado. No caso, ela recebe um
objeto do tipo `Product` e retorna uma `String`.

- **Definição da Lambda**:  
  A expressão lambda `p -> p.getName().toUpperCase()` é uma implementação da interface `Function<Product, String>`. Aqui,
`p` representa uma instância de `Product`. A expressão dentro da lambda (`p.getName().toUpperCase()`) chama o método `getName`
do objeto `Product` e converte o nome em caixa alta.

- **Uso da Lambda com Streams**:  
  A expressão lambda é passada como argumento para o método `map` da stream. Isso transforma cada `Product` na lista `list`
em uma `String` que representa o nome do produto em caixa alta. Em seguida, `collect(Collectors.toList())` coleta os resultados
em uma nova lista chamada `names`.

- **Impressão dos Resultados**:  
  A lista `names` é percorrida com `forEach(System.out::println)` para imprimir cada nome no console.

### Conclusão

O uso de expressões lambda torna o código mais conciso e claro, permitindo a transformação de dados de maneira funcional.
Este estilo é comum em Java 8 e versões posteriores, onde as streams e lambdas proporcionam uma maneira poderosa de trabalhar
com coleções de dados.

## Expressão Lambda Inline

### Detalhes sobre a Expressão Lambda Inline

- **Definição da Lambda**:  
  A expressão lambda `p -> p.getName().toUpperCase()` é definida diretamente dentro do método `map`. Isso significa que 
não há necessidade de criar uma variável adicional para armazenar a função, o que simplifica o código.

- **Parâmetro `p`**:  
  O parâmetro `p` representa uma instância de `Product` que está sendo processada na stream. A lambda é chamada para cada
elemento da lista, permitindo a manipulação de cada `Product` individualmente.

- **Transformação**:  
  O corpo da lambda `p.getName().toUpperCase()` chama o método `getName` na instância de `Product` e transforma o nome
do produto para caixa alta. O resultado é uma `String` que representa o nome em caixa alta.

- **Uso com Streams**:  
  A expressão lambda é parte do fluxo de processamento de dados na stream. O método `map` aplica a transformação a cada
elemento da lista original, produzindo uma nova stream de nomes em caixa alta.

- **Coleta dos Resultados**:  
  `collect(Collectors.toList())` é utilizado para coletar os resultados da stream em uma nova lista, que é armazenada na
variável `names`.

- **Impressão dos Resultados**:  
  Finalmente, `names.forEach(System.out::println)` é usado para imprimir cada nome em caixa alta no console.

### Conclusão

A utilização de expressões lambda inline é uma prática comum e recomendada em Java, especialmente ao trabalhar com streams.
Elas tornam o código mais conciso e fácil de ler, eliminando a necessidade de declarações de variáveis adicionais para funções simples.
Esse estilo de programação funcional é uma das características que tornam o Java 8 e versões posteriores mais poderosos e expressivos.