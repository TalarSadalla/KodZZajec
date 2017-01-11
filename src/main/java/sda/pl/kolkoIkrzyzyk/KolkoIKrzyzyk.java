package sda.pl.kolkoIkrzyzyk;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {

		KolkoIKrzyzykInterface kolkoIkrzyzk = new KolkoIKrzyzykInterface();
		Integer WyborTrybu = kolkoIkrzyzk.menu();
		Plansza plansza = new Plansza();
		int ruch = 0;
		String gracz1 = kolkoIkrzyzk.podajImie();
		String gracz2 = kolkoIkrzyzk.podajImie();

		while (ruch < 10) {
			int pozycja = kolkoIkrzyzk.podajPole(gracz1);
			boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
			System.out.println(plansza.toString());
			ruch++;
			pozycja = kolkoIkrzyzk.podajPole(gracz2);
			czyWstawiono = plansza.wstawZnak("O", pozycja);
			System.out.println(plansza.toString());
			ruch++;
			if (ruch == 9) {
				break;
			}
		}
		System.out.println("Koniec gry!");

		switch (WyborTrybu) {
		case 1:
			// kolkoIkrzyzk.RysowaniePlanszy();
			ruch++;
			break;

		case 0:

			break;
		default:
			break;

		}
	}

}
