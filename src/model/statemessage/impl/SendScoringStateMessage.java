package model.statemessage.impl;

import model.manager.ManagerLobby;
import model.player.Player;
import model.statemessage.interfaces.SendStateMessage;
import model.statemessagedata.impl.SendScoringStateData;
import view.ui.frame.impl.swing.LobbyFrame;

import java.awt.*;

public class SendScoringStateMessage extends SendStateMessage {

    private SendScoringStateData sendScoringStateData;

    public SendScoringStateMessage(SendScoringStateData sendScoringStateData) {
        super();
        this.sendScoringStateData = sendScoringStateData;
    }

    @Override
    public void open() {
        if (ManagerLobby.myLobbyFrame==null) {
            ManagerLobby.myLobbyFrame= new LobbyFrame();
            ManagerLobby.myPlayer = updatePlayer();
        }
        ManagerLobby.myLobby.setScoring(sendScoringStateData.getScoring());
        ManagerLobby.myLobbyFrame.getScoringPanel().refresh();
        ManagerLobby.myLobbyFrame.setVisible(true);
    }

    private Player updatePlayer() {
        for (Player player :  sendScoringStateData.getScoring().getPlayers()) {
            if (player.getName().equals(ManagerLobby.myPlayer.getName())) return player;
        }
        return null;
    }
}
