package designPattern.momemto;

public class Memento {
	   private String state;

	 //状态只能通过构造方法设置，不能通过set方法，目的：state值一旦设置，则不会被修改
	   
	   public Memento(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }	
	}
