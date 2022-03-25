package ss13_Thuat_toan_tim_kiem.ThucHanh;

public class BinarySearch {
    static int[] list={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int  binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
