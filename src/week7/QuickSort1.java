public class QuickSort1 {


    public static void Sort(int[] array) {
        Sort(array, 0, array.length - 1);
    }

    public static void Sort(int[] array, int left, int right) {
        if (right <= left)
            return;

        // random pivot
        //int pivotIndex = left + random.nextInt(right - left + 1);

        // middle pivot
        int pivotIndex = (left + right) / 2;
        int pivot = array[pivotIndex];
        Swap(array, pivotIndex, right);
        int swapIndex = left;
        for (int i = left; i < right; ++i) {
            if (array[i] <= pivot) {
                Swap(array, i, swapIndex);
                ++swapIndex;
            }
        }
        Swap(array, swapIndex, right);

        Sort(array, left, swapIndex - 1);
        Sort(array, swapIndex + 1, right);
        printSort(array);
    }

    private static void Swap(int[] array, int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    private static void printSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {30, 13, 22, 90};
        Sort(arr);
    }
}