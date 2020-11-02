public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
    
    //empty lists (Nil) will have length 0
    public int length()
    {
    	//this will return a length 0 because it's Nil
    	return 0; 
    }//end length
    
    //empty lists (Nil) have a sum of 0.
    public int sum()
    {
    	return 0; 
    }
    
    //append: appends two lists together, returning a new list.
    public ImmutableList append(final ImmutableList other)
    {
    	return other; 
    }
 
  //contains: returns true if the given list contains the given element, else false.
    public boolean contains(final int value)
    {
    	 //nil represents the end, contains no element
    	return false; 
    }
    
} // Nil
    
//nil is our own object created to represent the end of the list
//javac -cp .;hamcrest-2.2.jar;junit-4.13.jar -Xlint:all ImmutableList.java Cons.java Nil.java ImmutableListTest.java
//java -cp .;hamcrest-2.2.jar;junit-4.13.jar org.junit.runner.JUnitCore ImmutableListTest

//9-15-2020 12 failures: append
//09-17-2020 10 failures: append