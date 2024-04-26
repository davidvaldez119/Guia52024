package Clases;

import java.util.LinkedList;

import java.util.Scanner;


public class ListaPremium extends List implements Reproduction
{
	
	
	private LinkedList<Song> MyLinked;


	public ListaPremium(String name, LinkedList<Song> myLinked) {
		super(name);
		MyLinked = myLinked;
	}

	public LinkedList<Song> getMyLinked() {
		return MyLinked;
	}

	public void setMyLinked(LinkedList<Song> myLinked) {
		MyLinked = myLinked;
	}



	@Override
	public void Play() 
	{  System.out.println("Ingrese la cancion a reproducir");
	   
	   Scanner sc =new Scanner(System.in);
	   String songName= sc.nextLine();
	for(Song song :MyLinked)
		{
			if(songName.equals(song.getName())) 
			{
			System.out.println("....reproduciendo......");
			song.toString();
			System.out.println(".......................");
		    }
		}
		
	}

	@Override
	public void addSong(Song s) {
		this.MyLinked.add(0, s);
		
	}

	@Override
	public void removeSong(Song s) {
		MyLinked.removeFirst();
		
	}

	@Override
	public void SeaMyList() {
		for(Song list :MyLinked) {
			list.toString();
			
		}
		
	}
	
	

}
