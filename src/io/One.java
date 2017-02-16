package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class One {
	public static void main(String[] args){
		//int[] a=new int[2];
		String beforePath="";
		copyFile("E:\\a\\1.txt","E:\\a\\2.txt");
	}
	/**
	 * ����·��������һ���ļ�
	 * @param beforePath
	 * @param afterPath
	 * @throws  
	 */
	public static void copyFile(String beforePath,String afterPath) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File before=new File(beforePath);//���������ļ��Ķ���ʵ����
		File after=new File(afterPath);//����Ҫ������ļ��Ķ���ʵ����
		try {
			 fis=new FileInputStream(before);//�����ļ�����������ȡbefore�ļ������׳��쳣����
             fos=new FileOutputStream(after);//�����ļ����������������Ϣд���ļ���
			//byte[]  b=new byte[1024];//����һ�ֽڵĻ�������
             byte[] b=new byte[5];
			int length=0;
		   while((length=fis.read(b))!=-1){//�����������ļ�д���ļ��������
			   //eg:д��12�ֽڵ����ݣ����ζ������5��5��2�ֽڣ�
			    System.out.println(length+"��ȡ���ֽ���");
			   fos.write(b, 0,length);//�ڽ����������ļ�д�������
			   
		   }
		 } catch (FileNotFoundException e) {
        	e.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
			}finally{//�ر���
		    	try {
					 if(fis!=null)fis.close();
					 if(fos!=null)fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
	}
}
