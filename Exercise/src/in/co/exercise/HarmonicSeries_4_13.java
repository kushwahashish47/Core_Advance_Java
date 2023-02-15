package in.co.exercise;

public class HarmonicSeries_4_13 {
public static void main(String[] args) {
	int n= 5;
	double t= 0.0;
	for(int i = 1; i<=n;i++) {
		System.out.print("1/" + i + " +");
		t =t+(double)1/i;	
	}
	System.out.println("\nsum of harmonic series is =  " +t);
}
}
