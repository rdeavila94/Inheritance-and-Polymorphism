
public class InsertionSort <T> {

	
	
	static void insertionSort (int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int j, temp = a[i];
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > temp)
					a[j + 1] = a[j];
				else
					break;
			}
			a[j + 1] = temp;
		}
	}
	
	static void insertionSort (Faculty a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			Faculty temp = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (a[j].compareTo(temp) == 1)
					a[j + 1] = a[j];
				else
					break;
			}
			a[j + 1] = temp;
		}
	}
}