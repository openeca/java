package geneticalgorithms.mutation;


import utility.exceptions.InvalidArgumentException;
import utility.operations.ArrayOps;

public class Mutation {
    /**
     * Given an input array @arr, Translocation selects an item at @itemIndex and moves it to a new index i.e @newItemIndex
     * It shifts everything between down or up depending on the selection order.
     * <b>RETURNS COPY</b>
     * @param arr
     * @param itemIndex
     * @param newItemIndex
     * @return int[]
     * @throws InvalidArgumentException if itemIndex or newItemIndex are >= arr.length
     */
    public static int[] translocation(int[] arr, int itemIndex, int newItemIndex) throws InvalidArgumentException {
        if(newItemIndex >= arr.length) {
            throw new InvalidArgumentException("arg2: newItemIndex cannot be greater than or equal to arg0: arr length");
        }
        if(itemIndex >= arr.length) {
            throw new InvalidArgumentException("arg1: itemIndex cannot be greater than or equal to arg0: arr length");
        }
        return ArrayOps.translocate(arr,itemIndex,newItemIndex);
    }

    /**
     * Given an input array @arr, Transposition selects an item at @item1Index and swaps it with the item in item2Index
     * <b>RETURNS COPY</b>
     * @param arr
     * @param item1Index
     * @param item1Index
     * @return
     */
    public static int[] transposition(int[] arr, int item1Index, int item2Index) throws InvalidArgumentException {
        if(item2Index >= arr.length) {
            throw new InvalidArgumentException("arg2: item2Index cannot be greater than or equal to arg0: arr length");
        }
        if(item1Index >= arr.length) {
            throw new InvalidArgumentException("arg1: item1Index cannot be greater than or equal to arg0: arr length");
        }
        return ArrayOps.transposition(arr, item1Index, item2Index);
    }

    /**
     * Given an input array @arr, an inversion selects to segments of the array, and inverts them i.e reverses them
     * E.g. arr = [1,2,3,4,5,6] and @param startIndex = 2 and @param endIndex=4
     * The resulting new arr = [1,2,4,3,5,6]. Note how it is <strong>NOT</strong> inclusive of the endIndex.
     *
     * If the @param endIndex < @param startIndex, the values will be swapped automatically within the function.
     * <b>RETURNS A COPY</b>
     * @param arr
     * @param startIndex the start index to select
     * @param endIndex the end index (NOT INCLUDED)
     * @return int[]
     */
    public static int[] inversion(int [] arr, int startIndex, int endIndex) throws InvalidArgumentException {
        if(startIndex > arr.length) {
            throw new InvalidArgumentException("arg2: startIndex cannot be greater to arg0: arr length");
        }
        if(endIndex > arr.length) {
            throw new InvalidArgumentException("arg1: endIndex cannot be greater to arg0: arr length");
        }
        return ArrayOps.inversion(arr, startIndex,endIndex);
    }

    /**
     * Given an input array @param arr,nPointExchange performs a swap from the items
     * in @param startIndex to items in @param (startIndex+nPoint);
     * For example arr = [1,2,3,4,5,6] @param startIndex = 2, @param nPoint = 3
     * result = [1,2,5,4,3,6]. It is a slightly modified inversion operator. The @nPoint parameter
     * is the number of items to invert including the item at @param startIndex.
     * <b>RETURNS A COPY</b>
     * @param arr
     * @param startIndex
     * @param nPoint
     * @return
     */
    public static int[] nPointExchange(int [] arr, int startIndex, int nPoint) {
        if((startIndex + nPoint) >= arr.length) {
            throw new IndexOutOfBoundsException("The addition of arg1 (startIndex) and arg2 (nPoint) cannot equal or exceed the size of arg0 (arr)");
        }
        if(startIndex >= arr.length) {
            throw new IndexOutOfBoundsException("Arg1 (startIndex) cannot equal or exceed the size of arg0 (arr)");
        }
        return ArrayOps.nPointExchange(arr, startIndex, nPoint);
    }
}
