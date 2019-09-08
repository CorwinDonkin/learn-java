package com.donkin.learnjava;

/**
 *
 * @author james
 */

public class SimpleStarting 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        for (int i = 0; i<10; i = i + 2)
        {
            if (i == 4)
            {
                System.out.println("Hello number 4");
            }
            System.out.println("This is something " + i);
        }
        
 
    }
    
}
