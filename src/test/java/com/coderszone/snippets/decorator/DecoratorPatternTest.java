package com.coderszone.snippets.decorator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DecoratorPatternTest {

	@Test
	public void decoratorPatternTest() {

		Window window = new WithMaximizeButton( new ModalWindow( "Test" ) );

		assertEquals( window.getTitle(), "Test with maximize button" );
	}
}
