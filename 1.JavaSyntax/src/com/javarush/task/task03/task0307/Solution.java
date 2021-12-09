package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "vitya1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "vitya2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "vitya3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "vitya4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "vitya5";
        Protoss protoss = new Protoss();
        protoss.name = "protoss";
        Protoss protoss1 = new Protoss();
        protoss1.name = "protoss1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "protoss2";
        Terran terran = new Terran();
        terran.name = "terran";
        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
