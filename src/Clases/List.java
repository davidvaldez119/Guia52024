package Clases;

public  abstract class List {
	
	String name;

	public List(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "List [name=" + name + "]";
	}

}
