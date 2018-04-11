
public class Piece {
	
	String typeString;
	PieceType piece;
	
	public Piece (PieceType piece) {
		
		this.piece = piece;
		
	}
	
	@Override
	public String toString() {
		
		switch(piece) {
		case RED: typeString = "red";
		case BLACK: typeString = "black";
		case REDKING: typeString = "red king";
		case BLACKKING: typeString = "black king";
		}
		
		return typeString;
		
	}
	
}
