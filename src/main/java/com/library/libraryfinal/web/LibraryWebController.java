package com.library.libraryfinal.web;


import com.library.libraryfinal.model.Library_book;
import com.library.libraryfinal.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class LibraryWebController {

    @Autowired
    private LibService libService;


    @GetMapping("/showbooks")
    public String getAllMeds(Model model){
        model.addAttribute("show_books", libService.getAllBooks());
        return "viewbooks";
    }

    @GetMapping("/showaddbooks")
    public String showAddBooks(Library_book librarybook){
        return "addBooks";
    }

    @PostMapping("/addnewbooks")
    public String addNewMeds(@Valid Library_book librarybook, BindingResult result){
        if (result.hasErrors()){
            return "addbooks";
        }
        libService.addBooks(librarybook);
        return "redirect:/showbooks";
    }

    @GetMapping("/vieweditbooks/{id}")
    public String viewEditBooks(@PathVariable("id") Integer id, Model model){
        model.addAttribute("show_book", libService.getById(id));
        return "updatebooks";
    }

    @PostMapping("/updatebooks/{id}")
    public String updateBooks(@PathVariable ("id") Integer id, @Valid Library_book librarybook, BindingResult result, Model model){
        if (result.hasErrors()){
            librarybook.setIdbook(id);
            model.addAttribute("show_book", librarybook);
            return "updatebooks";
        }
        Optional<Library_book> pharm_med1 = libService.updateBooks(id, librarybook);
        return "redirect:/showbooks";
    }

    @GetMapping("/deletebooks/{id}")
    public String deleteBooks(@PathVariable ("id") Integer id, Model model){
        libService.deleteBooks(id);
        return "redirect:/showbooks";
    }
}
