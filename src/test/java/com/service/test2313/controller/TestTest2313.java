package com.service.test2313.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest2313 {

        Test2313Delegate test2313Delegate = new Test2313Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test2313Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}