package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args){
		fileOutputStream3();
	}

	/**
	 * 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
	 */
	public static void fileOutputStream1(){
		FileOutputStream fos = null;
		byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// 写文件的时候不覆盖原来的内容
			fos.write(b, 0, 4);// 将字节数组里的数据写入文件
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
	 * FilterOutputStream 的 write 方法将 b、0 和 b.length 作为三个参数来调用 write 方法。
	 */
	public static void fileOutputStream2(){
		FileOutputStream fos = null;
		byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// 写文件的时候不覆盖原来的内容
			fos.write(b);// 将字节数组里的数据写入文件
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
	 * FilterOutputStream 的 write 方法将 b、0 和 b.length 作为三个参数来调用 write 方法。
	 */
	public static void fileOutputStream3(){
		FileOutputStream fos = null;
		// byte[] b = {65, 66, 67, 68, 69};
		try{
			fos = new FileOutputStream("E://out.txt", true);// 写文件的时候不覆盖原来的内容
			fos.write(126);// 将字节数组里的数据写入文件
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
