package com.test.counter.controller;

import com.test.counter.dto.ItemCountDTO;
import com.test.counter.service.ArrayCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArrayCounterController {

    private final ArrayCounterService arrayCounterService;

    @Autowired
    public ArrayCounterController(ArrayCounterService arrayCounterService) {
        this.arrayCounterService = arrayCounterService;
    }

    @GetMapping("/count-items")
    public List<ItemCountDTO> getCountItems() {
        return arrayCounterService.countItems();
    }
}
