package view.ui.display.impl.swing.scoringdisplay;

import model.manager.ManagerLobby;
import model.player.Player;

import javax.swing.*;
import java.awt.*;

public class ScoringDisplay extends JPanel implements view.ui.display.interfaces.scoringdisplay.ScoringDisplay {

    private JLabel playername;
    private Player player;

    public ScoringDisplay(Player player) {
        super();
        setBorder(BorderFactory.createTitledBorder("Scoring Display"));
        this.player=player;
        createWidgets();
    }

    private void createWidgets() {
        add(createPlayerName());
    }

    private Component createPlayerName() {
        playername = new JLabel(player.getName()+","+ ManagerLobby.myLobby.getScoring().getScore(player).getScore());
        return playername;
    }

}