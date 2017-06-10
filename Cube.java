
public class Cube {
	
	/*
	 * A this constis of six 2-D Squares
	 */
	// kein Cube Objekt erstellen, da dies im CubeTest geschieht
	private Square square = new Square();
	private Square leftSquare = new Square();
	private Square rightSquare = new Square();
	private Square bottomSquare = new Square();
	private Square topSquare = new Square();
	private Square frontSquare = new Square();
	private Square backSquare = new Square();
	
	
	/**
	 * Corners of the this. Not neccessarily needed (yet)
	 *
	 */
	private final static short MAX = 100;
	private final static short MIN = 0;

		private final PolarCoordinate CornerOne  = new PolarCoordinate (MIN, MIN, MIN);
		private final PolarCoordinate CornerTwo  = new PolarCoordinate (MAX, MIN, MIN);
		private final PolarCoordinate CornerThree= new PolarCoordinate (MIN, MAX, MIN);
		private final PolarCoordinate CornerFour = new PolarCoordinate (MIN, MIN, MAX);
		private final PolarCoordinate CornerFive = new PolarCoordinate (MAX, MAX, MIN);
		private final PolarCoordinate CornerSix  = new PolarCoordinate (MIN, MAX, MAX);
		private final PolarCoordinate CornerSeven= new PolarCoordinate (MAX, MIN, MAX);
		private final PolarCoordinate CornerEight= new PolarCoordinate (MAX, MAX, MAX);

	
	

	
	/*
	 * Places the PolarCoordinate inside the specific square of the this
	 */
	public void setPolarCoordinate(PolarCoordinate polarCoordinate) throws NonValidPolarCoordinateException{
		if(this.isValidPolarCoordinate(polarCoordinate) == true){
			if(this.whichSquare(polarCoordinate) == leftSquare){
				this.leftSquare.setCoordinate(polarCoordinate.getY(), polarCoordinate.getZ());
				
			}else if(this.whichSquare(polarCoordinate) == bottomSquare){
				this.bottomSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getZ());
				
			}else if(this.whichSquare(polarCoordinate) == frontSquare){
				this.frontSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getY());
				
			}else if(this.whichSquare(polarCoordinate) == rightSquare){
				this.rightSquare.setCoordinate(polarCoordinate.getY(), polarCoordinate.getZ());
				
			}else if(this.whichSquare(polarCoordinate) == topSquare){
				this.topSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getZ());
				
			}else if(this.whichSquare(polarCoordinate) == backSquare){
				this.backSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getY());
				
			}
	
		}else{
			throw new NonValidPolarCoordinateException();
		}
	}
	

	
	
	/**
	 * Depending on the ranges of (x,y,z)-coordinates, this method specifies the square in which the coordinate belongs
	 * (Assuming six different 2-D-Squares). Also if the coordinate is a Corner it won't be given a square
	 * @param polarCoordinate
	 * @return specific square, in which the polarCoordinate belongs
	 */
	// Für Test zwecke public gesetzt 
	public Square whichSquare(PolarCoordinate polarCoordinate){
		if(polarCoordinate.getX() == MIN && polarCoordinate.getY() > MIN && polarCoordinate.getZ() > MIN){
			return leftSquare;
		}else if(!(isCorner(polarCoordinate)) && polarCoordinate.getX() > MIN && polarCoordinate.getY() == MIN && polarCoordinate.getZ() > MIN){
			return bottomSquare;
		}else if(!(isCorner(polarCoordinate)) && polarCoordinate.getX() > MIN && polarCoordinate.getY() > MIN && polarCoordinate.getZ() == MIN){
			return frontSquare;
		}else if(!(isCorner(polarCoordinate)) && polarCoordinate.getX() == MAX && polarCoordinate.getY() > MIN && polarCoordinate.getZ() > MIN){
			return rightSquare;
		}else if(!(isCorner(polarCoordinate)) && polarCoordinate.getX() > MIN && polarCoordinate.getY() == MAX && polarCoordinate.getZ() > MIN){
			return topSquare;
		}else if(!(isCorner(polarCoordinate)) && polarCoordinate.getX() > MIN && polarCoordinate.getY() > MIN && polarCoordinate.getZ() == MAX){
			return backSquare;
		}else{ // sollte hier nicht eine Exception sein
			return null;
		}
	}
		
	/**
	 * Method to test if a PolarCoordinate is a corner
	 * @param See if this Coordinate is a corner
	 */
	private boolean isCorner(PolarCoordinate pc1){
		Boolean isCorner = false;
		PolarCoordinate[] cornerArr = {CornerOne, CornerTwo, CornerThree, CornerFour, CornerFive, CornerSix, CornerSeven, CornerEight};
		
		for(int i= 0; i<cornerArr.length; i++){
			if(pc1.getX() == cornerArr[i].getX() && pc1.getY() == cornerArr[i].getY() && pc1.getZ() == cornerArr[i].getZ()){
				isCorner = true;
				return isCorner;
			}
		}
			
		
			
		return isCorner;
	}
	
	/**
	 * Checks if the coordinate has at least one max or min value for x,y or z. But not more than one.
	 * @param The PolarCoordinate pc that I want to check for min max values
	 * @return true, if coordinate only has one min max value
	 * @return false, if coordinate has more than one min max value
	 */
	private boolean hasOneMaxMin(PolarCoordinate pc){
		if(pc.getX()== MAX || pc.getX() == MIN && pc.getY() != MAX && pc.getY() != MIN && pc.getZ() 
				!= MAX && pc.getZ() != MIN){
			return true;
		}else if(pc.getY()== MAX || pc.getY() == MIN && pc.getX() != MAX && pc.getX() != MIN && pc.getZ() 
				!= MAX && pc.getZ() != MIN){
			return true;
		}else if(pc.getZ()== MAX || pc.getZ() == MIN && pc.getY() != MAX && pc.getY() != MIN && pc.getX() 
				!= MAX && pc.getX() != MIN){
			return true;
		}
		return false;
	}
	
	/**
	 * Proofs if PolarCoordinate is valid: Does it lie inside a square?
	*/
	private boolean isValidPolarCoordinate(PolarCoordinate polarCoordinate){
		if(polarCoordinate.getX() <= square.getEndX() && polarCoordinate.getX() >= square.getStartY()){
			if(polarCoordinate.getY() <= square.getEndY() && polarCoordinate.getY() >= square.getStartY()){
				if(polarCoordinate.getZ() <= square.getEndY() && polarCoordinate.getZ() >= square.getStartY()){ 
					if(!(isCorner(polarCoordinate)) && hasOneMaxMin(polarCoordinate))
						return true;
				}
			}
			
		}return false;
	}
	
	
		
}