package edu.ntnu.texasai.model.opponentmodeling;

public enum ContextPlayers {
    /**
     * 人少< 3
     */
    FEW,
    /**
     * 人多
     */
    MANY;

    public static ContextPlayers valueFor(int numberOfPlayersRemaining) {
        if (numberOfPlayersRemaining < 3) {
            return FEW;
        } else {
            return MANY;
        }
    }
}
