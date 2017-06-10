import static org.junit.Assert.*;

import org.junit.Test;


public class CubeTestValidPolarCoordinates {
	
	
	@Test
	public void testNegativeCoordinates() {
		try{
			int x = -3;
			int y = -1;
			int z = 0;
			PolarCoordinate testPolarCoordinate = new PolarCoordinate(x,y,z);
			fail();
			
		}catch(Exception e){
			final String expected = "Negative Coordinates are not allowed";
				assertEquals(expected, e.getMessage()); 
					
		}
	}
	@Test
	public void testNonValidOneCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (0, 0 ,4);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidTwoCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (4, 0 , 0);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidThreeCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (0, 4 , 0);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidFourCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (100, 4 , 100);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidFiveCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (4, 100 , 100);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidSixCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (100, 100 , 4);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidSevenCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (100, 100 , 100);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testNonValidEightCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (0, 0 , 0);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidOneCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (7, 8 , 0);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidTwoCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (0, 7, 8);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidThreeCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (7, 8, 0);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidFourCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (7, 8, 100);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidFiveCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (7, 100, 8);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
	@Test
	public void testValidSixCoordinates() throws NonValidPolarCoordinateException {
		try{
			PolarCoordinate testPolarCoordinate = new PolarCoordinate (100, 7 , 8);
			Cube testCube = new Cube();
			testCube.setPolarCoordinate(testPolarCoordinate);
			fail();
		
		}catch(NonValidPolarCoordinateException e){
			final String expected = "The coordinates are not valid";
				assertEquals(expected, e.getMessage());
		}
	}
}
 