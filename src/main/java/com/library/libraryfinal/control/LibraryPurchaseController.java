package com.library.libraryfinal.control;


import com.library.libraryfinal.model.Library_purchase;
import com.library.libraryfinal.service.LibPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryPurchaseController {

    @Autowired
    private LibPurchaseService libPurchaseService;

    @RequestMapping(method = RequestMethod.POST,value = "/savepurchases")
    public void savePurchases(@RequestBody Library_purchase library_purchase){
        libPurchaseService.savePurchases(library_purchase);}

    @RequestMapping("/getAllPurchases")
    public List<Library_purchase> getAllPurchases(){return libPurchaseService.getAllPurchases();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updatepurchases/{id}")
    public void updatePurchases(@PathVariable Integer id, @RequestBody Library_purchase library_purchase){
        libPurchaseService.updatePurchases(id, library_purchase);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deletepurchases/{id}")
    public void deletePurchases(@PathVariable Integer id){
        libPurchaseService.deletePurchases(id);
    }
}
