package com.example.StoreImageInDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int imgid;
	private String imgname;
	private String imgtype;
	
	@Lob
	private byte[] image;

	public int getImgid() {
		return imgid;
	}

	public void setImgid(int imgid) {
		this.imgid = imgid;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	public String getImgtype() {
		return imgtype;
	}

	public void setImgtype(String imgtype) {
		this.imgtype = imgtype;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Image(String imgname, String imgtype, byte[] image) {
		super();
		this.imgname = imgname;
		this.imgtype = imgtype;
		this.image = image;
	}
	
	
}
