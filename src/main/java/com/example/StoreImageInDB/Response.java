package com.example.StoreImageInDB;

public class Response {
	
	private String imgname;
	private String filedownloaduri;
	private String contentType;
	private long size;
	public Response(String imgname, String filedownloaduri, String contentType, long size) {
		super();
		this.imgname = imgname;
		this.filedownloaduri = filedownloaduri;
		this.contentType = contentType;
		this.size = size;
	}
}
