package edu.ntnu.texasai.model;

/**
 * 当前第几轮
 * @author Administrator
 *
 */
public enum BettingRoundName {
    /**
     * 其它
     */
    PRE_FLOP, 
    /**
     * 第二轮2
     */
    POST_FLOP, 
    /**
     * 
     * 第三轮3
     */
    POST_TURN, 
    /**
     * 
     * 第四轮4
     */
    POST_RIVER;

    public static BettingRoundName fromRoundNumber(int bettingRoundNumber) {
        switch (bettingRoundNumber) {
        case 2:
            return POST_FLOP;
        case 3:
            return POST_TURN;
        case 4:
            return POST_RIVER;
        default:
            return PRE_FLOP;
        }
    }
}
