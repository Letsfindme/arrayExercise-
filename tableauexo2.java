package projetexos;
import java.util.Arrays;
import java.util.Scanner;

public class tableauexo2 {


	public static void check1() {
		Scanner sc = new Scanner(System.in);
		int [] newtab = new int[7];
		
		for (int i = 0; i< 7; i++) {
			System.out.println("inter the nomber you want to stock in the index: "+ i);
			int tabnbr = sc.nextInt();
			newtab[i]= tabnbr;
		}
		System.out.print("\n Your table is: ");
		
		for (int ii = 0; ii<7; ii++ ) {
			System.out.print(newtab[ii]+ " ");
		}
		
		int bigif = 0 ;
		if(newtab[0]> newtab[1]) {
			bigif = newtab[0];
		}else {
			bigif = newtab[1];
		}
		if(bigif < newtab[2]) {
			bigif = newtab[2];
		}
		if(bigif < newtab[3]) {
			bigif = newtab[3];
		}
		if(bigif < newtab[4]) {
			bigif = newtab[4];
		}
		if(bigif < newtab[5]) {
			bigif = newtab[5];
		}
		if(bigif < newtab[6]) {
			bigif = newtab[6];
		}
		System.out.println("\n bigif is : "+bigif);
		
		
		Arrays.sort(newtab);
		int bignbr= newtab[newtab.length -1];
		System.out.println("\n the bigest nomber is "+bignbr);
		
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check1();
	}

}
