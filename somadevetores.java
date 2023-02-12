package lacoFor;
import java.util.Scanner;
public class somadevetores {
public static void main(String[] args) {
	int a[],b[],c[],i;
	final int tam = 5;
	a = new int [tam];
	b = new int [tam];
	c = new int [tam];
	Scanner in = new Scanner(System.in);
	for (i=0;i<tam;i++) {
		System.out.println("coloque o "+(i+1)+" numero do primeiro vetor");
		a[i] = in.nextInt();
	}
	for(i=0;i<tam;i++) {
		System.out.println("coloque o "+(i+1)+" numero do segundo vetor ");
		b[i] = in.nextInt();
		c[i]= a[i]+b[i];
	}
	for(i=0;i<tam;i++) {
		System.out.print("soma dos dois vetores "+c[i]);
	}
	
	
}
}
