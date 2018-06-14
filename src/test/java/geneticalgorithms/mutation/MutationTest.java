package geneticalgorithms.mutation;

import org.junit.Assert;
import org.junit.Test;
import utility.exceptions.InvalidArgumentException;

public class MutationTest {
    @Test(expected = InvalidArgumentException.class)
    public void translocationInvalidTargetIndex() throws Exception {
        Mutation.translocation(new int[]{1,2,3},0,3);
    }

    @Test(expected = InvalidArgumentException.class)
    public void translocationInvalidTargetItem() throws Exception {
        Mutation.translocation(new int[]{1,2,3},3,1);
    }

    @Test
    public void translocation() throws Exception {
        int[] translocation = Mutation.translocation(new int[]{1, 2, 3}, 2, 1);
        Assert.assertArrayEquals(new int[]{1,3,2}, translocation);
    }

    @Test(expected = InvalidArgumentException.class)
    public void transpositionInvalidArg1() throws Exception {
        Mutation.transposition(new int[]{1,2,3},3,1);
    }

    @Test(expected = InvalidArgumentException.class)
    public void transpositionInvalidArg2() throws Exception {
        Mutation.transposition(new int[]{1,2,3},1,3);
    }

    @Test
    public void transposition() throws Exception {
        int[] transposition = Mutation.transposition(new int[]{1, 2, 3, 4}, 3, 1);
        Assert.assertArrayEquals(new int[]{1,4,3,2}, transposition);
    }

    @Test(expected = InvalidArgumentException.class)
    public void inversionInvalidArg2() throws Exception {
        Mutation.inversion(new int[]{1,2,3},1,4);
    }

    @Test(expected = InvalidArgumentException.class)
    public void inversionInvalidArg1() throws Exception {
        Mutation.inversion(new int[]{1,2,3},4,1);
    }

    @Test
    public void inversion() throws Exception {
        int[] inversion = Mutation.inversion(new int[]{1, 2, 3, 4}, 3, 1);
        Assert.assertArrayEquals(new int[]{1,3,2,4}, inversion);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void nPointExchangeInvalidArg2() throws Exception {
        Mutation.nPointExchange(new int[]{1,2,3},1,4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void nPointExchangeInvalidArg1() throws Exception {
        Mutation.nPointExchange(new int[]{1,2,3},4,1);
    }

    @Test
    public void nPointExchange() throws Exception {
        int[] nPointExchange = Mutation.nPointExchange(new int[]{1, 2, 3, 4}, 1, 2);
        Assert.assertArrayEquals(new int[]{1,3,2,4}, nPointExchange);
    }
}
