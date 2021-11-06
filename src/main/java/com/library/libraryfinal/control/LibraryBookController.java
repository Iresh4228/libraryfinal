package com.library.libraryfinal.control;


import com.library.libraryfinal.model.Library_book;
import com.library.libraryfinal.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryBookController {
    @Autowired
    private LibService libService;

    @RequestMapping(method = RequestMethod.POST,value = "/addBooks")
    public void addBooks(@RequestBody Library_book librarybook){
        libService.addBooks(librarybook);}

    @RequestMapping("/getAllBooks")
    public List<Library_book> getAllBooks(){return libService.getAllBooks();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updateBooks/{id}")
    public void updateBooks(@PathVariable Integer id, @RequestBody Library_book librarybook){
        libService.updateBooks(id, librarybook);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteBooks/{id}")
    public void deleteBooks(@PathVariable Integer id){
        libService.deleteBooks(id);
    }
}
