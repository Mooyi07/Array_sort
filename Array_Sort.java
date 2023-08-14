import java.util.Scanner; 
public class Array_Sort {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in); // Declares the name of the scanner
        
        System.out.print("Enter number of arrays: "); // inputs the maximum number of arrays
        int input = s1.nextInt();
        
        System.out.println("Input " + input + " number/s:"); // inputs the array with certain values
        int[] arr = new int[input];
        for (int i = 0; i < input; i++){
            arr[i] = s1.nextInt();
        }
        
        System.out.print("Original Array: "); // prints out the original values of the array
        for (int i = 0; i < input; i++){
            System.out.print(arr[i]);
            if (i < input-1){
                System.out.print(", ");
            }
        }

        System.out.println(); // new line
        
        for (int i = 0; i < input; i++){
            for (int j = i + 1; j < input; j++){
                if(arr[i] > arr[j]){ // The algorithm of ascending sort. If you want descending change ">" to "<"
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: "); // prints out the sorted array
        for (int i = 0; i < input; i++){
            System.out.print(arr[i]);
             if (i < input-1){
                System.out.print(", ");
            }
        }
        s1.close(); // closes the scanner
    }
}