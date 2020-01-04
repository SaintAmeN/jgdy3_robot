package com.javagdy3.robot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Robot {
    private int poziomBaterii;
    private String nazwa;
    private boolean włączony;

    public Robot(String nazwa) {
        this.poziomBaterii = 100;
        this.włączony = false;
        this.nazwa = nazwa;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (!włączony) {
            System.err.println("Robot musi być włączony");
            return;
        }

        if(poziomBaterii < ruch.getWydatekEnergetyczny()){
            System.err.println("Niedostateczna ilość energii");
            return;
        }

        poziomBaterii -= ruch.getWydatekEnergetyczny();
        System.out.println("Poruszyłem robotem: " + ruch);
    }

    public void naładujRobota(){
        if(!włączony){
            System.out.println("...Naładowany...");
            poziomBaterii = 100;
        }else{
            System.err.println("Robot musi być wyłączony do ładowania.");
        }
    }

    public void włączRobota(){
        włączony = true;
    }

    public void wyłączRobota(){
        włączony = false;
    }


}
