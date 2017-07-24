package com.s2sm.konan.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

public class FileUploadAction {

	private String filename;
	private File file;
	private String fileContentType;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	
	public String execute() throws Exception{
		String root = ServletActionContext.getServletContext().getRealPath("/");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(new File(root,filename));
		System.out.println("filename:"+filename);
		System.out.println("file:"+file.getName());
		System.out.println("file:"+file.getPath());
		byte[] buffer = new byte[500];
		int length = 0;
		while(-1!=(length=is.read(buffer,0,buffer.length))){
			os.write(buffer);
		}
		os.close();
		is.close();	
		return "success";
	}

}
