package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
public class AssertTrueTest {
 
    AssertTrueTest att;
    
    public boolean isPrime(int number)
    {
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }
    
    @BeforeEach
    public void beforeEachTest()
    {
        att = new AssertTrueTest();
    }
    
    //assertTrue(boolean condition)
    @Test
    public void primeNumberTestwithCondition(){
        Assertions.assertTrue(att.isPrime(5));
    }
    
    // assertTrue(boolean condition, String message)
    @Test
    public void primeNumberTestwithConditionAndMessage(){
        Assertions.assertTrue(att.isPrime(91),"Number is not prime");
    }
    
    // assertTrue(BooleanSupplier booleanSupplier)
    @Test
    public void primeNumberTestWithBooleanSupplier(){
        Assertions.assertTrue(() -> att.isPrime(7));
    }
    
    //  assertTrue(boolean condition, Supplier<String> messageSupplier)
    @Test
    public void primeNumberTestWithConditionAndSupplier(){
        Assertions.assertTrue(att.isPrime(13),() -> "Number is not prime");
    }
    
    // assertTrue(BooleanSupplier booleanSupplier, String message)
    @Test
    public void primeNumberTestWithBooleanSupplierAndMessage(){
        Assertions.assertTrue(() -> att.isPrime(17),"Number is not prime");
    }
    
    // assertTrue(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier)
    @Test
    public void primeNumberTestWithBooleanSupplierAndSupplier(){
        Assertions.assertTrue(() -> att.isPrime(89),() -> "Number is not prime");
    }
}
