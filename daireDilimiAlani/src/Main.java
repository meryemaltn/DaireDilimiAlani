import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int r;
		double pi=3.14, a;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter radius: ");
		r=inp.nextInt();
		System.out.println("Daire diliminin derece cinsinden açý ölçüsü: ");
		a=inp.nextDouble();
		double daireDilimAlani= (pi*(r*r)*a)/360;
		System.out.println("Daire Diliminin Alaný: "+daireDilimAlani);
	}
}
