package sda.pl.kolkoIkrzyzyk;

import java.util.Scanner;

public class KolkoIKrzyzykInterface {
	public Integer menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Start");
		System.out.println("0. Koniec");

		Integer opcja = scanner.nextInt();
		return opcja;

	}

	public String podajImie() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imie gracza: ");
		String imie = scanner.nextLine();
		return imie;
	}

	public int podajPole(String imie) {
		System.out.println("Gracz " + imie + ":");
		System.out.println("Podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;
	}

	public void pokazPlansze(Plansza plansza) {
		System.out.println(plansza.toString());
	}

	public void podanoNiepoprawnePole() {
		System.out.println("Podano niepoprawne pole, spróbuj jeszcze raz.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

}
