package com.example.futbol.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.futbol.model.Camiseta;
import com.example.futbol.repository.CamisetaRepository;

@Service
public class CamisetaService {

    private final CamisetaRepository repository;

    public CamisetaService(CamisetaRepository repository) {
        this.repository = repository;
    }

    public List<Camiseta> getAll() {
        return repository.findAll();
    }

    public Camiseta getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Camiseta save(Camiseta camiseta) {
        return repository.save(camiseta);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
