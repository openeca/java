package utility.operations;

import org.junit.Assert;
import org.junit.Test;

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

}