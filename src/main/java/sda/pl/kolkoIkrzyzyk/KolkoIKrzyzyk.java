package sda.pl.kolkoIkrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {

		KolkoIKrzyzykInterface kolkoIkrzyzk = new KolkoIKrzyzykInterface();
		Integer WyborTrybu = kolkoIkrzyzk.menu();
		Plansza plansza = new Plansza();
		int ruch = 0;
		String gracz1 = kolkoIkrzyzk.podajImie();
		String gracz2 = kolkoIkrzyzk.podajImie();
		Map<String, String> mapaGraczy = new HashMap<>();
		mapaGraczy.put(gracz1, "X");
		mapaGraczy.put(gracz2, "O");

		boolean czyWstawiono;

		for (int i = 0; i < 9; i++) {
			kolkoIkrzyzk.pokazPlansze(plansza);
			String aktualnyGracz = null;
			String wstawianyZnak = null;
			if (i % 2 == 0) {
				aktualnyGracz = gracz1;
			} else {
				aktualnyGracz = gracz2;
			}
			wstawianyZnak = mapaGraczy.get(aktualnyGracz);

			do {

				int pozycja = kolkoIkrzyzk.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawianyZnak, pozycja);
				if (!czyWstawiono) {
					kolkoIkrzyzk.podanoNiepoprawnePole();

				}
			} while (!czyWstawiono);

			kolkoIkrzyzk.pokazPlansze(plansza);

		}
		System.out.println("Koniec gry!");

		switch (WyborTrybu) {
		case 1:
			// kolkoIkrzyzk.RysowaniePlanszy();

			break;

		case 0:

			break;
		default:
			break;

		}
	}

}
