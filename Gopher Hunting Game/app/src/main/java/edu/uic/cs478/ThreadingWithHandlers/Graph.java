package edu.uic.cs478.ThreadingWithHandlers;

import android.widget.Button;

import java.util.LinkedList;

public class Graph {
    private int numVertices;
    private LinkedList<Integer> buttonIDList = new LinkedList();


    public LinkedList<Integer> getList(){
        return buttonIDList;
    }
    public int getIndex(int index){
        return buttonIDList.get(index);
    }

    public void addID(int id) {
        buttonIDList.add(id);
    }
    //--------------------------------------------------------
    public void addAllButtons() {
        // 0 - 9
        addID(1000056);
        addID(1000055);
        addID(1000073);
        addID(1000071);
        addID(1000069);
        addID(1000068);
        addID(1000081);
        addID(1000079);
        addID(1000077);
        addID(1000075);
        // 10 - 19
        addID(1000029);
        addID(1000027);
        addID(1000026);
        addID(1000025);
        addID(1000024);
        addID(1000023);
        addID(1000022);
        addID(1000021);
        addID(1000020);
        addID(1000019);
        // 20 - 29
        addID(1000093);
        addID(1000092);
        addID(1000091);
        addID(1000090);
        addID(1000089);
        addID(1000088);
        addID(1000087);
        addID(1000086);
        addID(1000085);
        addID(1000084);
        // 30 - 39
        addID(1000094);
        addID(1000113);
        addID(1000111);
        addID(1000109);
        addID(1000107);
        addID(1000106);
        addID(1000105);
        addID(1000104);
        addID(1000103);
        addID(1000102);
        // 40 - 49
        addID(1000054);
        addID(1000053);
        addID(1000064);
        addID(1000063);
        addID(1000062);
        addID(1000061);
        addID(1000060);
        addID(1000059);
        addID(1000058);
        addID(1000057);
        // 50 - 59
        addID(1000067);
        addID(1000066);
        addID(1000065);
        addID(1000082);
        addID(1000080);
        addID(1000078);
        addID(1000076);
        addID(1000074);
        addID(1000072);
        addID(1000070);
        // 60 - 69
        addID(1000035);
        addID(1000034);
        addID(1000033);
        addID(1000032);
        addID(1000042);
        addID(1000041);
        addID(1000040);
        addID(1000039);
        addID(1000037);
        addID(1000036);
        // 70 - 79
        addID(1000047);
        addID(1000046);
        addID(1000045);
        addID(1000044);
        addID(1000043);
        addID(1000052);
        addID(1000051);
        addID(1000050);
        addID(1000049);
        addID(1000048);
        // 80 - 89
        addID(1000006);
        addID(1000005);
        addID(1000004);
        addID(1000003);
        addID(1000002);
        addID(1000000);
        addID(1000010);
        addID(1000009);
        addID(1000008);
        addID(1000007);
        // 90 - 99
        addID(1000017);
        addID(1000016);
        addID(1000016);
        addID(1000014);
        addID(1000013);
        addID(1000012);
        addID(1000011);
        addID(1000031);
        addID(1000030);
        addID(1000028);
    }
}
