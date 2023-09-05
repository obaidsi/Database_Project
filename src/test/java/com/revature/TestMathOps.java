package com.revature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMathOps {
    public static MathOps mathOps;

    @BeforeAll 
    public static void setup(){
        mathOps = new MathOps();
    }
    @Test
    public void testAdd(){
        int result = mathOps.add(5, 6);
        assertEquals(11, result);
    }
}