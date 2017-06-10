import java.util.InputMismatchException;

public class PolarCoordinate {

	private int x;
	private int y;
	private int z;	
	
	/*
	 * Creates PolarCoordinate, which must consist of positive Integers
	 * @param x,y,z
	 */
	public PolarCoordinate(int x, int y, int z)throws InputMismatchException{
		if(proofNegative(x, y, z)){
			throw new InputMismatchException("Negative Coordinates are not allowed");
		}else{
			setX(x);
			setY(y);
		    setZ(z);
		}
	}
	public PolarCoordinate(){
		
	}
	
	/*
	 * Little Helper to proof if negative
	 * @param x,y,z
	 */
	private boolean proofNegative(int x, int y, int z){
		if(x < 0 || y < 0 || z < 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getZ(){
		return this.z;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	
}