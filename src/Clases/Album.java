package Clases;

public class Album {
	
	private Integer year;
	private String tytle;
	private Artist artist;
	

	

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album(Integer year, String tytle, Artist artist) {
		super();
		this.year = year;
		this.tytle = tytle;
		this.artist = artist;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getTytle() {
		return tytle;
	}

	public void setTytle(String tytle) {
		this.tytle = tytle;
	}

	@Override
	public String toString() {
		return "Album [year=" + year + ", tytle=" + tytle + ", artist=" + artist + "]";
	}

	
	
	

}
