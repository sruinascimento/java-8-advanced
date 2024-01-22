package br.com.rsfot.stream.exercise;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

import static java.math.BigDecimal.ZERO;

public class Exercise003 {
    static class Product {
        private String name;
        private BigDecimal price;
        private int quantity;

        public Product(String name, BigDecimal price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Xbox Series X", new BigDecimal("4500"), 10),
                new Product("PS4", new BigDecimal("2500"), 5),
                new Product("PS5", new BigDecimal("5000"), 10),
                new Product("Nintendo Switch", new BigDecimal("3000"), 2));



        //a
        System.out.println("Ordene a lista de produtos pelo preço em ordem decrescente.");

        products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .forEach(System.out::println);


        //b
        System.out.println("Calcule o preço total dos produtos.");

        BigDecimal amountPriceOfProducts = products.stream()
                .map(Product::getPrice)
                .reduce(ZERO, BigDecimal::add);

        System.out.println(amountPriceOfProducts);

        //c

        System.out.println("Encontre o produto mais caro na lista.");

        Product productMoreExpensive = products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .get();
        System.out.println(productMoreExpensive);


        //bônus

        System.out.println("Encontre o produto mais barato na lista.");

        Product productCheapest = products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .get();
        System.out.println(productCheapest);


    }
}
