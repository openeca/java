package utility.operations;

import org.junit.Assert;
import org.junit.Test;
import utility.exceptions.InvalidArgumentException;

public class ArrayOpsTest {
    @Test
    public void translocateNormal() throws Exception {
        int[] a = new int[]{1,2,3,4,5};

        //Test with normal array
        int[] translocate = ArrayOps.translocate(a, 2, 4);
        Assert.assertArrayEquals(new int[]{1,2,4,5,3}, translocate);
    }

    @Test
    public void translocateWithLength2Arr() throws Exception {
        int[] b = new int[]{1,2};

        //Test with length 2 array
        int[] translocate2 = ArrayOps.translocate(b, 0, 1);
        Assert.assertArrayEquals(new int[]{2,1}, translocate2);
    }

    @Test
    public void translocateWithLength2ArrSameIndex() throws Exception {
        int[] b = new int[]{1,2};

        //Test with length 2 array no change
        int[] translocate2a = ArrayOps.translocate(b, 0, 0);
        Assert.assertArrayEquals(new int[]{1,2}, translocate2a);
    }

    @Test
    public void translocateWithLength1Arr() throws Exception {
        int[] c = new int[]{1};

        //Test with length 1 array
        int[] translocate3 = ArrayOps.translocate(c, 0, 0);
        Assert.assertArrayEquals(new int[]{1}, translocate3);
    }

    @Test
    public void translocateReverse() throws Exception {
        int[] a = new int[]{1,2,3,4,5};

        //Test with normal array
        int[] translocate = ArrayOps.translocate(a, 4, 2);
        Assert.assertArrayEquals(new int[]{1,2,5,3,4}, translocate);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void transpositionError() {
        int[] a = new int[]{1,2,3,4,5};
        int[] transpose = ArrayOps.transposition(a, 5, 4);
        Assert.assertArrayEquals(new int[]{1,2,5,4,3}, transpose);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void transpositionError2() {
        int[] a = new int[]{1,2,3,4,5};
        int[] transpose = ArrayOps.transposition(a, 2, 5);
        Assert.assertArrayEquals(new int[]{1,2,5,4,3}, transpose);
    }

    @Test
    public void transpositionNormal() {
        int[] a = new int[]{1,2,3,4,5};
        int[] transpose = ArrayOps.transposition(a, 4, 2);
        Assert.assertArrayEquals(new int[]{1,2,5,4,3}, transpose);
    }

    @Test
    public void inversionNormal() {
        int[] a = new int[]{1,2,3,4,5};
        int[] inversion = ArrayOps.inversion(a, 2, 4);
        Assert.assertArrayEquals(new int[]{1,2,4,3,5}, inversion);
    }

    @Test
    public void inversionOneArgs() {
        int[] a = new int[]{1};
        int[] inversion = ArrayOps.inversion(a, 0,0);
        Assert.assertArrayEquals(new int[]{1}, inversion);
    }

    @Test
    public void inversionTwoArgs() {
        int[] a = new int[]{1,2};
        int[] inversion = ArrayOps.inversion(a, 0,1);
        Assert.assertArrayEquals(new int[]{1,2}, inversion);
    }

    @Test
    public void inversionNormalLarge() {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] inversion = ArrayOps.inversion(a, 0, a.length);
        Assert.assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, inversion);
    }

    @Test
    public void inversionNormalLargeSwappedArgs() {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] inversion = ArrayOps.inversion(a,  a.length,0);
        Assert.assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, inversion);
    }

    @Test
    public void nPointExchangeNormal() {
        int[] a = new int[]{1,2,3,4,5};
        int[] nPointExchange = ArrayOps.nPointExchange(a, 2, 2);
        Assert.assertArrayEquals(new int[]{1,2,4,3,5}, nPointExchange);
    }

    @Test
    public void nPointExchangeLarge() {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] nPointExchange = ArrayOps.nPointExchange(a, 2, 5);
        Assert.assertArrayEquals(new int[]{1,2,7,6,5,4,3,8,9,10}, nPointExchange);
    }

    @Test
    public void nPointExchangeSmall() {
        int[] a = new int[]{1,2,3};
        int[] nPointExchange = ArrayOps.nPointExchange(a, 0, 2);
        Assert.assertArrayEquals(new int[]{2,1,3}, nPointExchange);
    }

    @Test
    public void nPointExchangeVSmall() {
        int[] a = new int[]{1,2};
        int[] nPointExchange = ArrayOps.nPointExchange(a, 0, 1);
        Assert.assertArrayEquals(new int[]{1,2}, nPointExchange);
    }

    @Test
    public void nPointExchange1Small() {
        int[] a = new int[]{1};
        int[] nPointExchange = ArrayOps.nPointExchange(a, 0, 0);
        Assert.assertArrayEquals(new int[]{1}, nPointExchange);
    }

}