public interface AbsFactory{
	//Abstract factory define all factory method
	Maze makeMaze();
	Room makeRoom(int roomID);
	Door makeDoor(Room room1,Room room2);
	Wall makeWall();
}

//if this factory defined into Singleton , that is perfect, because generally there will be only one instance of factory.
class MazeNormalFactory implements AbsFactory{
	
	MazeNormalFactory(){}
	//factory method	
	public Maze makeMaze(){
		return new Maze();
	}
	//factory method
	public Room makeRoom(int roomID){
		return new Room(roomID); 
	}
	//factory method
	public Door makeDoor(Room room1,Room room2){
		return new Door(room1, room2);
	}
	//factory method
	public Wall makeWall(){
		return new Wall();
	}
}

//---------------The Below Are Business Logic Code -------------------
class MazeGame{
	
	private Maze myMaze;
	
	public MazeGame(){}
	
	public Maze createMaze(AbsFactory mazeFactory){
		Maze maze_ = mazeFactory.makeMaze();
		Wall wall = mazeFactory.makeWall();
		Room r1 = mazeFactory.makeRoom(1);
		Room r2 = mazeFactory.makeRoom(2);
		Door door = mazeFactory.makeDoor(r1,r2);
		maze_.add(r1);
		maze_.add(r2);
		 
		r1.setSide(1, wall);
		r1.setSide(2, wall);
		r1.setSide(3, wall);
		r1.setSide(4, door);
		r2.setSide(1, door);
		r2.setSide(2, wall);
		r2.setSide(3, wall);
		r2.setSide(4, wall);
		
		myMaze = maze_;
		return myMaze;
	}
	
	public void play(Maze maze_in){
		maze_in.displayAllElements();
	}
}
