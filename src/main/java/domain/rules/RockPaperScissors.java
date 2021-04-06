package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
	
    @Override
    public Result decide(Move mine, Move theirs) {
    	
        if (mine.equals(theirs)){
             return Result.DRAW;
         }
    	
        switch (mine) {
            case ROCK:
            	 return choose(theirs.equals(Move.SCISSORS));
              
            case SCISSORS:
            	 return choose(theirs.equals(Move.PAPER));

            case PAPER:
            	  return choose(theirs.equals(Move.ROCK));
                }
		return null;
            
      
    }
    
    public Result choose(boolean choose) {
    	
    	Result result = choose? Result.WIN:Result.LOSE;
    	return result;
       
    }
}
