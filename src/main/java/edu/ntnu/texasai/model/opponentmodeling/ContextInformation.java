package edu.ntnu.texasai.model.opponentmodeling;

/**
 * 下注类型
 * @author Administrator
 *
 */
public class ContextInformation {
    private final ContextAction contextAction;
    private final double handStrength;

    public ContextInformation(ContextAction contextAction, double handStrength) {
        this.contextAction = contextAction;
        this.handStrength = handStrength;
    }

    public ContextAction getContextAction() {
        return contextAction;
    }

    public double getHandStrength() {
        return handStrength;
    }
}
