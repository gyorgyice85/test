import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTest {
	Cube cube = new Cube();
	PolarCoordinate pc = new PolarCoordinate(3, 5, 0);
	PolarCoordinate pc2 = new PolarCoordinate(0, 7, 99);
	PolarCoordinate pc3 = new PolarCoordinate(100, 100, 100);
	PolarCoordinate pc4 = new PolarCoordinate(99, 99, 99);
	PolarCoordinate pc5 = new PolarCoordinate(0, 0, 0);
	PolarCoordinate pc6 = new PolarCoordinate(0, 0, 10);
	PolarCoordinate pc7 = new PolarCoordinate(0, 10, 0);
	PolarCoordinate pc8 = new PolarCoordinate(10, 0, 0);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		

	}

	@Test
	public void testSetPolarCoordinate(){
		try{
			cube.setPolarCoordinate(pc);

		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate2(){
		try{
			cube.setPolarCoordinate(pc2);
		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate3(){
		try{

			cube.setPolarCoordinate(pc3);

		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate4(){
		try{

			cube.setPolarCoordinate(pc4);
		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate5(){
		try{			
			cube.setPolarCoordinate(pc5);

		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate6(){
		try{

			cube.setPolarCoordinate(pc6);

		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate7(){
		try{

			cube.setPolarCoordinate(pc7);
		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSetPolarCoordinate8(){
		try{
			cube.setPolarCoordinate(pc8);
		} catch (InputMismatchException ime) {
			System.err.println(ime);

		} catch (NonValidPolarCoordinateException nvpce) {
			System.err.println(nvpce);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


}
