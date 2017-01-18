package com.coderszone.snippets.decorator;


public abstract class Window {

	protected String title;


	public Window() {
	}


	public String getTitle() {

		return title;
	}


	public void setTitle( String title ) {

		this.title = title;
	}
}
