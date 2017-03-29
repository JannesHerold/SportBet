import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SportBet {
	
	public static int doppelteZahlNr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		String Manschaft1;
		shuffleArray(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
	}

	static int Spiel1(int arr1[]) {
		int team1 = arr1[0];
		int team2 = arr1[1];
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
		return 0;

	}

	static int Spiel2(int arr1[]) {
		int team1 = arr1[2];
		int team2 = arr1[3];
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
		return 0;

	}

	static int Spiel3(int arr1[]) {
		int team1 = arr1[4];
		int team2 = arr1[5];
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
		return 0;

	}

	static int Spiel4(int arr1[]) {
		int team1 = arr1[6];
		int team2 = arr1[7];
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
		return 0;

	}

	static int Spiel5(int arr1[]) {
		int team1 = arr1[8];
		int team2 = arr1[9];
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
		return 0;

	}

	static int Spiel6(int arr1[]) {
		int team1 = arr1[10];
		int team2 = arr1[11];
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
		return 0;

	}

	static int Spiel7(int arr1[]) {
		int team1 = arr1[12];
		int team2 = arr1[13];
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
		return 0;

	}

	static int Spiel8(int arr1[]) {
		int team1 = arr1[14];
		int team2 = arr1[15];
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
		return 0;

	}

	static int Spiel9(int arr1[]) {
		int team1 = arr1[16];
		int team2 = arr1[17];
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
		return 0;
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
