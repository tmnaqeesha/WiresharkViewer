package com.example.wiresharkviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPV4 extends AppCompatActivity {

    ListView lstStockItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ipv4);
        lstStockItems = findViewById(R.id.lstStockItems);

        FillList();
    }

    public void FillList() {
        try {

            Items items = new Items();
            List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
            String[] from = {"ItemRef", "Item", "Supplier", "LatestStock", "SalePrice", "BinNumber", "Balance"};
            int[] views = {R.id.txtItemRef, R.id.txtItemName, R.id.txtSupplier,
                    R.id.txtLatestStock, R.id.txtSalePrice, R.id.txtBinNumber, R.id.txtBalance};

            List<Items> lsr = items.GetItems();

            for (int i = 0; i < lsr.size(); i++) {
                Map<String, String> datanum = new HashMap<String, String>();
                datanum.put("ItemRef", lsr.get(i).ItemRef);
                datanum.put("Item", String.valueOf(lsr.get(i).Item));
                datanum.put("Supplier", String.valueOf(lsr.get(i).Supplier));
                datanum.put("LatestStock", String.valueOf(lsr.get(i).LatestStock));
                datanum.put("SalePrice", String.valueOf(lsr.get(i).SalePrice));
                datanum.put("BinNumber", String.valueOf(lsr.get(i).BinNumber));
                datanum.put("Balance", String.valueOf(lsr.get(i).Balance));
                prolist.add(datanum);
            }

            final SimpleAdapter simpleAdapter = new SimpleAdapter(IPV4.this,
                    prolist, R.layout.table_ipv4, from,
                    views);
            lstStockItems.setAdapter(simpleAdapter);
        } catch (Exception ex) {
            Toast.makeText(IPV4.this, ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
        }
    }
}