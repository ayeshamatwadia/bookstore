package com.example.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Author {

    @XmlElement(name = "author")
    private String author;

    public Author() {
    }

    public String getName() {
        return author;
    }

    public void setName(String value) {
        this.author = value;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }
}
