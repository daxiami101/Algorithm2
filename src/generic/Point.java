package generic;

public class Point<A,B> {
	private A x;
	private A y;
	private B z;
	public A getX() {
		return x;
	}
	public void setX(A x) {
		this.x = x;
	}
	public A getY() {
		return y;
	}
	public void setY(A y) {
		this.y = y;
	}
	public B getZ() {
		return z;
	}
	public void setZ(B z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
