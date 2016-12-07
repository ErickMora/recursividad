package recursividad;

public class InvertirNum {
	 public static String invertir (int n)
	    {
		if (n < 10)         //caso base
		    return ""+n+"";
		else
		    return ""+(n % 10)+"" + ""+invertir (n / 10)+"";
	    }
	

	public static void main(String[] args){

		
		System.out.println(invertir(489));		

	}

}
