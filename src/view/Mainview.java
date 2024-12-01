package view;

import javax.swing.*;
import java.awt.*;

public class Mainview extends JFrame {
    public Mainview() {
        super("Biblioteca");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //BUTTONS:
        JButton userButton = new JButton("Usuário");
        userButton.setBounds(getScreenMiddleX(screenSize.width), 100, 150, 25);
        JButton adminButton = new JButton("Administrador");
        adminButton.setBounds(getScreenMiddleX(screenSize.width), 325, 150, 25);

        JPanel Panel = new JPanel();

        Panel.setSize(300, 300);
        Panel.setLayout(new GridBagLayout());
        Panel.add(userButton);
        Panel.add(adminButton);

        this.add(Panel);
    }

    private int getScreenMiddleX(int screenSize) {
        return (screenSize - 150) / 2;
    }

    public static void view() {
        Mainview window = new Mainview();
        window.setVisible(true);
    }
}
