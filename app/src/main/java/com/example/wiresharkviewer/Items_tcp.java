package com.example.wiresharkviewer;

import java.util.ArrayList;
import java.util.List;

public class Items_tcp {

    public String tcp_id;
    public String tcp_psrc;
    public String tcp_pdest;
    public int tcp_nseq;
    public int tcp_nack;
    public String tcp_checksum;
    public int tcp_urp;


    public Items_tcp() {

    }

    public Items_tcp (String id_tcp, String psrc_tcp, String pdest_tcp, int nseq_tcp,
                 int nack_tcp, String checksum_tcp, int urp_tcp) {

        tcp_id = id_tcp;
        tcp_psrc = psrc_tcp;
        tcp_pdest = pdest_tcp;
        tcp_nseq = nseq_tcp;
        tcp_nack = nack_tcp;
        tcp_checksum = checksum_tcp;
        tcp_urp = urp_tcp;

    }

    public List<Items_tcp> GetItems() {
        List<Items_tcp> lstTcp = new ArrayList<Items_tcp>();

        lstTcp.add(new Items_tcp("IT1001", "Weetabix Original 430g", "Weetabix",
                57, 9, "B7", 50));

        lstTcp.add(new Items_tcp("IT1002", "Weetabix Chocolate 500g", "Weetabix",
                136, 122, "B8", 120));

        lstTcp.add(new Items_tcp("IT1003", "Milo Honey Stars 500g", "Nestle",
                90, 89, "B1", 80));

        return lstTcp;
    }

}



