package controller.impl.command.player;

import controller.interfaces.Command;
import model.game.Lobby;
import view.ui.dialog.impl.swing.KickPlayerDialog;

public class KickPlayerCommand implements Command{

    private Lobby lobby;

    public KickPlayerCommand(Lobby lobby) {
        this.lobby = lobby;
    }

    @Override
    public void execute() {
        new KickPlayerDialog(lobby);
    }
}