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
        setContentView(R.layout.layout_tcp);
        lstTcpItems = findViewById(R.id.lstArpItems);
        FillList();
    }

    public void FillList() {
        try {

            Items_arp itemstcp = new Items_arp();
            List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
            String[] from = {"arp_id", "arp_msrc", "arp_mdest", "arp_ipsrc", "arp_ipdest", "arp_hard", "arp_protocol"};
            int[] views = {R.id.txtArpId, R.id.txtArpMsrc, R.id.txtArpMdest,
                    R.id.txtArpIpsrc, R.id.txtArpIpdest, R.id.txtArpHard, R.id.txtArpProtocol};

            List<Items_arp> lsr = itemsarp.GetItems();

            for (int i = 0; i < lsr.size(); i++) {
                Map<String, String> datanum = new HashMap<String, String>();
                datanum.put("arp_id", lsr.get(i).id_arp);
                datanum.put("arp_msrc", String.valueOf(lsr.get(i).msrc_arp));
                datanum.put("tcp_pdest", String.valueOf(lsr.get(i).tcp_pdest));
                datanum.put("tcp_nseq", String.valueOf(lsr.get(i).tcp_nseq));
                datanum.put("tcp_nack", String.valueOf(lsr.get(i).tcp_nack));
                datanum.put("tcp_checksum", String.valueOf(lsr.get(i).tcp_checksum));
                datanum.put("tcp_urp", String.valueOf(lsr.get(i).tcp_urp));
                prolist.add(datanum);
            }

            final SimpleAdapter simpleAdapter = new SimpleAdapter(TCP.this,
                    prolist, R.layout.table_tcp, from,
                    views);
            lstTcpItems.setAdapter(simpleAdapter);
        } catch (Exception exx) {
            Toast.makeText(TCP.this, exx.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
        }
    }
}
