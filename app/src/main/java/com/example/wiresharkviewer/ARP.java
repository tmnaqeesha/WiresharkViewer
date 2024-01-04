package com.example.wiresharkviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ARP extends AppCompatActivity {

    ListView lstArpItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_arp);
        lstArpItems = findViewById(R.id.lstArpItems);
        FillList();
    }

    public void FillList() {
        try {

            Items_arp itemsarp = new Items_arp();
            List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
            String[] from = {"arp_id", "arp_msrc", "arp_mdest", "arp_ipsrc", "arp_ipdest", "arp_hard", "arp_protocol"};
            int[] views = {R.id.txtArpId, R.id.txtArpMsrc, R.id.txtArpMdest,
                    R.id.txtArpIpsrc, R.id.txtArpIpdest, R.id.txtArpHard, R.id.txtArpProtocol};

            List<Items_arp> lsr = itemsarp.GetItems();

            for (int i = 0; i < lsr.size(); i++) {
                Map<String, String> datanum = new HashMap<String, String>();
                datanum.put("arp_id", lsr.get(i).arp_id);
                datanum.put("arp_msrc", String.valueOf(lsr.get(i).arp_msrc));
                datanum.put("arp_mdest", String.valueOf(lsr.get(i).arp_mdest));
                datanum.put("arp_ipsrc", String.valueOf(lsr.get(i).arp_ipsrc));
                datanum.put("arp_ipdest", String.valueOf(lsr.get(i).arp_ipdest));
                datanum.put("arp_hard", String.valueOf(lsr.get(i).arp_hard));
                datanum.put("arp_protocol", String.valueOf(lsr.get(i).arp_protocol));
                prolist.add(datanum);
            }

            final SimpleAdapter simpleAdapter = new SimpleAdapter(ARP.this,
                    prolist, R.layout.table_arp, from,
                    views);
            lstArpItems.setAdapter(simpleAdapter);
        } catch (Exception ex) {
            Toast.makeText(ARP.this, ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
        }
    }
}