package HW1;

public class HW1 extends ArrayData{
	
	public HW1(int[] A){
		this.A = A;
	}
	
	public static void main(String[] args) {
		
		int[] A = new int[100];
		ArrayData hw1 = new HW1(A);
		
		for(int i = 0; i<100; i++) {
			A[i] = (int)(Math.random()*100);
			
		}
		long time1, time2;
		
		time1 = System.nanoTime();
		hw1.max();
		hw1.dot(A);
		time2 = System.nanoTime();
		System.out.println((time2 - time1));
	}	
	@Override
	public int max() {
		int max = A[0];
		int al = A.length;
		for(int i = 1; i< al; i++) {
			if (A[i] > max) {
				max = A[i];	
			}
		}
		return max;
	}

	@Override
	public int dot(int[] B) {
		int dot = A[0] * B[0];
		int al = A.length;
		for(int i = 1; i<al; i++) {
			dot += A[i] * B[i];
		}	
		return dot;
	}
	
}

