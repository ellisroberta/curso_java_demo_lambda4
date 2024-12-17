package model.entities;

// Classe que representa um produto com nome e preço
public class Product {

    private String name; // Nome do produto
    private Double price; // Preço do produto

    // Construtor para inicializar o produto
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método estático para converter o nome do produto em caixa alta
    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase(); // Retorna o nome do produto em caixa alta
    }

    // Método não estático para converter o nome do produto em caixa alta
    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }

    // Método toString para representar o produto como uma string
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price); // Formata o preço com duas casas decimais
    }
}