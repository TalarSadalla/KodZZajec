package sda.pl.kolkoIkrzyzyk;

public class KolkoIKrzyzykUtil {

	public static boolean isDigit(String text) {
		char[] tablica = text.toCharArray();
		if (tablica.length > 1) {
			return false;
		}
		char znak = tablica[0];
		if (znak > 48 && znak < 58) {
			return true;
		}
		return false;
	}

	public static boolean isRowWinning(Plansza plansza) {
		String[] pola = plansza.getPola();
		for (int i = 0; i < 9; i += 3) {
			String wzor = pola[i];
			if (wzor.equals(pola[i + 1]) && wzor.equals(pola[i + 2])) {
				return true;
			}
		}
		return false;
	}

	public static boolean isColumnWinning(Plansza plansza) {
		String[] pola = plansza.getPola();
		for (int i = 0; i < 3; i++) {
			String wzor = pola[i];
			if (wzor.equals(pola[i + 3]) && wzor.equals(pola[i + 6])) {
				return true;
			}
		}
		return false;
	}

	public static boolean isDiagonalWinning(Plansza plansza) {
		String[] pola = plansza.getPola();
		String wzor = pola[4];
		boolean firstDiagonal = (wzor.equals(pola[0]) && wzor.equals(pola[8]));
		boolean secondDiagonal = (wzor.equals(pola[2]) && wzor.equals(pola[6]));
		if (firstDiagonal || secondDiagonal) {
			return true;
		}
		return false;
	}

	public static boolean isWin(Plansza plansza) {
		return isRowWinning(plansza) || isColumnWinning(plansza) || isDiagonalWinning(plansza);
	}

}
