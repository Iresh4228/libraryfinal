package com.library.libraryfinal.control;


import com.library.libraryfinal.model.Library_stock;
import com.library.libraryfinal.service.LibStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryStockController {

    @Autowired
    private LibStockService libStockService;

    @RequestMapping(method = RequestMethod.POST, value = "/addstock")
    public void saveStocks(@RequestBody Library_stock library_stock) {
        libStockService.saveStocks(library_stock);
    }

    @RequestMapping("/getAllStocks")
    public List<Library_stock> getAllStocks(){return libStockService.getAllUsers();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updatestocks/{id}")
    public void updateStocks(@PathVariable Integer id, @RequestBody Library_stock library_stock){
        libStockService.updateStocks(id, library_stock);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteStocks/{id}")
    public void deleteStocks(@PathVariable Integer id){
        libStockService.deleteStocks(id);
    }

}
