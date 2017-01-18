package com.coderszone.snippets.builder;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderszone.snippets.builder.Movie;


public class MovieTest {

	@Test
	public void movieInstanceTest() {

		Movie movie = new Movie.Builder( "Underworld: blood wars" ).inYear( 2016 ).withRuntime( 191 ).build();

		assertEquals( movie.getTitle(), "Underworld: blood wars" );
		assertEquals( movie.getYear(), 2016 );
		assertEquals( movie.getRuntime(), 191 );
	}
}
