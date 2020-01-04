package com.javagdy3.robot;

public enum RuchRobota {
    KROK_LEWA(10),
    KROK_PRAWA(10),
    RUCH_REKA_LEWA(8),
    RUCH_REKA_PRAWA(8),
    SKOK(16);

    private int wydatekEnergetyczny;

    RuchRobota(int wydatekEnergetyczny) {
        this.wydatekEnergetyczny = wydatekEnergetyczny;
    }

    public int getWydatekEnergetyczny() {
        return wydatekEnergetyczny;
    }
    /**/
}
