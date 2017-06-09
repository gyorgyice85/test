
public class Square {

		private int startX;
		private int startY;
		private int endX;
		private int endY;
		private int xAchse;
		private int yAchse;
		
		
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
			this.xAchse = a;
			this.yAchse = b;
		}
		
		
}
