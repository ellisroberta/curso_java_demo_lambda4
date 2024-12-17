package util;

import java.util.function.Function;

import model.entities.Product;

// Classe que implementa a interface Function para converter nomes de produtos em caixa alta
public class UpperCaseName implements Function<Product, String> {

    // O método apply é onde a transformação acontece
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase(); // Retorna o nome do produto em caixa alta
    }
}