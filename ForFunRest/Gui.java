package ForFunRest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Антон on 30.06.2017.
 */
public class Gui {
    Gui (){
        JFrame jfrm = new JFrame("Rest manager");
        jfrm.setSize(500,200);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Choose the variant");
        jfrm.setLayout(new FlowLayout());
        jfrm.setLocationRelativeTo(null);

        JButton choise_1 = new JButton("Book current date");
        JButton choise_2 = new JButton("Statist");
        choise_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        choise_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jlab.setFont(new Font("Tahoma", Font.BOLD, 14));

        //choise_1.addActionListener(()-> // add method );
        choise_2.addActionListener((ActionListener)-> {
            JFrame jfrmStat = new JFrame("Statistics");
            jfrmStat.setSize(500,200);
            jfrmStat.setLocationRelativeTo(null);
            jfrmStat.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jfrmStat.setLayout(new FlowLayout());


            String [] daysWeek = {"Day of the week", "Mark"};
            Object [][] data  = {
                    {"Monday", "*"},
                    {"Tuesday", ""},
                    {"Wednesday", ""},
                    {"Thursday", ""},
                    {"Friday", ""},
                    {"Saturday", ""},
                    {"Sunday", "*"}
            } ;
            JTable table = new JTable(data, daysWeek);
            table.setFont(new Font("Tahoma", Font.BOLD, 14));
            jfrmStat.add(table);

            jfrmStat.setVisible(true);
        }  );


        jfrm.add(jlab);
        jfrm.add(choise_1);
        jfrm.add(choise_2);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui();
            }
        });
    }
}


