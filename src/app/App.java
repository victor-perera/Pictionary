package app;

import gamestate.impl.CanvasState;
import sender.impl.UDPSender;
import sender.interfaces.Sender;

public class App {

    public static void main(String[] args) {
        //Receiver receiver = new UDPReceiver(2000);
        //receiver.receive();
        Sender<CanvasState> sender = new UDPSender<>(2000, "192.168.1.11");
        sender.send(new CanvasState());
    }
}
