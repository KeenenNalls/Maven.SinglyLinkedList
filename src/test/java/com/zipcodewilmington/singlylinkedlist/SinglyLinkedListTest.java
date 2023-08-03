package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Test;




/**
 * Created by leon on 1/10/18.
 */

public class SinglyLinkedListTest {
    @Test
    public void copyTest1() {
        SinglyLinkedList<Integer> expected = new SinglyLinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(5);

        SinglyLinkedList<Integer> actual = expected.copy();

        Assert.assertEquals(expected.toString(), actual.toString());
    }
}