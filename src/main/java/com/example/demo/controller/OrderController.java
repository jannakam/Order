package com.example.demo.controller;

import com.example.demo.bo.CreateStockRequest;
import com.example.demo.bo.UpdateStockResponse;
import com.example.demo.service.StockService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final StockService stockService;

    public OrderController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/orders")
    public UpdateStockResponse doOrder(@RequestBody CreateStockRequest customerOrder) {

        UpdateStockResponse response = stockService.updateStock(customerOrder);

        return response;
    }
}