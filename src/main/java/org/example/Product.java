package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String title;
    private Integer price;

    public Product (ProductBuilder builder) {
        this.title = builder.title;
        this.price = builder.price;
    }

    public static class ProductBuilder {
        String title;
        Integer price;

        public ProductBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ProductBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
