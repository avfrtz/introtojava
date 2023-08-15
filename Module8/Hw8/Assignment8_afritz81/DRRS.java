/*
 * Ava Fritz
 * 07/24/2023
 * This interface executes the drawObject, rotateObject,
 * resizeObject, and playSound methods.
 * 
 * Assumptions:
 * 1. Class of object has a drawObject method.
 * 2. Class of object has a rotateObject method.
 * 3. Class of object has a resizeObject method.
 * 4. Class of object has a playSound method.
 */
public interface DRRS 
{
    void drawObject();
    void rotateObject();
    void resizeObject();
    void playSound();
}
