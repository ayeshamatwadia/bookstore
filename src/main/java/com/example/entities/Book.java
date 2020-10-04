package com.example.entities;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlAttribute
    private String category;

    @XmlElement
    private String title;

    @XmlElement
    private int year;

    @XmlElement
    private double price;

    @XmlElement(name = "author")
    @XmlElementWrapper(name="authors")
    private List<String> authorList = new ArrayList<>();

    public Book() {
    }

    public Book(String category, String title, int year, double price, List<String> authorList) {
        this.category = category;
        this.title = title;
        this.year = year;
        this.price = price;
        this.authorList = authorList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", title=" + title +
                ", year=" + year +
                ", price=" + price +
                ", authors=" + authorList +
                '}';
    }
}
