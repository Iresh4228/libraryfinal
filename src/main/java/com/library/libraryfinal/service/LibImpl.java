package com.library.libraryfinal.service;


import com.library.libraryfinal.model.Library_book;
import com.library.libraryfinal.repository.Librarybookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibImpl implements LibService {

    @Autowired
    private Librarybookrepository librarybookrepository;

    @Override
    public void addBooks(@Valid Library_book librarybook) {
        librarybookrepository.save(librarybook);}

    @Override
    public List<Library_book> getAllBooks() {
        List<Library_book> librarybookList = new ArrayList<>();
        librarybookrepository.findAll().forEach(librarybookList::add);
        return librarybookList;
    }

    @Override
    @Transactional
    public Optional<Library_book> updateBooks(Integer id, Library_book librarybook) {
        return librarybookrepository.findById(id).map(e->{
            e.setBookname(librarybook.getBookname());
            e.setBooktype(librarybook.getBooktype());
            return e;
        });
    }


    @Override
    public void deleteBooks(Integer id) {
        librarybookrepository.deleteById(id);
    }

    @Override
    public Library_book getById(Integer id) {
        Optional<Library_book> pmed = Optional.ofNullable(librarybookrepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid med Id")));
        Library_book librarybook = pmed.get();
        return librarybook;
    }

}
