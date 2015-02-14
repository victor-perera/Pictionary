package view.ui.dialog.impl.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CanvasDialog extends JPanel implements view.ui.dialog.interfaces.CanvasDialog {

    private static final int WIDTH=600, HEIGHT=100;

    public CanvasDialog() {
        super();
        setBorder(BorderFactory.createTitledBorder("Canvas Options"));
        createWidgets();
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(WIDTH,HEIGHT);
    }

    private void createWidgets() {
        add(createClearButton());
    }

    private Component createClearButton() {
        return new JButton("CLEAR") {
            {
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
        };
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Point getPoint() {
        return null;
    }

    @Override
    public boolean getClearOption() {
        return false;
    }

    @Override
    public Color getColor() {
        return null;
    }
}