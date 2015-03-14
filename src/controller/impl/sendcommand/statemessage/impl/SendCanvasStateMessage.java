package controller.impl.sendcommand.statemessage.impl;

import model.manager.ManagerLobby;
import controller.impl.sendcommand.statemessage.interfaces.SendStateMessage;
import controller.impl.sendcommand.statemessagedata.impl.SendCanvasStateData;

public class SendCanvasStateMessage extends SendStateMessage {

    private SendCanvasStateData sendCanvasStateData;

    public SendCanvasStateMessage(SendCanvasStateData sendCanvasStateData) {
        super();
        this.sendCanvasStateData=sendCanvasStateData;
    }

    @Override
    public void open() {
        ManagerLobby.myLobby.getCanvas().setPencil(sendCanvasStateData.getPencil());
        if (sendCanvasStateData.isCleared())
            ManagerLobby.myLobby.getCanvas().clear();
        else
            ManagerLobby.myLobby.getCanvas().addAll(sendCanvasStateData.getPoints());
        ManagerLobby.myLobbyFrame.getCanvasPanel().refresh();
    }
}