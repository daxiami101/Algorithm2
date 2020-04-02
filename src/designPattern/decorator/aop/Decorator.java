package designPattern.decorator.aop;

public abstract class Decorator implements GoodsSaleEbi {

	protected GoodsSaleEbi ebi;

	public Decorator(GoodsSaleEbi ebi) {
		this.ebi = ebi;
	}
}
