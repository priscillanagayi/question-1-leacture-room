/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lectureroomcontrol;


/**
 *
 * @author HP
 */
import java.util.Scanner;

public class LectureRoomControl {
    
    int numberOfStudents = 0;
    boolean[] lights = new boolean[3]; 

    public void addStudents(int count) {
        numberOfStudents += count;
        System.out.println(count + " students added. Total students: " + numberOfStudents);
    }
    public void removeStudents(int count) {
        if (count > numberOfStudents) {
            System.out.println("Cannot remove more students than present.");
        } else {
            numberOfStudents -= count;
            System.out.println(count + " students removed. Total students: " + numberOfStudents);
        }
    }
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " is turned ON.");
        } else {
            System.out.println("Invalid light number.");
        }
    }
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " is turned OFF.");
        } else {
            System.out.println("Invalid light number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectureRoomControl room = new LectureRoomControl();
        char choice;

        do {
            System.out.println("Lecture Room Control Menu:");
            System.out.println("W - Add Students");
            System.out.println("X - Remove Students");
            System.out.println("Y - Turn ON Light");
            System.out.println("Z - Turn OFF Light");
            System.out.println("Q - Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'W' -> {
                    System.out.print("Enter number of students to add: ");
                    int addCount = scanner.nextInt();
                    room.addStudents(addCount);
                }
                case 'X' -> {
                    System.out.print("Enter number of students to remove: ");
                    int removeCount = scanner.nextInt();
                    room.removeStudents(removeCount);
                }
                case 'Y' -> {
                    System.out.print("Enter light number to turn ON (1-3): ");
                    int onLightNumber = scanner.nextInt();
                    room.turnOnLight(onLightNumber);
                }
                case 'Z' -> {
                    System.out.print("Enter light number to turn OFF (1-3): ");
                    int offLightNumber = scanner.nextInt();
                    room.turnOffLight(offLightNumber);
                }
                case 'Q' -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 'Q');

        scanner.close();
    }
}
