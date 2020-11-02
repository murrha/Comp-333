public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode
    
  //length: return length of a list
    public int length() //error 
    {
    	//have to count each cons that's present
    	return 1 + tail.length(); 
    }
    
    //sum: returns the sum of all the elements of the list
    public int sum()
    {
    	//each Cons instance will contain an element, have to add the elements within each other 
    	return head + tail.sum();
    }
    
    //append: appends two lists together, returning a new list.
    public ImmutableList append(final ImmutableList other)
    {
    	//the elements of the first list will have to be copied
    	//the last element will point to the first element of the appended list
    	return new Cons(head, tail.append(other)); 
    }
    
    //contains: returns true if the given list contains the given element, else false.
    public boolean contains(final int value) 
    {
    	//if value == head, return true
    	//if the tail contains the value, return true
    	//otherwise, return false
    	return tail.contains(value) || head == value || false; 
    }
    
} // Cons

//body of each methods need a single line of code
//cons = constructor, contains an element in the list
//shouldnt need any casting 


//9-15-2020 12 failures: length, append, contains
//9-16-2020 14 failures: append, contains, length
/*09-17-2020 10 failures: append, contains
6 failures: append, contains
3 failures: contains */ 
