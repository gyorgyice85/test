
public class NonValidPolarCoordinateException extends Exception {
	public NonValidPolarCoordinateException(){
		}
	public NonValidPolarCoordinateException(String message){
		super("The Coordinates are not valid!");
	}
	
}
