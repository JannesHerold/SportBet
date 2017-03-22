
public class SportBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[18];

		int x = 1;
		for (int i = 0; i < 6; i++) {

			double zufallsZahl = Math.random() * 18 + 1;
			int zahl = (int) zufallsZahl;
			arr1[x] = zahl;
			x++;

		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				while (arr1[i] == arr1[j]) {
					arr1[i] = (int) (Math.random() * 18 + 1);
				}
			}
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
		return 0;

	}
	static int Spiel4() {
		return 0;

	}
	static int Spiel5() {
		return 0;

	}
	static int Spiel6() {
		return 0;

	}
	static int Spiel7() {
		return 0;

	}
	static int Spiel8() {

		return 0;

	}

}
