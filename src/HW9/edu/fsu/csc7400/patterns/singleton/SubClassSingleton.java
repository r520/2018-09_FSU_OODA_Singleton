/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 - Singleton Problems
 * Author: Radhika Kasu
 * Date: 2017-11-11
 */
package HW9.edu.fsu.csc7400.patterns.singleton;

public class SubClassSingleton {
    //private static BaseSingleton instance;

    /**
     * Simple function that sets state
     */
    //@Override
    public void doSomething() {
        BaseSingleton.getInstance().setSomeState(2);
        //setSomeState(2);
    }

    private static SubClassSingleton instance;
    public static SubClassSingleton getInstance() {
        if (instance == null) {
            instance = new SubClassSingleton();
        }
        return instance;
    }
    /**
     * Sets someState to newValue
     */
    protected void setSomeState(int newValue) {
        someState = newValue;
    }

    /**
     * Returns value of someState
     */
    public int getSomeState() {
        return someState;
    }

    /**
     * Simple function that sets state, will get overwritten
     */


    /**
     * State variable used for testing
     */
    private int someState = 0;


    /**
     * This is a new function which will print a message
     *
     * @returns 100
     */
    public int newFunction() {
        System.out.println("NewFunction printout");
        return 100;
    }

    /**
     * Single constructor must be private
     */
    private SubClassSingleton() {
    }

}