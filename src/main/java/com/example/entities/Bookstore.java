package com.example.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="bookstore")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bookstore {

    @XmlElement(required = false, name = "book")
    private List<Book> books = new ArrayList<>();

    public Bookstore() {
    }

    public Bookstore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "books=" + books +
                '}';
    }
}
