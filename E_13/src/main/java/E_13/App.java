package E_13;

import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculateInterest calculator = new CalculateInterest();

        calculator.getValues();

        calculator.calcInterest();
    }
}
