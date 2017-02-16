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
	 * 根据路径将复制一份文件
	 * @param beforePath
	 * @param afterPath
	 * @throws  
	 */
	public static void copyFile(String beforePath,String afterPath) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File before=new File(beforePath);//创建已有文件的对象实例；
		File after=new File(afterPath);//创建要保存的文件的对象实例；
		try {
			 fis=new FileInputStream(before);//创建文件输入流，读取before文件（会抛出异常）；
             fos=new FileOutputStream(after);//创建文件输出流，用来把信息写入文件；
			//byte[]  b=new byte[1024];//创建一字节的缓冲区；
             byte[] b=new byte[5];
			int length=0;
		   while((length=fis.read(b))!=-1){//将输入流的文件写入文件缓冲和区
			   //eg:写入12字节的数据，依次读入的是5，5，2字节；
			    System.out.println(length+"读取的字节数");
			   fos.write(b, 0,length);//在将缓冲区的文件写入输出流
			   
		   }
		 } catch (FileNotFoundException e) {
        	e.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
			}finally{//关闭流
		    	try {
					 if(fis!=null)fis.close();
					 if(fos!=null)fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
	}
}
