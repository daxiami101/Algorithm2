package annotation.demo02;


import annotation.demo02.FruitColor.Color;

public class Apple {
    
    @FruitName("Apple")
    private String appleName;
    
    @FruitColor(fruitColor=Color.RED)
    private Color appleColor;
    
    
    public Color getAppleColor() {
		return appleColor;
	}
	public void setAppleColor(Color appleColor) {
		this.appleColor = appleColor;
	}
	public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
	@Override
	public String toString() {
		return "Apple [appleName=" + appleName + ", appleColor=" + appleColor + "]";
	}
    
}