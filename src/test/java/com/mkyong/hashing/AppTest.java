package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
{
private App app;@Before
public void setUp() throws Exception {
app = new App();
}@After
public void tearDown() throws Exception {
}@Test// unit test case that will check whether the method returns the 
// anticipated output or notpublic void testMultiplication() {
int result = app.multiply(10, 5);
assertEquals(result,40);
}
}
