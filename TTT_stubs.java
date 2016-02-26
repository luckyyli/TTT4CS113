import java.util.*; 

class TTT_stubs{

   public static void main(String argv[]){
   
   // set up, board, display board, symbol and gameState (ongoing, tie, win)
      char []playBoard = {'#','#','#','#','#','#','#','#','#'};
      char[][] displayBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'}, 
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'}, 
                              {' ','|',' ','|',' '}};
   
      char symbol = 'X';
      int gameState = 0; 
      while(gameState ==0){
      // 0: continue (game not over)
      // 1: tie
      // 2: last player who made a move won
      
      // take turn
         int choice = makeChoice(playBoard,symbol); 
      
      //update boards
         playBoard[choice] = symbol; 
         updateBoard(displayBoard,choice, symbol);
      
      // game state 0: ongoing 1: tie 2: win
         gameState = getGameState(playBoard); 
      
      // display 
         display(displayBoard);
         symbol = togglePlayer(symbol);
      }//while
      
     // rewind to previous player, who won
      reportResults(gameState, togglePlayer(symbol)); 
   }// main

   static void reportResults(int state, char player){
        
   }

   static char togglePlayer(char s){
      return('Z');
   }
   static int getGameState(char [] b){

     int gameState = 0;
     
     char s = 'X';
     int i = 0;
     
     while (i<2){//tests if won
         //across
         if ((b[0]==s && b[1]==s && b[2]==s)||
            (b[3]==s && b[4]==s && b[5]==s)||
            (b[6]==s && b[7]==s && b[8]==s)||
           //down 
            (b[0]==s && b[3]==s && b[6]==s)||
            (b[1]==s && b[4]==s && b[7]==s)||
            (b[2]==s && b[5]==s && b[8]==s)||
            //diagonal
            (b[0]==s && b[4]==s && b[8]==s)||
            (b[2]==s && b[4]==s && b[6]==s)){
            
            gameState = 2;
            }
            
         s = 'O';
         i++;
     }
     //tests if tie
     i = 0;
     for (i=0;i<b.length;i++){
         if (b[i]=='#')
            gameState = 0;
         else 
            gameState = 1;
     
     }
     
     return(gameState);  
   }


   static char[][] updateBoard(char [][] db, int ch, char sym){
      return (db);
   }
   
   static void display(char [][]b){                  
   }
   
   static int makeChoice(char []b, char s){
      return(0);
   } //make choice
   
}// TTT
