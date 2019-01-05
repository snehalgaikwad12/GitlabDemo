package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Simple class that says "Hello!".
 */
public class Hello {

    static final String HELLO = "Hello!";

    public static final int MAXIMUM_AMOUNT_OF_TIMES = 20;

    private int times = 1;

    /**
     * Set how many times "Hello!" should be said.
     *
     * @param times How many times should this class say "Hello!"? The value should be no larger than 20.
     * @throws IllegalArgumentException Thrown when times is larger than 20 or a negative number.
     */
    public void setTimes(int times) {
        if (times < 0 || times > MAXIMUM_AMOUNT_OF_TIMES) {
            throw new IllegalArgumentException(String.format(
                    "Parameter «times» should be a positive number no larger than %d.",
                    MAXIMUM_AMOUNT_OF_TIMES
            ));
        }
        this.times = times;
    }

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    public void sayHello(PrintStream printer) {
        for (short i = 0; i < times; i++) {
            printer.println(HELLO);
        }
    }
    
    private static double volume(String solidom, double alturam, double areaBasem, double raiom) {
double vol;
    if (solidom.equalsIgnoreCase("esfera"){
        vol=(4.0/3)*Math.pi*Math.pow(raiom,3);
    }
    else {
        if (solidom.equalsIgnoreCase("cilindro") {
            vol=Math.pi*Math.pow(raiom,2)*alturam;
        }
        else {
            vol=(1.0/3)*Math.pi*Math.pow(raiom,2)*alturam;
        }
    }
    return vol;
}
    
    
    


}
