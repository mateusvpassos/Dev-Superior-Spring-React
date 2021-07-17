package com.mateus.dscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.mateus.dscatalog.domain.Category;
import com.mateus.dscatalog.dtos.CategoryDTO;
import com.mateus.dscatalog.repositories.CategoryRepository;
import com.mateus.dscatalog.services.exceptions.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = categoryRepository.findAll();
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> optional = categoryRepository.findById(id);
        Category category = optional.orElseThrow(() -> new EntityNotFoundException("Entity Not Found!"));
        return new CategoryDTO(category);
    }
}
