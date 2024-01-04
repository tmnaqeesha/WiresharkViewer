package com.example.wiresharkviewer;

import java.util.ArrayList;
import java.util.List;

public class Items_arp {

    public String arp_id;
    public String arp_msrc;
    public String arp_mdest;
    public int arp_ipsrc;
    public int arp_ipdest;
    public String arp_hard;
    public int arp_protocol;


    public Items_arp() {

    }

    public Items_arp (String id_arp, String msrc_arp, String mdest_arp, int ipsrc_arp,
                      int ipdest_arp, String hard_arp, int protocol_arp) {

        arp_id = id_arp;
        arp_msrc = msrc_arp;
        arp_mdest = mdest_arp;
        arp_ipsrc = ipsrc_arp;
        arp_ipdest = ipdest_arp;
        arp_hard = hard_arp;
        arp_protocol = protocol_arp;

    }

    public List<Items_arp> GetItems() {
        List<Items_arp> lstArp = new ArrayList<Items_arp>();

        lstArp.add(new Items_arp("IT1001", "Weetabix Original 430g", "Weetabix",
                57, 9, "B7", 50));

        lstArp.add(new Items_arp("IT1002", "Weetabix Chocolate 500g", "Weetabix",
                136, 122, "B8", 120));

        lstArp.add(new Items_arp("IT1003", "Milo Honey Stars 500g", "Nestle",
                90, 89, "B1", 80));

        return lstArp;
    }

}