package com.microfocus;

import org.junit.Test;
import java.util.*;


import static junit.framework.Assert.assertEquals;

public class CallHelloIT  {

    @Test
    public void testDoHello()
    {
      assertEquals("Param not equal to 1", System.getProperty("param"), "1");
    }

}
