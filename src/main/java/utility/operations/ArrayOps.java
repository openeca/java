package utility.operations;

import java.util.Arrays;

public class ArrayOps {
    /**
     * Given an int[] arr, <b>translocate</b> selects an item at itemIndex, and places it at newItemIndex shifting the in-between elements
     * up or down depending on selection.
     * <b>RETURNS A COPY</b>
     * @param arr
     * @param itemIndex
     * @param newItemIndex
     * @return
     */
    public static int[] translocate(int[] arr, int itemIndex, int newItemIndex) {
        if(itemIndex == newItemIndex) {
            return Arrays.copyOf(arr,arr.length);
        }
        if(arr.length == 1) {
            return new int[]{arr[0]};
        }

        int[] temp = new int[arr.length];

        if(itemIndex < newItemIndex) {
            for (int i = 0; i < arr.length; i++) {
                if(i == newItemIndex) {
                    temp[i] = arr[itemIndex];
                }
                else if(i >= itemIndex && i < (arr.length-1)){
                    temp[i] = arr[i+1];
                }else{
                    temp[i] = arr[i];
                }
            }
        }else{
            for (int i = arr.length-1; i > -1; i--) {
                if(i == newItemIndex) {
                    temp[i] = arr[itemIndex];
                }else if(i <= itemIndex && i > 1){
                    temp[i] = arr[i-1];
                }else{
                    temp[i] = arr[i];
                }
            }
        }

        return temp;
    }
}
