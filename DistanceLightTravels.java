package com.concent;

public class DistanceLightTravels {
    public static void main(String args[]) {
        int lightSpeed;
        long days;
        long distance;
        long seconds;
        //approximate speed of light in miles per second
        lightSpeed = 186000;
        days = 365;
        //convert to seconds
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println("distance " + distance);

    }
}
