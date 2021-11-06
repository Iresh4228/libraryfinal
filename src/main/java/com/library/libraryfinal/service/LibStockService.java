package com.library.libraryfinal.service;


import com.library.libraryfinal.model.Library_stock;

import java.util.List;

public interface LibStockService {

    void saveStocks(Library_stock library_stock);

    List<Library_stock> getAllUsers();

    void updateStocks(Integer id, Library_stock library_stock);

    void deleteStocks(Integer id);
}
