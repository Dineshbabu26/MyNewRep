package com.example.StoreImageInDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ImgController {
	
	@Autowired
	imgService imgser;
	
	@PostMapping("uploadimage")
	public Response uploadimg(@RequestParam("img") MultipartFile img) throws Exception {
	
		
		Image fn=imgser.storeimg(img);
		String filedownloaduri=ServletUriComponentsBuilder.fromCurrentContextPath()
				.path("/downloadFile/")
				.path(fn.getImgname())
				.toUriString();
		
		return new Response(fn.getImgname(), filedownloaduri,img.getContentType(), img.getSize());
	}

}
