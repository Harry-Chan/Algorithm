public class ThreeSum7106056008 extends ThreeSum{

	@Override
	public int T_sum(int[] A) {
		int count = 0 , start, end, three_sum;
		int al = A.length;
		ShellSort(A,al);	
		for(int i = 0; i < al-2; i++) {
			start = i + 1;
			end = al - 1;
			while(start < end) {
				three_sum = A[i] + A[start] + A[end];
				if (three_sum == 0) {
					count ++;
					end --;
					start ++;					//因為array沒有重複的數字，所以可以前後都移動
				}
				else if(three_sum > 0)
					end --;
				else
					start ++;
			}
		}
		return count;
	}
	
	public static void ShellSort(int[] A, int al) {
		int tmp, i, j;
		int gap = al/2;
		for( ; gap > 0; gap = gap/2){                             
	        for(i = gap; i < al; i++){    //插入排序法 
	            tmp = A[i];
	            for(j = i; j >= gap && tmp < A[j-gap]; j-=gap){
	                A[j] = A[j-gap];
	            }
	            A[j] = tmp;
	        }   
	    }
	}
}
