package application;

import model.entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        // Criando uma lista de produtos
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00)); // Adicionando um novo produto à lista
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Definindo uma expressão lambda que transforma o nome do produto em caixa alta
        Function<Product, String> func = p -> p.getName().toUpperCase();

        // Usando stream para aplicar a expressão lambda e coletar os nomes em caixa alta em uma nova lista
        List<String> names = list.stream()
                .map(func)// Aplica a expressão lambda
                .collect(Collectors.toList());// Coleta o resultado em uma nova lista
        // 'collect(toList())' pode ser substituído por 'toList()'

        // Exibindo os nomes dos produtos em caixa alta
        names.forEach(System.out::println); // Usando referência de método para imprimir cada nome
    }
}