public class Board {
        private Piece[][] board;

        public Board(){
            board = new Piece[8][8];
        }

        public void add(Piece p){

            if(board[p.getPosition().x][p.getPosition().y] != null){
                System.out.println("there is already a piece on this position");
            }

            else{
                if(p instanceof SlowPiece){
                    board[p.getPosition().x][p.getPosition().y] = p;
                }

                if(p instanceof FastPiece){
                    board[p.getPosition().x][p.getPosition().y] = p;
                }
            }

        }

        public void move(Piece p1, String direction, int step){
            if(p1 instanceof SlowPiece){
                ((SlowPiece) p1).move(direction);
                board[p1.getPosition().x][p1.getPosition().y] = p1;
            }

            if(p1 instanceof FastPiece){
                ((FastPiece) p1).move(direction,step);
                board[p1.getPosition().x][p1.getPosition().y] = p1;
            }

            if(p1 instanceof SlowFlexible){
                ((SlowFlexible) p1).move(direction);
                board[p1.getPosition().x][p1.getPosition().y] = p1;
            }

            if(p1 instanceof FastFlexible){
                ((FastFlexible) p1).move(direction,step);
                board[p1.getPosition().x][p1.getPosition().y] =p1;
            }
        }


}
