# Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.

## Implementação da interface
- Estrutura do Programa
  O programa está dividido em três pacotes: `application`, `util` e `model.entities`.
Cada pacote contém classes que desempenham funções específicas.

  - Classe Product:
  A classe `Product` representa um produto com atributos de nome e preço. Inclui métodos para acessar e modificar esses atributos, além de um método `toString` para formatar a saída.

  - Classe UpperCaseName:
  A classe `UpperCaseName` implementa a interface `Function` para converter o nome de um produto em caixa alta. O método `apply` é onde a transformação acontece.

  - Classe Program:
  A classe `Program` contém o método `main`, onde a lista de produtos é criada e populada. Utiliza streams para transformar a lista de produtos em uma lista de seus nomes em caixa alta, exibindo o resultado no console.

### Uso de Streams
A utilização de streams e a função `map` são uma maneira concisa e eficiente de transformar dados em Java. Nesse caso, cada produto na lista é passado para a função `UpperCaseName`, que retorna o nome em caixa alta.

### Conclusão
O programa demonstra como usar a programação funcional em Java para manipular coleções de objetos de maneira clara e eficiente. É uma boa prática de programação separá-los em diferentes classes e pacotes para melhor organização e reutilização do código.