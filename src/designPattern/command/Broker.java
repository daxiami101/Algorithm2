package designPattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){//接受命令
      orderList.add(order);		
   }

   public void placeOrders(){//一次性执行命令
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();//清空命令容器
   }
}