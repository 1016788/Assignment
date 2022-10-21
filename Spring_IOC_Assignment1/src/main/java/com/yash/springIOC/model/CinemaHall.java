package com.yash.springIOC.model;

public class CinemaHall {
	
	private String cinemahallName;
	private Movie movie;
	public CinemaHall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CinemaHall(String cinemahallName, Movie movie) {
		super();
		this.cinemahallName = cinemahallName;
		this.movie = movie;
	}
	public String getCinemahallName() {
		return cinemahallName;
	}
	public void setCinemahallName(String cinemahallName) {
		this.cinemahallName = cinemahallName;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public void show() {
		

		System.out.format("CinemaHall:"+cinemahallName);
		System.out.println();
		System.out.format("Movie :-  ");
		System.out.println();
		movie.show();
	
	}
	

}