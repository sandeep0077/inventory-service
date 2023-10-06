package com.programmingtecchie.inventoryservice.service;


import com.programmingtecchie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor

public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean inStock(String skuCode){
       return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
