/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.struts.example;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Upload extends ActionSupport {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File[] upload;
    private String[] uploadFileName;
    private String[] uploadContentType;
    

    public String execute() throws Exception {
    	
    	ServletContext sc = ServletActionContext.getServletContext();
    	   String storePath = sc.getRealPath("/files");
    	   System.err.println("storePath->" + storePath);
    	   File destDir = new File(storePath);
    	   if(destDir.exists()){
    		   destDir.createNewFile();
    	   }
    	   if(upload != null && upload.length > 0){
    		   for(int i=0; i<upload.length; i++){
        		   FileUtils.copyFile(upload[0], new File(destDir,uploadFileName[i]));
        	   }
    	   }
    	  
    	   
        return INPUT;
    }

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
}
