package com.library.libraryfinal.service;



import com.library.libraryfinal.model.Library_stock;
import com.library.libraryfinal.repository.Librarystockrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibStockImpl implements LibStockService {

    @Autowired
    private Librarystockrepository librarystockrepository;


    @Override
    public void saveStocks(Library_stock library_stock) {
        librarystockrepository.save(library_stock);}

    @Override
    public List<Library_stock> getAllUsers() {
        List<Library_stock> library_stockList = new ArrayList<>();
        librarystockrepository.findAll().forEach(library_stockList::add);
        return library_stockList;
    }

    @Override
    public void updateStocks(Integer id, Library_stock library_stock) {
        library_stock.setBookstk_id(id);
        librarystockrepository.save(library_stock);
    }

    @Override
    public void deleteStocks(Integer id) {
        librarystockrepository.deleteById(id);
    }


}
