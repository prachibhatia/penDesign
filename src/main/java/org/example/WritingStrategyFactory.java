package org.example;

public class WritingStrategyFactory {
    public static WritingStrategy getWritingStrategy(PenType type){
        if(type==PenType.GEL_PEN){
            return new RoughWriting();
        }else if(type==PenType.BALL_PEN){
            return new SmoothWriting();
        }
        return new SmoothWriting();
    }
}
