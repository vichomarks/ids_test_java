package com.test.counter.service;

import com.test.counter.dto.ItemCountDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArrayCounterService {

    private final List<String> arrayA = List.of(
        "Mochila", "Plátano", "Manzana", "Auto", "Manzana", "Celular", "Lámpara",
        "Plátano", "Pera", "Monitor", "Escritorio", "CPU", "Bocina", "Mouse",
        "Manzana", "Teclado", "Manzana", "Plátano"
    );

    private final List<String> arrayB = List.of("Manzana", "Plátano", "Pera");

    public List<ItemCountDTO> countItems() {
        Map<String, Integer> countMap = new HashMap<>();

        // Inicializa el conteo para cada item en arrayB
        for (String itemB : arrayB) {
            countMap.put(itemB, 0);
        }

        // Cuenta las ocurrencias de cada elemento en arrayB dentro de arrayA
        for (String itemA : arrayA) {
            if (countMap.containsKey(itemA)) {
                countMap.put(itemA, countMap.get(itemA) + 1);
            }
        }

        // Convierte los resultados en una lista de ItemCountDTO
        List<ItemCountDTO> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.add(new ItemCountDTO(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
