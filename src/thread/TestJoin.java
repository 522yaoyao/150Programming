package thread;

import java.util.Date;

/*
 * t.join()����ָ�ȴ�t�߳���ֹ��Ҳ�������Ϊ��t�̺߳ϲ�����ǰ�߳������ȴ�t�߳̽�����������ִ�С��൱�ڷ�������
 */
public class TestJoin {
    public static void main(String[] args) {
        Thread t = new Thread3("abc");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("����main�߳�");
            if(i==10){
                try {
                    t.join();
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread3 extends Thread{
    public Thread3(String s) { //�����߳�ȡһ�����֣���getName()��������ȥ��������
        super(s);
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("����"+getName()+"�߳�");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}