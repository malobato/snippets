package com.coderszone.snippets.decorator;


import java.util.logging.Logger;


public class WithMaximizeButton extends WindowDecorator {

	private static final Logger LOGGER = Logger.getLogger( WithMaximizeButton.class.getName() );

	private Window window;


	public WithMaximizeButton( Window window ) {

		this.window = window;
	}


	public String getTitle() {

		return window.getTitle() + " with maximize button";
	}


	public void maximize() {

		LOGGER.info( this.window.getTitle() + " with maximize button" );
	}
}
