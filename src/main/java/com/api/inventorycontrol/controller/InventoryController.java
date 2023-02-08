package com.api.inventorycontrol.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.api.inventorycontrol.model.InventoryModel;
import com.api.inventorycontrol.repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class InventoryController {

    private final InventoryRepository repository;

    public InventoryController(InventoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/mymodels")
    public List<InventoryModel> getAll() {
        return repository.findAll();

    }

    @PostMapping("/mymodels")
    public InventoryModel add(@RequestBody InventoryModel inventoryModel){
        return repository.save(inventoryModel);
    }
}
