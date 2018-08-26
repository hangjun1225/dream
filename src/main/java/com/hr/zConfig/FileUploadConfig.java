package com.hr.zConfig;

import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 文件上传配置
 * @author hangjun
 *
 */
@Configuration
public class FileUploadConfig {
	@Value("${file.uploadMaxFileSize:40MB}")
	private String uploadMaxFileSize;
	@Value("${file.uploadMaxRequestSize:100MB}")
	private String uploadMaxRequestSize;
	  /**  
     * 文件上传配置  
     * @return  
     */  
    @Bean  
    public MultipartConfigElement multipartConfigElement() {  
        MultipartConfigFactory factory = new MultipartConfigFactory();  
        //单个文件最大  
//        factory.setMaxFileSize("10240KB"); //KB,MB  
        factory.setMaxFileSize(uploadMaxFileSize); //KB,MB  
        /// 设置总上传数据总大小  
        factory.setMaxRequestSize(uploadMaxRequestSize);  
        return factory.createMultipartConfig();  
    } 
}
