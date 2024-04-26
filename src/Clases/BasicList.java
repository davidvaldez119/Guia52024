package Clases;


import java.util.Stack;

public abstract  class BasicList extends List implements Reproduction{

	
	private Stack<Song> Mystack;
	
	
	public BasicList(String name, Stack<Song> mystack) {
		super(name);
		Mystack = mystack;
	}

	@Override
	public void Play() 
	{
		Stack <Song>aux=new Stack<Song>();
		
		if (!this.Mystack.isEmpty() )//me fijo si esta vacia 
		{ 
			while(!Mystack.isEmpty()) //recorro y reprodusco
			{
		        //Song s=this.Mystack.peek();
		        System.out.println("reproduciendo........");
		        System.out.println(Mystack.peek().toString()); //muestro lo que estoy reproduciendo
		        System.out.println(".........................");
		        aux.push(Mystack.pop());//una vez que termino de reproducir envio la cancion en aux
		     }
		   while(!aux.isEmpty())  //recorro aux 
		     {
			    Mystack.push(aux.pop());//lo paso a Mystack para no perder la pila
			   
		     }
		
		}else
		     {
			   System.out.println("no hay canciones en lista de reproduccion.....");
		     }
	}

	@Override
	public void addSong(Song s) {
		
		this.Mystack.add(s);
	}

	@Override
	public void removeSong(Song s) {
		
		System.out.println("adquir lista premium");
	}

	@Override
	public void SeaMyList() 
	{
		Stack <Song> aux= new Stack<Song>();
		while(Mystack.empty()== true)
		{
			Mystack.peek().toString();
			aux.push(Mystack.pop());
		}
		
		
	}
	

}
