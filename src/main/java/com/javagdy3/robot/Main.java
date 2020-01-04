package com.javagdy3.robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Marian");
        Scanner scanner = new Scanner(System.in);

        boolean working = true;
        while (working) {
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                working = false;
            } else if (command.startsWith("ruch")) {
                String[] words = command.split(" ");

                String type = words[1];
                RuchRobota ruch = RuchRobota.valueOf(type.toUpperCase()); // RUCH_LEWA

                robot.poruszRobotem(ruch);
            } else if (command.equalsIgnoreCase("włącz")) {
                robot.włączRobota();
            } else if (command.equalsIgnoreCase("wyłącz")) {
                robot.wyłączRobota();
            } else if (command.equalsIgnoreCase("naladuj")) {
                robot.naładujRobota();
            }
        }
    }
}
