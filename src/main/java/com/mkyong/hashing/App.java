package com.mkyong.hashing;

import com.mkyong.hashing.service.Calculator;
import com.mkyong.hashing.ui.Userinterface;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args )
    {
        Calculator calculator = new Calculator();
        Userinterface userinterface = new Userinterface(calculator);
        userinterface.processOperation();
    }
}

