package com.example.configclient.controller;

import com.example.configclient.model.Book;
import com.example.configclient.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/client")

public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return clientService.getAllBooks();
    }
}
