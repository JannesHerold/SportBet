import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class SportBet {
	public static int doppelteZahlNr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[18];

		int x = 0;
		for (int i = 0; i < 18; i++) {

			double zufallsZahl = Math.random() * 18 + 1;
			int zahl = (int) zufallsZahl;
			arr1[x] = zahl;
			x++;
		}
		while (aufDoppeltePruefen(arr1) == true) {
			doppelteZahlErsetzen(arr1);
		}

		

		for (int t : arr1) {
			System.out.print(t + " ");
		}

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

	public static boolean aufDoppeltePruefen(int[] arr1) {

		boolean doppelteVorhanden = false;

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] == arr1[i - 1]) {
				doppelteVorhanden = true;
				doppelteZahlNr = i;
				//Arrays.sort(arr1);
			}
		}
		return doppelteVorhanden;
	}

	public static void doppelteZahlErsetzen(int[] array) {
		Random zufallszahl = new Random();
		array[doppelteZahlNr] = zufallszahl.nextInt(18) + 1;
	}

}
