package thread;

import java.util.Date;
/**
 * sleep()ָ��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У���
 * @author Administrator
 *
 */
public class SleepTest {
    public static void main(String[] args) {
       Runnable1 r = new Runnable1(); //r.run();�������߳̿��������Ǽ򵥵ķ�������
       Thread t = new Thread(r);//�����߳�
        t.start();
        try {
            Thread.sleep(10000); //���߳�˯��10����
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //���߳�˯��10���Ӻ����t�߳�
        //t.interrupt(); //���ֽ�����ʽ�Ƚϴֱ������t�̴߳���ĳ����Դ��û���ü��ر�Ҳ����run������û��ִ�����ǿ�ƽ����̣߳��ᵼ����Դ�޷��ر�
        //t.stop();Ҳ�ǽ���ĳ���̣߳����ַ�ʽ��interrupt()���ֱ�
        r.flag = false;
    }
}
class Runnable1 implements Runnable{
    boolean flag = true; //�����ַ�ʽ�����̺߳ܲ�����һ����������run����ʲôʱ����ִ�У��������run����û��ִ����Ͼͽ���
    @Override
    public void run() { //run����һ�����������߳̾���ֹ��
        while(flag){
            System.out.println("---"+new Date()+"---");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}