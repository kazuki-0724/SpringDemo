package com.example.servingwebcontent;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


/**
 * Session保管用のクラス
 * @author kazuk
 *
 */
@Component
@SessionScope
public class User implements Serializable{
	
	
	
	private static final long serialVersionID = 1L;
	private String theme;
	
	
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getTheme() {
		return this.theme;
	}

}
