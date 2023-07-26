package com.example.configclient.service;

import com.example.configclient.feign.BookServiceClient;
import com.example.configclient.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    private BookServiceClient bookServiceClient;

    public ClientServiceImp(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookServiceClient.getAllBooks();
    }
}
