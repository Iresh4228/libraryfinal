package com.library.libraryfinal.service;


import com.library.libraryfinal.model.Library_book;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface LibService {
    void addBooks(@Valid Library_book librarybook);

    List<Library_book> getAllBooks();

    public Optional<Library_book> updateBooks(Integer id, Library_book librarybook);

    void deleteBooks(Integer id);

    public Library_book getById(Integer id);
}
