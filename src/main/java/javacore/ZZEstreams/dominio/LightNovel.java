package javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
