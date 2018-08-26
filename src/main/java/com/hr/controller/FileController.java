package com.hr.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
@Controller
public class FileController {
	
	@Value("${file.uploadPath}")
	private String uploadPath;
	
	@Value("${file.downloadPath}")
	private String downloadPath;
	
	/*
	 * 获取file.html页面
	 */
	@RequestMapping("file")
	public String file() {
		return "/file";
	}

	/**
	 * 实现文件上传
	 */
	@RequestMapping("fileUpload")
	@ResponseBody
	public String fileUpload(@RequestParam("fileName") MultipartFile file) {
		if (file.isEmpty()) {
			return "false";
		}
		String fileName = file.getOriginalFilename();
		int size = (int) file.getSize();
		System.out.println(fileName + "-->" + size);

		String path = uploadPath;
		File filePathDir=new File(path);
		//如果目录不存在,创建目录
		if(!filePathDir.exists()) {
			filePathDir.mkdirs();
		}
		File dest = new File(path + File.separator + fileName);
//		if(!dest.exists()) {
//			try {
//				dest.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		try {
			file.transferTo(dest); // 保存文件
			return "true";
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "false";
		} catch (IOException e) {
			e.printStackTrace();
			return "false";
		}
	}

	/*
	 * 获取multifile.html页面
	*/
	@RequestMapping("multifile")
	public String multifile() {
		return "/multifile";
	}

	/**
	 * 实现多文件上传
	 */
	/**public @ResponseBody String multifileUpload(@RequestParam("fileName")List<MultipartFile> files) */
	@RequestMapping(value="multifileUpload",method=RequestMethod.POST) 
    public @ResponseBody String multifileUpload(HttpServletRequest request){
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("fileName");
        
        if(files.isEmpty()){
            return "false";
        }

        String path = uploadPath ;
        
        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName + "-->" + size);
            if(file.isEmpty()){
                return "false";
            }else{        
            	File filePathDir=new File(path);
        		//如果目录不存在,创建目录
        		if(!filePathDir.exists()) {
        			filePathDir.mkdirs();
        		}
                File dest = new File(path + "/" + fileName);
                try {
                    file.transferTo(dest);
                }catch (Exception e) {
                    e.printStackTrace();
                    return "false";
                } 
            }
        }
        return "true";
    }
	
	
	
	@RequestMapping("download")
    public String downLoad(HttpServletResponse response){
        String filename="a.txt";
        String filePath = "E://" ;
        File file = new File(filePath + "/" + filename);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" + filename);
            
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;
            
            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file); 
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("----------file download" + filename);
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
	
	
	
}
