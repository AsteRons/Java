package part_02;


public class Pair<T> {
	
    private T first;
    private T second;
    
    /**
     * 
     */
    public Pair() {
    }
    
    /**
     * @param first
     * @param second
     */
    public Pair(T first, T second) {
      
        this.first = first;
        this.second = second;
    }
    /**
     * @return the first
     */
    public T getFirst() {
        return first;
    }
    /**
     * @param first the first to set
     */
    public void setFirst(T first) {
        this.first = first;
    }
    /**
     * @return the second
     */
    public T getSecond() {
        return second;
    }
    /**
     * @param second the second to set
     */
  
}