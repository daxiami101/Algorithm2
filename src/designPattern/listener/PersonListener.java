package designPattern.listener;
/**
 * �¼�������
 *
 * ����Person�¼�Դ��eat��sleep����
 */
public interface PersonListener{

    void doEat(Event event);
    void doSleep(Event event);
}