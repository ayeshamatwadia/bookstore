package com.example;

import com.example.entities.Bookstore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class MainMethod {
    public static void main(String[] args) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("bookstore.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Bookstore bookstore= (Bookstore) jaxbUnmarshaller.unmarshal(is);
            System.out.println("____________ first book is"+ bookstore.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
