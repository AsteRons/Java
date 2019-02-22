package part_07;

public class Element {

	int wartosc;
	double cos;
	long cos2;
	String cos3;

	
	public Element ( int wartosc)
	{
		this.wartosc = wartosc;
	}
	
	
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.wartosc == ((Element)obj).wartosc;
    }
    
    
    
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 14 * hash + this.wartosc;
        
        
        /*
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.cos) ^ (Double.doubleToLongBits(this.cos) >>> 32));
        hash = 89 * hash + (int) (this.cos2 ^ (this.cos2 >>> 32));
        hash = 89 * hash + (this.co3 != null ? this.co3.hashCode() : 0);
         * NADMIERNE
         * */
        return hash;
    }




	
	

}
