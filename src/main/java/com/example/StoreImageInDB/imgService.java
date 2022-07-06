package com.example.StoreImageInDB;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class imgService {

	@Autowired
	private ImageRepo imgrepo;
	
	public Image storeimg(MultipartFile img) throws Exception {
		
		String fname=StringUtils.cleanPath(img.getOriginalFilename());
		try {
			Image im=new Image(fname, img.getContentType(), img.getBytes());
			return imgrepo.save(im);
			
		}
		catch (IOException e) {
			throw new Exception("Could not find file !!!");
		}
		
		
		
		
	}
}
