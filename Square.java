
public class Square {

		private int startX;
		private int startY;
		private int endX;
		private int endY;
		private int pointA;
		private int pointB;
		
		
		/*
		 * Limits every Square with 0 and 100;
		 */
		
		public Square(){
			this.startX = 0;
			this.startY = 0;
			this.endX   = 100;
			this.endY   = 100;
		}


		public int getStartX() {
			return startX;
		}

		public int getStartY() {
			return startY;
		}

		public int getEndX() {
			return endX;
		}

		public int getEndY() {
			return endY;
		}
		public void setCoordinate(int a, int b){
			this.pointA = a;
			this.pointB = b;
		}
		
		/*
		public String toString(){
			StringBuffer sb = new StringBuffer();
			String str;
			str = sb.append("\nSquare values\n").append("Start.X= "+ getStartX()+" ").append("End.X= "+ getEndX()+" ").append("\t").append("Start.Y= "+getStartY()+ " ").append("End.Y= "+getEndY()).toString();
			
			return str;
		}
		*/
}
