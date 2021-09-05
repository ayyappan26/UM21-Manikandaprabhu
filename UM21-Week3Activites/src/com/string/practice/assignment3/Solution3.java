package com.string.practice.assignment3;

import java.io.File;

public class Solution3 {

	public static void main(String[] args) {
		String str="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		File path = new File(str);
		String str1=path.getParent();
		
		System.out.println("1.Drive :"+str1.substring(0,3));
		
		String str2=str.replaceAll("\\\\", "||");
		String substring=str1.substring(4);
		
		System.out.println("2.Folder:"+substring);
		System.out.println("3.File  :"+path.getName());

	}

}
