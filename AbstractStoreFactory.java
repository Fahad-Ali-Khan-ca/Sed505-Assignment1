// Abstract that should help us extend when adding new stores
// to the system.
// ----------------------------------------------------------------
// Created By: Fahad Ali Khan
// Created On: 2020-10-25
public abstract class AbstractStoreFactory {
    // display 
    public abstract void display();
    // calculate total
    public abstract double calculateTotal();
    // calculate average amount a customer spends
    public abstract double calculateAverage();

}