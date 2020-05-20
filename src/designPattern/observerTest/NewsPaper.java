package designPattern.observerTest;

public class NewsPaper extends Subject {

	private String content;

	public NewsPaper(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		notifyObservers();
	}
	
}
