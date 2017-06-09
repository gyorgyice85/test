
public class Cube {
	
	/*
	 * A Cube consists of six 2-D Squares
	 */
	Cube cube = new Cube();
	Square square = new Square();
	Square leftSquare = new Square();
	Square rightSquare = new Square();
	Square bottomSquare = new Square();
	Square topSquare = new Square();
	Square frontSquare = new Square();
	Square backSquare = new Square();
	
	
	/**
	 * Corners of the cube. Not necessarily needed (yet)
	 *
	 */
	final PolarCoordinate CornerOne  = new PolarCoordinate (0, 0, 0);
	final PolarCoordinate CornerTwo  = new PolarCoordinate (100, 0, 0);
	final PolarCoordinate CornerThree= new PolarCoordinate (0, 100, 0);
	final PolarCoordinate CornerFour = new PolarCoordinate (0, 0, 100);
	final PolarCoordinate CornerFive = new PolarCoordinate (100, 100, 0);
	final PolarCoordinate CornerSix  = new PolarCoordinate (0, 100, 100);
	final PolarCoordinate CornerSeven= new PolarCoordinate (100, 0, 100);
	final PolarCoordinate CornerEight= new PolarCoordinate (100, 100, 100);
	

	
	/*
	 * Places the PolarCoordinate inside the specific square of the cube
	 */
	public void setPolarCoordinate(PolarCoordinate polarCoordinate) throws NonValidPolarCoordinateException{
		if(cube.isValidPolarCoordinate(polarCoordinate) == true){
			if(cube.whichSquare(polarCoordinate) == leftSquare){
				this.leftSquare.setCoordinate(polarCoordinate.getZ(), polarCoordinate.getY());
				
			}else if(cube.whichSquare(polarCoordinate) == bottomSquare){
				this.bottomSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getZ());
				
			}else if(cube.whichSquare(polarCoordinate) == frontSquare){
				this.frontSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getY());
				
			}else if(cube.whichSquare(polarCoordinate) == rightSquare){
				this.rightSquare.setCoordinate(polarCoordinate.getZ(), polarCoordinate.getY());
				
			}else if(cube.whichSquare(polarCoordinate) == topSquare){
				this.topSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getZ());
				
			}else if(cube.whichSquare(polarCoordinate) == backSquare){
				this.backSquare.setCoordinate(polarCoordinate.getX(), polarCoordinate.getY());
			}
	
		}else{
			throw new NonValidPolarCoordinateException();
		}
	}
	
	
	/**
	 * Depending on the ranges of (x,y,z)-coordinates, this method specifies the square in which the coordinate belongs
	 * (Assuming six different 2-D-Squares)
	 * @param polarCoordinate
	 * @return specific square, in which the polarCoordinate belongs
	 */
	private Square whichSquare(PolarCoordinate polarCoordinate){
		if(polarCoordinate.getX() == 0 && polarCoordinate.getY() > 0 && polarCoordinate.getZ() > 0){
			return leftSquare;
		}else if(polarCoordinate.getX() > 0 && polarCoordinate.getY() == 0 && polarCoordinate.getZ() > 0){
			return bottomSquare;
		}else if(polarCoordinate.getX() > 0 && polarCoordinate.getY() > 0 && polarCoordinate.getZ() == 0){
			return frontSquare;
		}else if(polarCoordinate.getX() == 100 && polarCoordinate.getY() > 0 && polarCoordinate.getZ() > 0){
			return rightSquare;
		}else if(polarCoordinate.getX() > 0 && polarCoordinate.getY() == 100 && polarCoordinate.getZ() > 0){
			return topSquare;
		}else if(polarCoordinate.getX() > 0 && polarCoordinate.getY() > 0 && polarCoordinate.getZ() == 100){
			return backSquare;
		}else{
			return null;
		}
	}
		
		
	/*
	 * Proofs if PolarCoordinate is valid: Does it lie inside a square?
	*/
	private boolean isValidPolarCoordinate(PolarCoordinate polarCoordinate){
		if(polarCoordinate.getX() <= square.getEndX() && polarCoordinate.getX() >= square.getStartY()){
		}else if(polarCoordinate.getY() <= square.getEndY() && polarCoordinate.getY() >= square.getStartY()){
		}else if(polarCoordinate.getZ() <= square.getEndY() && polarCoordinate.getZ() >= square.getStartY()){
			return true;
		}return false;
	}
		
}
