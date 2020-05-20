package designPattern.listener;

public class Person {
    
    //�ڳ�Ա��������һ������������
    private PersonListener personListener ;
    
    //���¼�Դ�ж�����������
    public void Eat() {
        //���¼�Դ������Eat����ʱ��Ӧ�ô����������ķ��������ü������ķ��������¼����󴫵ݽ�ȥ
        personListener.doEat(new Event(this));
    }

    public void sleep() {

        //���¼�Դ������Eat����ʱ��Ӧ�ô����������ķ��������ü������ķ��������¼����󴫵ݽ�ȥ
        personListener.doSleep(new Event(this));
    }

    //ע�������������û�м��������󰡣���ô�ʹ��ݽ����ɡ�
    public void registerLister(PersonListener personListener) {
        this.personListener = personListener;
    }

}