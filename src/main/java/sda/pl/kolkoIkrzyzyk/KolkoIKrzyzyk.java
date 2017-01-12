package sda.pl.kolkoIkrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {

		KolkoIKrzyzykInterface kolkoIkrzyzkInterfejs = new KolkoIKrzyzykInterface();
		Integer WyborTrybu = kolkoIkrzyzkInterfejs.menu();
		Plansza plansza = new Plansza();
		int ruch = 0;
		String gracz1 = kolkoIkrzyzkInterfejs.podajImie();
		String gracz2 = kolkoIkrzyzkInterfejs.podajImie();
		Map<String, String> mapaGraczy = new HashMap<>();
		mapaGraczy.put(gracz1, "X");
		mapaGraczy.put(gracz2, "O");

		boolean czyWstawiono;

		switch (WyborTrybu) {
		case 1:
			for (int i = 0; i < 9; i++) {
				kolkoIkrzyzkInterfejs.pokazPlansze(plansza);
				String aktualnyGracz = null;
				String wstawianyZnak = null;
				if (i % 2 == 0) {
					aktualnyGracz = gracz1;
				} else {
					aktualnyGracz = gracz2;
				}
				wstawianyZnak = mapaGraczy.get(aktualnyGracz);

				do {

					int pozycja = kolkoIkrzyzkInterfejs.podajPole(aktualnyGracz);
					czyWstawiono = plansza.wstawZnak(wstawianyZnak, pozycja);
					if (!czyWstawiono) {
						kolkoIkrzyzkInterfejs.podanoNiepoprawnePole();

					}
				} while (!czyWstawiono);

				if (KolkoIKrzyzykUtil.isWin(plansza)) {
					kolkoIkrzyzkInterfejs.Winner(aktualnyGracz);
					kolkoIkrzyzkInterfejs.pokazPlansze(plansza);
					break;
				}

			}
			System.out.println("Koniec gry!");
			break;

		case 2:

			break;
		default:
			break;

		}
	}

}
