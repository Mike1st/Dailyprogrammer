import java.util.*;


//This is challenge #377
public class CratePacking {
	
	public static void main(String[] args) {
		System.out.println(fit1(10,10,1,1));
		System.out.println(fit2(25,18,6,5));
		System.out.println(fit3(1234567, 89101112, 13141516, 171819, 202122, 232425));
		System.out.println(25*18/6/5);
	}
	
	public static int fit1(int X, int Y, int x, int y) {
		int xFit = X / x;
		int yFit = Y / y;
		return xFit * yFit;
	}
	
	public static int fit2(int X, int Y, int x, int y) {
		int ori1 = fit1(X,Y,x,y);
		int ori2 = fit1(X,Y,y,x);
		return Math.max(ori1, ori2);
	}
	
	public static int fit3(int X, int Y, int Z, int x, int y, int z) {
		int ori1 = calc(X,Y,Z,x,y,z);
		int ori2 = calc(X,Y,Z,x,z,y);
		int ori3 = calc(X,Y,Z,y,x,z);
		int ori4 = calc(X,Y,Z,y,z,x);
		int ori5 = calc(X,Y,Z,z,x,y);
		int ori6 = calc(X,Y,Z,z,y,x);
		ArrayList<Integer> fits = new ArrayList<Integer>();
		fits.add(ori1);
		fits.add(ori2);
		fits.add(ori3);
		fits.add(ori4);
		fits.add(ori5);
		fits.add(ori6);
		int max = Collections.max(fits);
		return max;
	}
	
	
	public static int calc (int X, int Y, int Z, int x, int y, int z) {
		int xFit = X / x;
		int yFit = Y / y;
		int zFit = Z / z;
		return xFit * yFit * zFit;
	}
}
