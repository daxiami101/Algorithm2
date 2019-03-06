package designPattern.momemto;
public class MementoPatternDemo {
   public static void main(String[] args) {
      Originator originator = new Originator();//设置状态
      CareTaker careTaker = new CareTaker();//负责记录状态
      
//      originator.setState("State #1");//设置状态，但未保存
      originator.setState("State #2");//设置状态
      careTaker.add(originator.saveStateToMemento());//保存状态
      
      originator.setState("State #3");//设置状态
      careTaker.add(originator.saveStateToMemento());//保存状态
      
      originator.setState("State #4");//设置状态，但未保存
      System.out.println("Current State: " + originator.getState());		
     
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}