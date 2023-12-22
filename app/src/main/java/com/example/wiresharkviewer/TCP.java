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

public class TCP extends AppCompatActivity {

    ListView lstTcpItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tcp);
        lstTcpItems = findViewById(R.id.lstTcpItems);
        FillList();
    }

    public void FillList() {
        try {

            Items_tcp itemstcp = new Items_tcp();
            List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
            String[] from = {"tcp_id", "tcp_psrc", "tcp_pdest", "tcp_nseq", "tcp_nack", "tcp_checksum", "tcp_urp"};
            int[] views = {R.id.txtTcpId, R.id.txtTcpPsrc, R.id.txtTcpPdest,
                    R.id.txtTcpNseq, R.id.txtTcpNack, R.id.txtTcpChecksum, R.id.txtTcpUrp};

            List<Items_tcp> lsr = itemstcp.GetItems();

            for (int i = 0; i < lsr.size(); i++) {
                Map<String, String> datanum = new HashMap<String, String>();
                datanum.put("tcp_id", lsr.get(i).tcp_id);
                datanum.put("tcp_psrc", String.valueOf(lsr.get(i).tcp_psrc));
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
