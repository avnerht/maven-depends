package com.microfocus;

import org.junit.Test;
import java.util.*;


import static junit.framework.Assert.assertEquals;

public class CallHelloTest  {

    @Test
    public void testDoHello()
    {
      assertEquals("Input not equal to 1", System.getProperty("input"), "1");
    }

}
