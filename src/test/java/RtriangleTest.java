import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by liza on 21.06.16.
 */
public class RtriangleTest {

    private Rtriangle tr;

    @Before
    public void init(){
        tr = RtriangleProvider.getRtriangle();
    }

    @Test
    public void test(){

        int lengthA = Math.abs(tr.getApexX1() - tr.getApexX2()) +
                Math.abs(tr.getApexY1() - tr.getApexY2());

        int lengthB = Math.abs(tr.getApexX1() - tr.getApexX3()) +
                Math.abs(tr.getApexY1() - tr.getApexY3());

        int lengthC = Math.abs(tr.getApexX2() - tr.getApexX3()) +
                Math.abs(tr.getApexY2() - tr.getApexY3());

        List<Integer> list = Arrays.asList(lengthA*lengthA, lengthB*lengthB, lengthC*lengthC);
        Collections.sort(list);

        Assert.assertTrue("Проверка по теореме Пифагора не прошла", list.get(0) == list.get(1) + list.get(2));
    }
}
