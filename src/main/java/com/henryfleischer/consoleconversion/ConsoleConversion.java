/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.henryfleischer.consoleconversion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Not New Anymore
 */
public class ConsoleConversion {

    public static void main(String[] args) {
	ArrayList<Player> players = new ArrayList<Player>();
	players.add(new Player("Chester Q. Fordyce", 0));
	players.add(new Player("Terry A. Trilobyte", 1337));
	players.add(new Player("James ''Jim'' T. Kirk", 1701));
	players.add(new Player("Frank H. Furness", 1912));
	players.add(new Player("Susanowo N. K.", 16));
	Scanner uInput = new Scanner(System.in);
	while (true){
	    	System.out.println("Choose an option:\n1. Display all players\n2. Display players with odd numbers\n3. Display players that start wtih\n4. Add player");
	int input = uInput.nextInt();
	System.out.println(input);
	switch (input){
	    case 1:
		for (int i = 0; i < players.size(); i++){
		    System.out.println("Name:" + players.get(i).name + ", ID:" + players.get(i).number);
		}
		break;
	    case 2:
		for (int i = 0; i < players.size(); i++){
		    if (i % 2 == 1){
			System.out.println("Name:" + players.get(i).name + ", ID:" + players.get(i).number);	
		    }

		}
		break;
	    case 3:
		uInput.nextLine();
		System.out.println("Display all that start with:");
		char inputCh = uInput.next().charAt(0);
		for (int i = 0; i < players.size(); i++){
		    if (players.get(i).name.charAt(0) == inputCh)
		    System.out.println("Name:" + players.get(i).name + ", ID:" + players.get(i).number);
		}
		break;
	    case 4:
		uInput.nextLine();
		System.out.println("Player name:");
		String playerName = uInput.nextLine();
		System.out.println("Player ID");
		int pId = uInput.nextInt();
		players.add(new Player(playerName, pId));
		break;
	    default:
		break;
	}
	}

	
    }
}
