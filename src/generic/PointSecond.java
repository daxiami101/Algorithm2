package generic;

public class PointSecond<T> {
	private T radius;

	public PointSecond(T radius) {
		super();
		this.radius = radius;
	}

	public PointSecond() {
		super();
	}

	public T getRadius() {
		return radius;
	}

	public void setRadius(T radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "PointSecond [radius=" + radius + "]";
	}
	

}
