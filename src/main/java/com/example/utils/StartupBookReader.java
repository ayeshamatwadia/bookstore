package com.example.utils;

import com.example.entities.Book;
import com.example.entities.Bookstore;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

@WebListener
public class StartupBookReader implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(">>>>>>>>>>>>>>>>>> APPLICATION IS RUNNING INITIALIZATIONS");
        readBookXml();
    }

    private void readBookXml() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("bookstore.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Bookstore bookstore= (Bookstore) jaxbUnmarshaller.unmarshal(is);
            System.out.println("____________ first book is"+ bookstore.toString());
        } catch (JAXBException e) {
            System.out.println(">>>>>>>>>>>>>>>>> FAILED TO BOOKSTORE XML FILE");
            e.printStackTrace();
        }
    }
}
