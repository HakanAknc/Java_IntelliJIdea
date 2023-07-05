import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1_ornek extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel1;

    public form1_ornek(){
        add(panel1);
        setSize(400,200);
        setTitle("İlk Arayüz Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad,soyad;
                ad = textField1.getText();
                soyad = textField2.getText();
                System.out.println(ad + " " + soyad);
            }
        });
    }
}
