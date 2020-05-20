package designPattern.listener;


/**
 * �¼�����Even
 *
 * �¼������װ���¼�Դ
 *
 * �ڼ��������ܹ�ͨ���¼������ȡ�õ��¼�Դ
 *
 *
 */
public class Event{
    private Person person;

    public Event() {
    }


    public Event(Person person) {
    	this.person = person;
	}

	public Person getResource() {
        return person;
    }

}