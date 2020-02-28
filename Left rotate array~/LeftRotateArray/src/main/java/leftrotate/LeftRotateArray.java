package leftrotate;

/**
 *
 * @author Dinesh Nanda
 */

public class LeftRotateArray {

    public static void main(String[] args) {
        
        int arr[] = {7, 9, 1, 4, 6, 10, 3};
        
        int new_arr[];
        
        new_arr = new int[arr.length];
        
        new_arr[arr.length-1] = arr[0];
        
        for(int i = 0; i < arr.length - 1; i++){
            new_arr[i] = arr[i+1];
        }
        System.out.println("Left rotated array is: ");
        for(int i = 0; i < new_arr.length; i++){
            System.out.print(new_arr[i] + " ");
        }
    }
    
}
