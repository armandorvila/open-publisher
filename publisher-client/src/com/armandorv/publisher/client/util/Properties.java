package com.armandorv.publisher.client.util;

import java.util.ResourceBundle;

public class Properties {

	private static ResourceBundle bundle = ResourceBundle.getBundle("config");
	
	
	public static String getArticleEjbName(){
		return bundle.getString("ejb.articles.name");
	}
	
	public static String getAuthorsEjbName(){
		return bundle.getString("ejb.authors.name");
	}

}
