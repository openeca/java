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

    /**
     * Given an input array @arr, Transposition selects an item at @item1Index and moves it to item2Index
     * <b>RETURNS COPY</b>
     * @param arr
     * @param item1Index
     * @param item1Index
     * @return
     */
    public static int[] transposition(int[] arr, int item1Index, int item2Index) {
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        tempArr[item1Index] = arr[item2Index];
        tempArr[item2Index] = arr[item1Index];
        return tempArr;
    }

    /**
     * Given an array, it inverts the items between the startIndex and endIndex
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static int[] inversion(int[] arr, int startIndex, int endIndex) {
        int[] temp = new int[arr.length];

        //Swap values to ensure inversion consistency
        if(startIndex > endIndex) {
            int tempStart = startIndex;
            startIndex = endIndex;
            endIndex = tempStart;
        }

        if(startIndex == endIndex || startIndex == endIndex+1) {
            return Arrays.copyOf(arr, arr.length);
        }
        //get range
        int range = (endIndex-startIndex);
        int[] finalArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < range; i++) {
            finalArr[startIndex+i] = arr[(endIndex-1)-i];
        }
        return finalArr;
    }

    /**
     * Given an array @param arr, nPointExchange inverts the items between startIndex and startIndex+nPoint.
     * This includes startIndex but excludes the startIndex+nPoint.
     * <b>RETURNS A COPY</b>
     * @param arr
     * @param startIndex
     * @param nPoint
     * @return
     */
    public static int[] nPointExchange(int[] arr, int startIndex, int nPoint) {
        int[] temp = new int[arr.length];
        int endIndex = startIndex + nPoint;
        if(nPoint == 0 || nPoint == 1) {
            return Arrays.copyOf(arr, arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if(i >= startIndex && i < endIndex) {
                temp[i]=arr[(endIndex-1)-(i-startIndex)];
            }else{
                temp[i] = arr[i];
            }
        }
        return temp;
    }
}
