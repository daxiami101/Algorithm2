package designPattern.listener;

public class Client {
	 public static void main(String[] args) {

	        Person person = new Person();

	        //ע�������()
	        person.registerLister(new PersonListener() {
	            @Override
	            public void doEat(Event event) {
	                Person person1 = event.getResource();
	                System.out.println(person1 + "���ڳԷ��أ�");
	            }

	            @Override
	            public void doSleep(Event event) {
	                Person person1 = event.getResource();
	                System.out.println(person1 + "����˯���أ�");
	            }
	        });


	        //������eat����ʱ�������¼������¼����󴫵ݸ���������������������¼�Դ�����¼�Դ���в���
	        person.Eat();
	    }

}
