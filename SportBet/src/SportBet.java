import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SportBet {
	public static int doppelteZahlNr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		shuffleArray(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	static int Spiel1(int arr1[]) {
		int team1 = arr1[0];
		int team2 = arr1[1];

		return 0;

	}

	static int Spiel2(int arr1[]) {
		int team1 = arr1[2];
		int team2 = arr1[3];
		return 0;

	}

	static int Spiel3(int arr1[]) {
		int team1 = arr1[4];
		int team2 = arr1[5];
		return 0;

	}

	static int Spiel4(int arr1[]) {
		int team1 = arr1[6];
		int team2 = arr1[7];
		return 0;

	}

	static int Spiel5(int arr1[]) {
		int team1 = arr1[8];
		int team2 = arr1[9];
		return 0;

	}

	static int Spiel6(int arr1[]) {
		int team1 = arr1[10];
		int team2 = arr1[11];
		return 0;

	}

	static int Spiel7(int arr1[]) {
		int team1 = arr1[12];
		int team2 = arr1[13];
		return 0;

	}

	static int Spiel8(int arr1[]) {
		int team1 = arr1[14];
		int team2 = arr1[15];
		return 0;

	}

	static int Spiel9(int arr1[]) {
		int team1 = arr1[16];
		int team2 = arr1[17];
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
