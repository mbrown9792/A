public class InsertionSort {

	public static <T extends Comparable<T>> T[] sort(T[] array) {

		for(int j = 1; j < array.length; j++) {
			T key = array[j];
			int i = j - 1;

			while (i >= 0 && key.compareTo(array[i]) < 0) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {

		for (T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
public
	 static void main(String[] args) {

		String[] array = {"apple", "adam"};
		String[] sorted = InsertionSort.sort(array);
		InsertionSort.printArray(sorted);
	}
}