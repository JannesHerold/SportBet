import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SportBet {
	public static boolean spielErgebniss1;
	public static boolean spielErgebniss2;
	public static boolean spielErgebniss3;
	public static boolean spielErgebniss4;
	public static boolean spielErgebniss5;
	public static boolean spielErgebniss6;
	public static boolean spielErgebniss7;
	public static boolean spielErgebniss8;
	public static boolean spielErgebniss9;
	public static int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		shuffleArray(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		spielErgebniss1 = Spiel1(arr1);
		spielErgebniss2 = Spiel2(arr1);
		spielErgebniss3 = Spiel3(arr1);
		spielErgebniss4 = Spiel4(arr1);
		spielErgebniss5 = Spiel5(arr1);
		spielErgebniss6 = Spiel6(arr1);
		spielErgebniss7 = Spiel7(arr1);
		spielErgebniss8 = Spiel8(arr1);
		spielErgebniss9 = Spiel9(arr1);


	}

	static boolean Spiel1(int arr1[]) {
		int team1 = arr1[0];
		int team2 = arr1[1];
		boolean ergebniss;

		switch (team1) {

		case 1:
			team1 = 1800;

		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel2(int arr1[]) {
		int team1 = arr1[2];
		int team2 = arr1[3];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel3(int arr1[]) {
		int team1 = arr1[4];
		int team2 = arr1[5];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel4(int arr1[]) {
		int team1 = arr1[6];
		int team2 = arr1[7];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel5(int arr1[]) {
		int team1 = arr1[8];
		int team2 = arr1[9];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel6(int arr1[]) {
		int team1 = arr1[10];
		int team2 = arr1[11];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel7(int arr1[]) {
		int team1 = arr1[12];
		int team2 = arr1[13];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel8(int arr1[]) {
		int team1 = arr1[14];
		int team2 = arr1[15];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}

		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static boolean Spiel9(int arr1[]) {
		int team1 = arr1[16];
		int team2 = arr1[17];
		boolean ergebniss;
		switch (team1) {

		case 1:
			team1 = 1800;
		case 2:
			team1 = 1700;
		case 3:
			team1 = 1600;
		case 4:
			team1 = 1500;
		case 5:
			team1 = 1400;
		case 6:
			team1 = 1300;
		case 7:
			team1 = 1200;
		case 8:
			team1 = 1100;
		case 9:
			team1 = 1000;
		case 10:
			team1 = 900;
		case 11:
			team1 = 800;
		case 12:
			team1 = 700;
		case 13:
			team1 = 600;
		case 14:
			team1 = 500;
		case 15:
			team1 = 400;
		case 16:
			team1 = 300;
		case 17:
			team1 = 200;
		case 18:
			team1 = 100;

		}
		switch (team2) {
		case 1:
			team2 = 1800;
		case 2:
			team2 = 1700;
		case 3:
			team2 = 1600;
		case 4:
			team2 = 1500;
		case 5:
			team2 = 1400;
		case 6:
			team2 = 1300;
		case 7:
			team2 = 1200;
		case 8:
			team2 = 1100;
		case 9:
			team2 = 1000;
		case 10:
			team2 = 900;
		case 11:
			team2 = 800;
		case 12:
			team2 = 700;
		case 13:
			team2 = 600;
		case 14:
			team2 = 500;
		case 15:
			team2 = 400;
		case 16:
			team2 = 300;
		case 17:
			team2 = 200;
		case 18:
			team2 = 100;

		}
		int rechner = team1 + team2;
		double zufallsZahl = Math.random() * rechner;
		int zahl = (int) zufallsZahl;
		if (zahl <= team1) {
			System.out.println("Team1 Gewinnt");
			ergebniss = true;
		} else {
			System.out.println("Team2 Gewinnt");
			ergebniss = false;
		}
		return ergebniss;

	}

	static void shuffleArray(int[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
