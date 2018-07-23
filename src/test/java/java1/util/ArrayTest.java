package java1.util;


import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zch
 * @date 2018/7/23 14:37
 **/
public class ArrayTest {
    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(new String("a"));
        list.add(new String("b"));
        list.add(1, new String("c"));
        System.out.println("========================================" + list);
    }
}
