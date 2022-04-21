/**
 * 
 */

/**
 * @author Bad Taste
 * greetz in different languages
 */
public class foo {

	/**
	 * Greets 
	 * @param lng chosen language
	 * @param rep how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int lng, int rep) {
		String word = "";
		String preLng = "";
		
		switch (lng) {
			case 0 : preLng = "hola";
					 break;
			case 1 : preLng = "hello";
					 break;
			case 2 : preLng = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0; i<rep; i++) {
			word += preLng;
		}
		
		return word;
	}
}
