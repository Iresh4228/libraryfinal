package com.library.libraryfinal.service;


import com.library.libraryfinal.model.Library_purchase;

import java.util.List;

public interface LibPurchaseService {
    void savePurchases(Library_purchase library_purchase);

    List<Library_purchase> getAllPurchases();

    void updatePurchases(Integer id, Library_purchase library_purchase);

    void deletePurchases(Integer id);
}
