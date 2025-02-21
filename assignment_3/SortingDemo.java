package assignment_3;
//3 3ü
//Interface defining a method to sort an array of integers
interface Sortable {
 void arrangeNumbers(int[] numbers);
}

//Class implementing the Bubble Sort algorithm
class BubbleSorter implements Sortable {

 
 public void arrangeNumbers(int[] numbers) {
     int length = numbers.length;
     // Bubble Sort: Loop through the array to sort it in descending order
     for (int i = 0; i < length - 1; i++) {
         for (int j = 0; j < length - i - 1; j++) {
             if (numbers[j] < numbers[j + 1]) { // Compare adjacent elements
                 // Swap the elements if they are not in the correct order
                 int temp = numbers[j];
                 numbers[j] = numbers[j + 1];
                 numbers[j + 1] = temp;
             }
         }
     }
 }
}

//Class implementing the Merge Sort algorithm
class MergeSorter implements Sortable {

 
 public void arrangeNumbers(int[] numbers) {
     // Calling the recursive mergeSort method
     sortInParts(numbers, 0, numbers.length - 1);
 }

 // Recursive method to divide and conquer
 private void sortInParts(int[] numbers, int left, int right) {
     if (left < right) {
         int middle = (left + right) / 2;

         // Recursively sort the left and right halves of the array
         sortInParts(numbers, left, middle);
         sortInParts(numbers, middle + 1, right);

         // Merge the two halves
         mergeArrays(numbers, left, middle, right);
     }
 }

 // Method to merge two sorted halves of the array
 private void mergeArrays(int[] numbers, int left, int middle, int right) {
     // Determine the sizes of the left and right subarrays
     int leftSize = middle - left + 1;
     int rightSize = right - middle;

     // Create temporary arrays to hold the split parts
     int[] leftArray = new int[leftSize];
     int[] rightArray = new int[rightSize];

     // Copy data into temporary arrays
     System.arraycopy(numbers, left, leftArray, 0, leftSize);
     System.arraycopy(numbers, middle + 1, rightArray, 0, rightSize);

     // Merge the two arrays back into the original numbers array in descending order
     int i = 0, j = 0, k = left;
     while (i < leftSize && j < rightSize) {
         if (leftArray[i] >= rightArray[j]) {
             numbers[k] = leftArray[i];
             i++;
         } else {
             numbers[k] = rightArray[j];
             j++;
         }
         k++;
     }

     // Copy remaining elements from leftArray, if any
     while (i < leftSize) {
         numbers[k] = leftArray[i];
         i++;
         k++;
     }

     // Copy remaining elements from rightArray, if any
     while (j < rightSize) {
         numbers[k] = rightArray[j];
         j++;
         k++;
     }
 }
}

//Main class to demonstrate sorting algorithms
public class SortingDemo {
 public static void main(String[] args) {
     int[] numbers = {17, 28, 18, 4, 10, 8, 19, 4};

     // Testing Bubble Sort
     Sortable bubbleSorter = new BubbleSorter();
     bubbleSorter.arrangeNumbers(numbers);
     System.out.print("Bubble Sort result: ");
     printArray(numbers);

     // Resetting the array for Merge Sort
     int[] numbersForMergeSort = {17, 28, 18, 4, 10, 8, 19, 4};
     
     // Testing Merge Sort
     Sortable mergeSorter = new MergeSorter();
     mergeSorter.arrangeNumbers(numbersForMergeSort);
     System.out.print("Merge Sort result: ");
     printArray(numbersForMergeSort);
 }

 // Utility method to print the array
 private static void printArray(int[] array) {
     for (int num : array) {
         System.out.print(num + " ");
     }
     System.out.println();
 }
}
