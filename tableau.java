package projetexos;

import java.util.Scanner;

public class tableau {


	static int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

	public static void check() {
		System.out.println("C'est quoi ton chiffre!");
		Scanner nbrentr = new Scanner(System.in);
		int num1 = nbrentr.nextInt();
		String nonn = "";

		boolean non= false;

		for (int i=0; i <8; i++) {
			if (num1 == tab[i]  ) {
				non= true;
			}
		}
		if (non == true) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}
	}

	public static int check2() {
		System.out.println("C'est quoi ton chiffre pour la deuxème fois!");
		Scanner nbrentr = new Scanner(System.in);
		int num1 = nbrentr.nextInt();
		int nonn =0 ;
		int indice=0;
		boolean non= false;

		for (int i=0; i <8; i++) {
			if (num1 == tab[i]  ) {
				nonn= tab[i];
				non= true;
				indice=i;
			}
		}
		if (non == true) {
			System.out.println("il existe dans l'indice "+ indice);
		} else {
			System.out.println("non");
		}
		return(indice);	
	}

	public static void check3() {
		System.out.println("C'est quoi ton chiffre pour la deuxème fois!");
		Scanner nbrentr = new Scanner(System.in);
		int num1 = nbrentr.nextInt();
		int nonn =0 ;
		int indice=0;
		boolean non= false;
		int i = 0;

		do {
			// statements
			if (num1 == tab[i]  ) {
				nonn= tab[i];
				non= true;
				indice=i;
			}else { 
				i++;
			}
		} while (non == false);





		if (non == true) {
			System.out.println("il existe dans l'indice "+ indice);
		} else {
			System.out.println("non");
		}
	}
	
	public static void check4() {
		
		System.out.print("the content of the table: tab[]= { ");
		for(int i=1; i < tab.length; i++) {
			System. out. print(tab[i]+" ");
		}
		System.out.print("}");
		
		System.out.print("\nthe index of the table:  tab.i = { ");
		for(int i=1; i < tab.length; i++) {
			System. out. print(i +"  ");
		}
		System.out.print("}");
		
		System.out.println( "\nEntre the first index to change:");
		Scanner nbrentr = new Scanner(System.in);
		int nbr0 = nbrentr.nextInt();
		System.out.println("Entre the second index to change:");
		int nbr1 = nbrentr.nextInt();
		int x= tab[nbr1];
		tab[nbr1]= tab[nbr0];
		tab[nbr0]=x;
		
		
		
		System.out.print("the content of the table: tab[]= { ");
		for(int i=1; i < tab.length; i++) {
			System. out. print(tab[i]+" ");
		}
		System.out.print("}");
		
		System.out.print("\nthe index of the table:  tab.i = { ");
		for(int i=1; i < tab.length; i++) {
			System. out. print(i +"  ");
		}
		System.out.print("}");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check();
		//int xx= check2();
		//System.out.println("your indice" + xx);
		//check3();
		//check4();
	}

}
