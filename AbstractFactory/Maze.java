//declear factory product this file
import java.util.*;

//product Door Interface (Although it is not decleared as an interface)
class Door implements FactoryProduct{
	
	private Room room1;
	private Room room2;
	
	public Door() { } 
	public Door(Room room1, Room room2) { 
		this.room1 = room1;
		this.room2 = room2;
	}
	 
}

//product Wall Interface
class Wall implements FactoryProduct{
	
	private String wallType;
	
	public Wall() { 
		wallType = "normal";
	} 
	public Wall(String wallType) {
		this.wallType = wallType;
	}
	 
}

//product Room Interface
class Room implements FactoryProduct{
	
	private int roomID;
	
	private FactoryProduct north;
	private FactoryProduct east;
	private FactoryProduct south;
	private FactoryProduct west;
	 
	public Room() { } 
	public Room(int roomID) { 
		this.roomID = roomID;
	} 
	
	public void setSide(int direction , FactoryProduct mazeElement){
		switch( direction ) {
			case 1 : 
				north = mazeElement;
				break;
			case 2 : 
				east = mazeElement;
				break;
			case 3 : 
				south = mazeElement;
				break;
			case 4 : 
				west = mazeElement;
				break;				
			default:
				break;	
		}
	}
}

//tag interface-> is the empty interface (Attention: this part is not belonging to Abstract Factory)
//Example: Serializable, EventListener ...
interface FactoryProduct { }
//If a class that will going to execute some uncertained funtion in the futher, one of the best way to do is set it implemented by a tag interface. Like Serializable


//---------------The Below Are Business Logic Code -------------------
public class Maze {
	
	ArrayList<FactoryProduct> map;
	
	public Maze() { 
		map = new ArrayList<FactoryProduct>();
	}
	
	public void add(FactoryProduct mazeElement){
		this.map.add(mazeElement);
	}
	
	public void displayAllElements() {
		Iterator it = map.iterator();
		while(it.hasNext()) {
			Object ele = it.next();
			String packageName = ele.getClass().getName();
			String className = ele.getClass().getSimpleName();
			System.out.println("packageName: " + packageName);
			System.out.println("className: " + className /*+"\n" */);
			System.out.println("SuperClass: " + ele.getClass().getSuperclass()+"\n");
		}
	}
}
