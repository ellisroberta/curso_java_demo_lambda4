package application;

import model.entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        // Criando uma lista de produtos
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00)); // Adicionando um novo produto à lista
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Usando stream para transformar a lista de produtos em uma lista de nomes em caixa alta
        List<String> names = list.stream()
                .map(Product::nonStaticUpperCaseName) // Chamando o método não estático para converter o nome em caixa alta
                .collect(Collectors.toList()); // Coleta o resultado em uma nova lista
        // 'collect(toList())' pode ser substituído por 'toList()'

        // Exibindo os nomes dos produtos em caixa alta
        names.forEach(System.out::println); // Usando referência de método para imprimir cada nome
    }
}