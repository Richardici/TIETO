package com.topology.TIETO.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.topology.TIETO.dao.RouterDao;
import com.topology.TIETO.entity.Router;
@Controller
public class routerController {
	
	@Autowired 
	RouterDao dao;

	public void setDao(RouterDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/show", consumes = {"multipart/form-data"})
	public ModelAndView setMessage(@RequestParam("uploadedFile") MultipartFile file) throws Exception{
		File newFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(newFile);
		fos.write(file.getBytes());
		fos.close();
		newFile.createNewFile();
		String path = newFile.getCanonicalPath().replace("\\", "\\\\");
		Router[] router=dao.parseFile(Paths.get(path).toFile());
		newFile.delete();
		ModelAndView modelAndView = new ModelAndView("show");
		modelAndView.addObject("routers",router);
		return modelAndView;
		
	}
	

}
