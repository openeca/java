package mutation;

import org.junit.Test;
import utility.exceptions.InvalidArgumentException;

import static org.junit.Assert.*;

public class MutationTest {
    @Test(expected = InvalidArgumentException.class)
    public void translocationInvalidTargetIndex() throws Exception {
        Mutation.translocation(new int[]{1,2,3},0,3);
    }

    @Test(expected = InvalidArgumentException.class)
    public void translocationInvalidTargetItem() throws Exception {
        Mutation.translocation(new int[]{1,2,3},3,1);
    }

    @Test(expected = InvalidArgumentException.class)
    public void translocation() throws Exception {
        Mutation.translocation(new int[]{1,2,3},3,1);
    }
}
