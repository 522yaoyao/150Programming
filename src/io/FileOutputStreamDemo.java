package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args){
		fileOutputStream3();
	}

	/**
	 * ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����������
	 */
	public static void fileOutputStream1(){
		FileOutputStream fos = null;
		byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// д�ļ���ʱ�򲻸���ԭ��������
			fos.write(b, 0, 4);// ���ֽ������������д���ļ�
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(null != fos) try{
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * FilterOutputStream �� write ������ b��0 �� b.length ��Ϊ�������������� write ������
	 */
	public static void fileOutputStream2(){
		FileOutputStream fos = null;
		byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// д�ļ���ʱ�򲻸���ԭ��������
			fos.write(b);// ���ֽ������������д���ļ�
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(null != fos) try{
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * FilterOutputStream �� write ������ b��0 �� b.length ��Ϊ�������������� write ������
	 */
	public static void fileOutputStream3(){
		FileOutputStream fos = null;
		// byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// д�ļ���ʱ�򲻸���ԭ��������
			fos.write(126);// ���ֽ������������д���ļ�
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(null != fos) try{
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
