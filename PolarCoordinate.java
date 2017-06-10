import java.util.InputMismatchException;

public class PolarCoordinate {

	private static final String MTONMNVE = "There is either none or more than one Min/Max value, only one Max/Min value is allowed";
	private static final int MAX = 100;
	private static final int MIN = 0;
	private int x;
	private int y;
	private int z;
	private PolarCoordinate neighbor;
	
	
	/**
	 * Creates PolarCoordinate, which must consist of positive Integers
	 * @param x,y,z-Axis(values)
	 */
	public PolarCoordinate(int x, int y, int z)throws InputMismatchException{
		if(proofNegative(x, y, z)){
			throw new InputMismatchException("Negative Coordinates are not allowed");
		}else{
			this.x = x;
			this.y = y;
		    this.z = z;
		}
	}
	
	/**
	 * Creates PolarCoordinate, which consists of positive Integers and a neighbor that is a PolarCoordinate
	 * @param x-Axis(value)
	 * @param y-Axis(value)
	 * @param z-Axis(value)
	 * @param neighbor is the neighbor in your zone 
	 * @throws InputMismatchException if on of the x,y,z values are negative throw this exeption.
	 */
	public PolarCoordinate(int x, int y, int z, PolarCoordinate neighbor)throws InputMismatchException, MoreThanOneOrNoneMinMaxValueException{
		if(proofNegative(x, y, z)){
			throw new InputMismatchException("Negative Coordinates are not allowed");
		}else if (proofNegative(x,y,z) && maxMinExists(x,y,z)){
			throw new MoreThanOneOrNoneMinMaxValueException(MTONMNVE);
		}else {
			this.x = x;
			this.y = y;
		    this.z = z;
		    this.neighbor = neighbor;
		}
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
	

	
	/**
	 * Check if the given coordinates are potential neighbors
	 * @param pc the Coordinate that I want to know of if the potNeighbor is really a neighbor
	 * @param potNeighbor a potential neighbor
	 * @return true if potNeighbor is in reach of the pc, else return false
	 */
	public boolean isNeighbor(PolarCoordinate pc,PolarCoordinate potNeighbor){
		if(pc.getX() == potNeighbor.getX() && pc.getY() == potNeighbor.getY() && pc.getZ() == potNeighbor.getZ()){
			return false;
			//if X and/or Y are equal Z can't be equal
		}else if(pc.getX()-1 == potNeighbor.getX() || pc.getX()+1 == potNeighbor.getX() || isXequal(pc, potNeighbor)
				&& pc.getY()-1 == potNeighbor.getY() || pc.getY()+1 == potNeighbor.getY() || isYequal(pc, potNeighbor)
				 && pc.getZ()-1 == potNeighbor.getZ() || pc.getZ()+1 == potNeighbor.getZ() || !(isZequal(pc,potNeighbor))){
			return true;
			//if X and/or Z are equal Y can't be equal
		}else if(pc.getX()-1 == potNeighbor.getX() || pc.getX()+1 == potNeighbor.getX() || isXequal(pc, potNeighbor)
				&& pc.getY()-1 == potNeighbor.getY() || pc.getY()+1 == potNeighbor.getY() || !(isYequal(pc, potNeighbor))
				 && pc.getZ()-1 == potNeighbor.getZ() || pc.getZ()+1 == potNeighbor.getZ() || isZequal(pc,potNeighbor)){
			return true;
			//if Y and/or Z are equal X can't be equal
		}else if(pc.getX()-1 == potNeighbor.getX() || pc.getX()+1 == potNeighbor.getX() || !(isXequal(pc, potNeighbor))
				&& pc.getY()-1 == potNeighbor.getY() || pc.getY()+1 == potNeighbor.getY() || isYequal(pc, potNeighbor)
				 && pc.getZ()-1 == potNeighbor.getZ() || pc.getZ()+1 == potNeighbor.getZ() || isZequal(pc,potNeighbor)){
			return true;
		}
		
		return false;	
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return true if only one min or max exists
	 */
	private boolean maxMinExists(int x,int y,int z){
		if(x == MAX || x == MIN && y != MAX && y != MIN && z != MAX && z != MIN){
			return true;
		}else if (y == MAX || y == MIN && x != MAX && x != MIN && z != MAX && z != MIN){
			return true;
		}else if(z == MAX || z == MIN && y != MAX && y != MIN && x != MAX && x != MIN){
			return true;
		}
		return false;
	}
	
	private boolean isXequal(PolarCoordinate pc1, PolarCoordinate pc2){
		if(pc1.getX() == pc2.getX()){
			return true;
		}
		return false;
	}
	
	private boolean isYequal(PolarCoordinate pc1, PolarCoordinate pc2){
		if(pc1.getY() == pc2.getY()){
			return true;
		}
		return false;
	}
	
	private boolean isZequal(PolarCoordinate pc1, PolarCoordinate pc2){
		if(pc1.getZ() == pc2.getZ()){
			return true;
		}
		return false;
	}
	
	//getter and setters
	public PolarCoordinate getNeighbor() {
		return neighbor;
	}
	
	public void setNeighbor(PolarCoordinate neighbor) {

		this.neighbor = neighbor;
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
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(getX()).append(", ").append(getY()).append(", ").append(getZ());
		return sb.toString();
	}
	
}