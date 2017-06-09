import java.util.InputMismatchException;

public class CubeTest {

	public static void main(String[] args) {
		//man benötigt immer einen MAX VALUE bei den Coordinates
	
			try {

				Cube cube = new Cube();
				try{
				System.out.println("x= -1, y=4, z=7 ");
				PolarCoordinate pc = new PolarCoordinate(-1, 4, 7);
				System.out.println("Which Square "+cube.whichSquare(pc)+ " Should be: null");
				cube.setPolarCoordinate(pc);
				
				}catch(Exception e){
					e.printStackTrace();
					
				}
					
				try{
				System.out.println("\nx= 0, y=7, z=99 ");
				PolarCoordinate pc2 = new PolarCoordinate(0, 7, 99);
				System.out.println("Which Square "+cube.whichSquare(pc2)+ " Should be: not be null\n");
				cube.setPolarCoordinate(pc2);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				System.out.println("x=100, y=100, z=100 ");
				PolarCoordinate pc3 = new PolarCoordinate(100, 100, 100);
				System.out.println("Which Square "+cube.whichSquare(pc3)+ " Should be: null");
				cube.setPolarCoordinate(pc3);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				//fehler
				System.out.println("x= 99, y=99, z=99 ");
				PolarCoordinate pc4 = new PolarCoordinate(99, 99, 99);
				System.out.println("Which Square "+cube.whichSquare(pc4)+ " Should be: null");
				cube.setPolarCoordinate(pc4);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				System.out.println("x=0, y=0, z=0 ");
				PolarCoordinate pc5 = new PolarCoordinate(0, 0, 0);
				System.out.println("Which Square "+cube.whichSquare(pc5)+  " Should be: null");
				cube.setPolarCoordinate(pc5);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				System.out.println("x= 0, y=0, z=10 ");
				PolarCoordinate pc6 = new PolarCoordinate(0, 0, 10);
				System.out.println("Which Square"+cube.whichSquare(pc6)+ " Should be: null");
				cube.setPolarCoordinate(pc6);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				System.out.println("x= 0, y=10, z=0 ");
				PolarCoordinate pc7 = new PolarCoordinate(0, 10, 0);
				System.out.println("Which Square "+cube.whichSquare(pc7)+ " Should be: null");
				cube.setPolarCoordinate(pc7);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println();
				}
					
				try{
				System.out.println("\nx= 10, y=0, z=0 ");
				PolarCoordinate pc8 = new PolarCoordinate(10, 0, 0);
				System.out.println("Which Square "+cube.whichSquare(pc8)+ " Should be: null");
				cube.setPolarCoordinate(pc8);
			
				}catch(Exception e){
					e.printStackTrace();
				}
					
				
				

			} catch (InputMismatchException ime) {
				System.err.println(ime);

			} catch (Exception e) {
				e.printStackTrace();

			}
		
			
		}

}
