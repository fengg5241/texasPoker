package edu.ntnu.texasai.controller;

import edu.ntnu.texasai.model.BettingDecision;
import edu.ntnu.texasai.model.BettingRound;
import edu.ntnu.texasai.model.GameHand;
import edu.ntnu.texasai.model.Player;
import edu.ntnu.texasai.model.cards.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerController {
    public BettingDecision decide(Player player, GameHand gameHand) {
        List<Card> cards = new ArrayList<Card>();
        cards.addAll(gameHand.getSharedCards());
        cards.addAll(player.getHoleCards());

        if (cards.size() == 2) {
            return decidePreFlop(player, gameHand, cards);
        } else {
            return decideAfterFlop(player, gameHand, cards);
        }
    }

    /**
     * 已下筹码是当前最大筹码 则跟注
     * @param gameHand
     * @param player
     * @return
     */
    protected boolean canCheck(GameHand gameHand, Player player) {
        BettingRound bettingRound = gameHand.getCurrentBettingRound();
        return bettingRound.getHighestBet() == bettingRound.getBetForPlayer(player);
    }

    /**
     * 两张牌
     * @param player
     * @param gameHand
     * @param cards
     * @return
     */
    protected abstract BettingDecision decidePreFlop(Player player,
                                                     GameHand gameHand, List<Card> cards);

    /**
     * 多张牌
     * @param player
     * @param gameHand
     * @param cards
     * @return
     */
    protected abstract BettingDecision decideAfterFlop(Player player,
                                                       GameHand gameHand, List<Card> cards);
}
