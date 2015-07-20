package practiceJava;

public class point {
	
	double x,y,z;
	
	point(double _x,double _y,double _z){
		x = _x;
	}
	
	public double setX(double _x){
		return x = _x;
	}
	double getDistance(point p){
		return (x - p.x);
	}
}
