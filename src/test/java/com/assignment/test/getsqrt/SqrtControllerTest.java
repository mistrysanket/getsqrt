package com.assignment.test.getsqrt;

import com.assignment.test.getsqrt.controller.SqrtController;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqrtControllerTest {

    @Test
    public void calculateSqrtTest1() {

        SqrtController sc = new SqrtController();

        int[] values1 = {1, 2, 3, 4};

        ArrayList<Integer> test1 = new ArrayList<Integer>();
        for (int id : values1) {
            test1.add(id);
        }
        //The calculated value should match with expected result
        Assert.assertEquals("5.385164807134504", sc.calculateSqrt(test1).getOutput().toString());
    }

    @Test
    public void calculateSqrtTest2() {
        SqrtController sc = new SqrtController();
        int[] values2 = {1, 2, 5, 6};

        ArrayList<Integer> test2 = new ArrayList<Integer>();
        for (int id : values2) {
            test2.add(id);
        }
        //The calculated value should not match with expected result
        Assert.assertNotEquals("5.385164807134504", sc.calculateSqrt(test2).getOutput().toString());
    }

}
