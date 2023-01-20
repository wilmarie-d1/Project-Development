package BankSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AccountFrame extends JFrame {
    JLabel accnNoLBL, ownerLBL, balanceLBL,
            cityLBL, genderLBL, amountLBL;
    JTextField accNoTXT, ownerTXT, balanceTXT, amountTXT;
    JComboBox<City> citiesCMB;

    JButton newBTN, saveBTN, showBTN, quitBTN, depositBTN, withdrawBTN;
    JRadioButton maleRDB, femaleRDB;
    ButtonGroup genderBTNGRP;

    JList<Account> accountsLST;
    JPanel p1, p2, p3, p4, p5;

    Set<Account> accountSet = new TreeSet<>();
    Account acc, x;
    boolean newRec = true;

        //Combobox Date
    DefaultComboBoxModel<City> citiesCMBMDL;
    DefaultListModel<Account> accountsLSTMDL;

    //Table Data
    JTable table;
    DefaultTableModel tableModel;
    ArrayList<Transaction> translist = new ArrayList<>();

    public AccountFrame(){
        super("Account Operations");
        setLayout(null);
        setSize(600, 400);

        //Adding components to the Frame
        accnNoLBL = new JLabel("Account No.");
        ownerLBL = new JLabel("Owner");
        balanceLBL = new JLabel("balance");

    }

    public static void main(String[] args) {
        AccountFrame af = new AccountFrame();
        af.setVisible(true);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
