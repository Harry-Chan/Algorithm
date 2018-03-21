public class ArrayData7106056008 extends ArrayData{
	
	public ArrayData7106056008(int A[]){
		this.A = A;	
		
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
