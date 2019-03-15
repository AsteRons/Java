package part_02;

public class ArrayAlg {

	
	
    /**
     * get the minimum and maximum of an array of objects of type T.
     * @param birthdays
     * @return
     */
  
	@SuppressWarnings("unchecked")
    public static <T extends Comparable> Pair<T> minmax(T[] birthdays) {
        if (null == birthdays || 0 == birthdays.length) return null;
        T min = birthdays[0];
        T max = birthdays[0];
        
        for (int i = 0; i < birthdays.length; i++) {
            if (min.compareTo(birthdays[i]) > 0) min = birthdays[i];
            if (max.compareTo(birthdays[i]) < 0) max = birthdays[i];
        }
        
        return new Pair<T>(min, max);
    }
}
