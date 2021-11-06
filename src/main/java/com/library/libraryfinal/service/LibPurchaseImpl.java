package com.library.libraryfinal.service;



import com.library.libraryfinal.model.Library_purchase;
import com.library.libraryfinal.repository.Librarypurchaserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibPurchaseImpl implements LibPurchaseService {

    @Autowired
    private Librarypurchaserepository librarypurchaserepository;

    @Override
    public void savePurchases(Library_purchase library_purchase) {
        librarypurchaserepository.save(library_purchase);
    }

    @Override
    public List<Library_purchase> getAllPurchases() {
        List<Library_purchase> allPurchasesList = new ArrayList<>();
        librarypurchaserepository.findAll().forEach(allPurchasesList::add);
        return allPurchasesList;
    }

    @Override
    public void updatePurchases(Integer id, Library_purchase library_purchase) {
        library_purchase.setIdpurchase(id);
        librarypurchaserepository.save(library_purchase);
    }

    @Override
    public void deletePurchases(Integer id) {
        librarypurchaserepository.deleteById(id);
    }


}
