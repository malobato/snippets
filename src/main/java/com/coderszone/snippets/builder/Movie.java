package com.coderszone.snippets.builder;


/**
 * Movie class using builder pattern
 * 
 * @author malobato
 */
public class Movie {

	private long id;
	private String title;
	private int year;
	private int runtime;

	public static class Builder {

		private final String title;
		private int year;
		private int runtime;


		public Builder( String title ) {

			this.title = title;
		}


		public Builder inYear( int year ) {

			this.year = year;

			return this;
		}


		public Builder withRuntime( int runtime ) {

			this.runtime = runtime;

			return this;
		}


		public Movie build() {

			Movie movie = new Movie();

			movie.title = this.title;
			movie.year = this.year;
			movie.runtime = this.runtime;

			return movie;
		}
	}


	private Movie() {
	}


	public long getId() {

		return id;
	}


	public void setId( long id ) {

		this.id = id;
	}


	public String getTitle() {

		return title;
	}


	public void setTitle( String title ) {

		this.title = title;
	}


	public int getYear() {

		return year;
	}


	public void setYear( int year ) {

		this.year = year;
	}


	public int getRuntime() {

		return runtime;
	}


	public void setRuntime( int runtime ) {

		this.runtime = runtime;
	}
}
