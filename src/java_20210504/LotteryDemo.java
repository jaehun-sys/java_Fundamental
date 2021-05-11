package java_20210504;

public class LotteryDemo {
	public static void main(String[] args) {
		//Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 반환
		
		int[] lotto = new int[15];
		for(int i=0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			lotto[i] = random;
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
					}
				}				
			}
		}
		
		/*정렬(선택)
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto [j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		*/
		quickSort(lotto,0,lotto.length-1);
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");			
		}
	}
	
	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}

}