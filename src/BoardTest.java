import java.util.ArrayList;


public class BoardTest {
	private final static String test = "123456789.1.2.3.4.5.6.7.8.99.8.7.6.5.4.3.2.1.123456789.........987654321.........";
	private final static String testCase1 = ".3529.864.8241.7.376438..9.218739.4....8.423..43.5297.4.6571..9359.284178..9..526";
	private final static String testCase2 = "..3.2.6..9..3.5..1..18.64....81.29..7.......8..67.82....26.95..8..2.3..9..5.1.3..";
	private final static String testCase3 = "3..2........1.7...7.6.3.3...7...9.8.9...2...4.1.8...5...9.4.3.1...7.2........8..6";
	private final static String failCase = "4....9..........7..5............................3.8241.......................6...";
	//failCase2 has no solution
	private final static String failCase2 = "...435..............8.....68...9.6..3.7.........2.1.....6........5....1........5.";
	private final static String fullBoard = "135297864982416753764385192218739645597864231643152978426571389359628417871943526";
	private final static String uniqueBoard = "136..4..9....3.8..9......6....6....2.8..7..3.3....5....9......1..1.9....4..3..2.7";

	public static void main (String[] args) {
		
		Board newBoard = new Board (test);
		//ABSolve solver = new ABSolve();
		Solver solver = new Solver();
		Board realTest;
		Board result;
		BoardGenerator newGame = new BoardGenerator(solver);
		/*
		newBoard.printToOut();
		System.out.println(newBoard.getOptions (1, 0));
		System.out.println(newBoard.getOptions (1, 8));
		System.out.println(newBoard.isLegal(1,  0,  6));
		System.out.println(newBoard.isLegal(1,  0,  7));
		
		newBoard.assign(0, 0, 9);
		newBoard.printToOut();
		
		System.out.println(newBoard.getOptions(8, 8));
		newBoard.removeOption(8, 8, 8);
		System.out.println(newBoard.getOptions(8, 8));
		newBoard.clearCell(0, 8);
		System.out.println(newBoard.getOptions(8, 8));
		System.out.println(newBoard.getOptions(0, 8));
		System.out.println(newBoard.toString());
		
		Board solvedBoard = solver.solve(newBoard);
		if (solvedBoard != null) {
			solvedBoard.printToOut();
		}
		*/
		/*
		newBoard = newGame.newGame(0);
		newBoard.printToOut();
		//GameInterface game = new GameInterface(newBoard);
		
		
		System.out.println("Sudoku Test Case 1");
		realTest = new Board(testCase1);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved first puzzle!");
		}
		
		System.out.println("Sudoku Test Case 2");
		realTest = new Board(testCase2);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved Second puzzle!");
		}
		
		System.out.println("Sudoku Test Case 3");
		realTest = new Board(testCase3);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved Third puzzle!");
		}
		
		System.out.println("Beginning failCase test");
		realTest = new Board(failCase);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved failCase puzzle!");
		} else {
			System.out.println("No Solution Found for failCase :( ");
		}
		
		System.out.println("Beginning failCase2 test");
		realTest = new Board(failCase2);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved failCase2 puzzle!");
		} else {
			System.out.println("No Solution Found for failCase2 :( ");
		}
		
		System.out.println("Beginning random game test");
		realTest = newGame.newGame(0);
		GamePlayer player = new GamePlayer();
		//GameInterface game = new GameInterface(player, realTest);
		//realTest.printToOut();
		result = solver.solve(realTest);
		if (result != null) {
			result.printToOut();
			System.out.println("Solved random puzzle!");
		} else {
			System.out.println("No Solution Found for randomGame :( ");
		}
		
		
		realTest = newGame.newGame(0);
		realTest.printToOut();
		result = solver.simpleSolve(realTest);
		result.printToOut();
		*/
		
		
//		realTest = new Board (testCase3);
//		realTest.printToOut();
//		solver.uniqueSolve(realTest);
//		
//		realTest = newGame.newGame(10);
//		realTest.printToOut();
//		result = solver.solve(new Board(uniqueBoard));
//		result.printToOut();
//		result = solver.uniqueSolve(new Board(uniqueBoard));
		

		ArrayList<Board> boards = new ArrayList<Board>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			realTest = newGame.newGame(1);
			boards.add(realTest);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		int cells = 0;
		for (Board board : boards) {
			for (int i = 0; i < 81; i++) {
				int row = i / 9;
				int col = i % 9;
				if (board.getCellValue(row, col) != 0) {
					cells++;
				}
			}
			board.printToOut();
		}
		System.out.println("Cells: " + cells);
		
//		System.out.println("Easy game");
//		realTest = newGame.newGame(BoardGenerator.EASY);
//		realTest.printToOut();
//		result = solver.solve(realTest);
//		result.printToOut();
//		System.out.println("Medium game");
//		realTest = newGame.newGame(BoardGenerator.MEDIUM);
//		realTest.printToOut();
//		result = solver.solve(realTest);
//		result.printToOut();
//		System.out.println("Hard game");
//		realTest = newGame.newGame(BoardGenerator.HARD);
//		realTest.printToOut();
//		GamePlayer player = new GamePlayer();
//		result = solver.solve(realTest);
//		result.printToOut();
	}
}
