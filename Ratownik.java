import java.util.*;

public class Ratownik {
	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner (System.in);
		int N = czytaj.nextInt();
		int K = czytaj.nextInt();
		int X = czytaj.nextInt();
		int Y = czytaj.nextInt();
		
		int [] dzieciX = new int [N];
		int [] dzieciY = new int [N];
		for (int i=0 ; i<N ; i++) {
			dzieciX[i] = czytaj.nextInt();
			dzieciY[i] = czytaj.nextInt();
		}
		czytaj.close();
		
		int count = 0;
		for (int i=0 ; i<N ; i++) {
			int xR = Math.abs(X-dzieciX[i]);
			int yR = Math.abs(Y-dzieciY[i]);
			
			double range = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
			if (range>K) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
