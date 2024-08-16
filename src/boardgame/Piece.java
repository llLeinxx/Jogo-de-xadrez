package boardgame;

public class Piece {
    protected Position position;
    private Board board;



    protected Piece(Board board) {
        this.board = board;
        position = null;
    }
    public Board getBoard() {
        return board;
    }
}
