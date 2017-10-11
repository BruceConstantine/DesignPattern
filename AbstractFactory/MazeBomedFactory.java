//Parallel Inheritance Hierarchies Embodied in this file

//if this factory defined into Singleton , that is perfect, because generally there will be only one instance of factory.
public class MazeBomedFactory implements AbsFactory{
	MazeBomedFactory(){}
	
	//factory method	
	public Maze makeMaze(){
		return new Maze();
	}
	
	//factory method
	public Room makeRoom(int roomID){
		return new BomedRoom(roomID); 
	}
	
	//factory method
	public Door makeDoor(Room room1,Room room2){
		return new BomedDoor(room1, room2);
	}
	
	//factory method
	public Wall makeWall(){
		return new BomedWall();
	}
}

//declear new type of product
class BomedRoom extends Room{
	public BomedRoom(){}
	public BomedRoom(int id){
		super(id);
	}
}
//declear new type of product
class BomedWall extends Wall{
	public BomedWall(){
		super("BomedWall");
	}
	public BomedWall(String wallType){
		super(wallType);
	}
}
//declear new type of product
class BomedDoor extends Door{
	public BomedDoor(){}
	public BomedDoor(Room room1, Room room2) { 
		super(room1, room2);
	}
} 