package com.company;


public class ClientData {
    public String nsname;
    public int nspoint;
    public int nsknights_played;
    public int nslength_of_road;
    public int nsresources_on_hand;
    public boolean nslobbyReady;
    public String[] nstextPackage = new String[]{"", "", ""};
    public boolean nsTextSent;
    public int[] serializedHouse = new int[]{0,0};
    public int[] serializedRoad = new int[] {0,0};
    public int serializedCity = 0;
    public boolean endTurn = false, diceRoll, diceUsed;
    public boolean gameEnded = false;

    public ClientData() {
    }
}
