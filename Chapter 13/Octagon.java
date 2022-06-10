package exercise1311;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	
			double side = 0; 
			double area = (2 + (4 / Math.sqrt(2)) * side * side);
	
			Octagon(){
			}
			Octagon(double side){
				this.side = side; 
			}
		public double getSide() {
			return side; 
		}
		public void setSide(double side) {
			this.side = side; 
		}
		@Override 
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
		@Override
		public int compareTo(Octagon o) {
			if (getArea() > o.getArea())
				return 1; 
			else if (getArea() < o.getArea())
				return -1; 
			else
				return 0;
		}
		@Override
		public double getArea() {
			return area;
		}
		@Override
		public double getPerimeter() {
			return side * 8; 
		}
}
