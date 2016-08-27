public class BinarySearcher <T extends Comparable<T>> {


    public BinarySearcher(T[] words) {
        a = words;
    }

    public int search(Comparable<T> v) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            } 

            else {
                return mid;
            }
        }

        return -1;
    }
    

    private T[] a;
}