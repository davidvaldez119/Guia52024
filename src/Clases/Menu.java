package Clases;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Menu {
	
	private Stack<Song>song;
	private LinkedList <Song>Mylist;
	private Scanner Myscaner;
	
	public Menu(Stack<Song> song, LinkedList<Song> mylist, Scanner myscaner) {
		
		this.song = song;
		Mylist = mylist;
		Myscaner = myscaner;
	}
	public Scanner getMyscaner() {
		return Myscaner;
	}
	public void setMyscaner(Scanner myscaner) {
		Myscaner = myscaner;
	}
	public Stack<Song> getSong() {
		return song;
	}
	public void setSong(Stack<Song> song) {
		this.song = song;
	}
	public LinkedList<Song> getMylist() {
		return Mylist;
	}
	public void setMylist(LinkedList<Song> mylist) {
		Mylist = mylist;
	}
    public void menuSong() {
    	int rta;
    	System.out.println(".......................");
    	System.out.println("elegi la opcion 0 para volver al menu");
    	System.out.println("1 reproducir la lista de canciones");
    	System.out.println("2 ver la lista de canciones");
    	System.out.println("3 eliminar de la lista de canciones");
    	System.out.println("4 agregar a la lista de canciones");
    	
    	rta=this.Myscaner.nextInt();
    	if(!song.isEmpty()) {
    	switch(rta)
    	       {
    	case 1
    	
    	
    	
    	       }
    	
    }}
}
