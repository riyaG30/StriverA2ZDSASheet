package bitinterview;

public class LtoRXor {

	public static void main(String[] args) {
		int l=4,r=8;
		System.out.println(xor(l-1) ^ xor(r));
	}

	private static int xor(int n) {
		if(n%4==0) return n;
		if(n%4==1) return 1;
		if(n%4==2) return n+2;
		return 0;
	}

}
