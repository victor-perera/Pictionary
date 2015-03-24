package controller.impl.command.word;
import controller.interfaces.Command;
import model.manager.ManagerLobby;

public class ShowCodifiedWordCommand implements Command {
    @Override
    public void execute() {
        ManagerLobby.myLobbyFrame.getWordPanel().getWordDisplay().enableVisibility(false);
    }
}
