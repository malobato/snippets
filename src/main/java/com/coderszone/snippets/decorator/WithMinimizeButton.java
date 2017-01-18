package com.coderszone.snippets.decorator;


import java.util.logging.Logger;


public class WithMinimizeButton extends WindowDecorator {

	private static final Logger LOGGER = Logger.getLogger( WithMinimizeButton.class.getName() );

	private Window window;


	public WithMinimizeButton( Window window ) {

		this.window = window;
	}


	public String getTitle() {

		return window.getTitle() + " with minimize button";
	}


	public void minimize() {

		LOGGER.info( window.getTitle() + " with minimize button" );
	}

}
