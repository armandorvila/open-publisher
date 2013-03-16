package com.armandorv.publisher.application.helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class FileHelper {

	private static Logger log = Logger.getLogger(FileHelper.class);
	private String baseFilePath;
	private String baseFileUrl;

	public boolean saveFile(String fileName, File newFile) throws IOException {
		try {
			String tempFileContainerPath = getBaseFilePath();
			File file = new File(tempFileContainerPath + File.separator
					+ fileName);
			file.createNewFile();
			FileUtils.writeByteArrayToFile(file,
					FileUtils.readFileToByteArray(newFile));
			return true;
		} catch (IOException e) {
			log.error("");
			return false;
		}
	}

	public void setBaseFileUrl(String baseFileUrl) {
		this.baseFileUrl = baseFileUrl;
	}

	public String getBaseFileUrl() {
		return baseFileUrl;
	}

	public void setBaseFilePath(String baseFilePath) {
		this.baseFilePath = baseFilePath;
	}

	private String getBaseFilePath() {
		return baseFilePath;
	}

}
