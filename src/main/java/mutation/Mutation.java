package mutation;


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
}
