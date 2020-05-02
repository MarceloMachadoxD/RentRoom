package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many Rooms will be rent?");

		int r = sc.nextInt();

		Room[] room = new Room[10];

		for (int i = 0; i < r; i++) {
			String n = "0";
			String e = "0";
			int roo = 0;

			System.out.println("Rent #" + (i + 1));
			System.out.println("Digite o nome ");
			sc.nextLine();
			n = sc.nextLine();
			System.out.println("Digite o e-mail");
			e = sc.nextLine();
			System.out.println("Digite o quarto que deseja Alugar: ");
			roo = sc.nextInt();

			room[roo] = new Room(roo, n, e);

		}

		System.out.println("Busy Rooms:");

		for (int i = 0; i < room.length; i++) {

			if (room[i] != null) {

				// System.out.println("Room #" + room[i].getRoom() + ": " + room[i].getName() +
				// ", " + room[i].getEmail() );

				System.out.println(room[i]);

			}

		}

		sc.close();

	}

}
