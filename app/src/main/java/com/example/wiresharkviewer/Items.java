package com.example.wiresharkviewer;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public String ItemRef;
    public String Item;
    public String Supplier;
    public int LatestStock;
    public int SalePrice;
    public String BinNumber;
    public int Balance;

    public Items() {

    }

    public Items(String itemRef, String item, String supplier, int latestStock,
                 int salePrice, String binNumber, int balance) {
        ItemRef = itemRef;
        Item = item;
        Supplier = supplier;
        LatestStock = latestStock;
        SalePrice = salePrice;
        BinNumber = binNumber;
        Balance = balance;
    }

    public List<Items> GetItems() {
        List<Items> lstItems = new ArrayList<Items>();

        lstItems.add(new Items("IT1001", "Weetabix Original 430g", "Weetabix",
                57, 9, "B7", 50));

        lstItems.add(new Items("IT1002", "Weetabix Chocolate 500g", "Weetabix",
                136, 122, "B8", 120));

        return lstItems;
    }

}