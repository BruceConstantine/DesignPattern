public class DesignPatternTest_AbsFactory{
	
	public static void main(String []args){
		AbsFactory factory = new MazeBomedFactory(); 	// you can change the Factory Type for changing the product farmily! Very easyly.
														//AbsFactory factory = new MazeNormalFactory();
		MazeGame game = new MazeGame();
		Maze _maze_ = game.createMaze(factory);
		game.play(_maze_);
	}
	
}

