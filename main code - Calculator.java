//Simple Calculator Project by Enyi Gloria 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
    //initialize button symbols
private String[] symbols = {
        "7", "8", "9", "+",
        "4", "5", "6", "/",
        "1", "2", "3", "*",
        ".", "0", "=", "-",
           "AC"
};
private int operator = 0;
//initialize GUI
private JPanel panel = new JPanel(new BorderLayout(5, 5));
private JPanel btnPanel = new JPanel(new GridLayout(5, 4, 2, 2));
private JButton[] btns = new JButton[17];
private JTextArea screen = new JTextArea(5, 20);
private double  firstNum = 0;
private double secondNum = 0;

//calculator method to call
public Calculator(){

    init();
}


    private void init() {

    screen.setFont(new Font("Times New Roman", Font.ITALIC, 24));
    setTitle("Calculator App by Gloria");
    screen.setBackground(Color.BLACK);
    panel.setBackground(Color.BLACK);
    btnPanel.setBackground(Color.BLACK);
    screen.setForeground(Color.WHITE);
    


    for(int i = 0; i < btns.length; i++){
        btns[i] = new JButton(symbols[i]);
        btns[i].setBorder(BorderFactory.createRaisedSoftBevelBorder());

        btns[i].setOpaque(false);
        btns[i].setBorderPainted(true);
        btns[i].setBackground(Color.BLACK);
        btns[i].setForeground(Color.WHITE);
        btns[i].addActionListener(this);
        btnPanel.add(btns[i]);
        }

        
    panel.add(btnPanel, BorderLayout.CENTER);
    panel.add(screen, BorderLayout.NORTH);
    add(panel);
    setSize(340, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }






//actions for each of the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand().toString();

    switch(command){
        case ".":
            if(!screen.getText().contains(".")){
                screen.setText(screen.getText() + ".");
            }
            break;

        case "0":
            screen.setText(screen.getText() + "0");
            break;

        case "1":
            screen.setText(screen.getText() + "1");
            break;

        case "2":
            screen.setText(screen.getText() + "2");
            break;

        case "3":
            screen.setText(screen.getText() + "3");
            break;

        case "4":
            screen.setText(screen.getText() + "4");
            break;

        case "5":
            screen.setText(screen.getText() + "5");
            break;

        case "6":
            screen.setText(screen.getText() + "6");
            break;

        case "7":
            screen.setText(screen.getText() + "7");
            break;

        case "8":
            screen.setText(screen.getText() + "8");
            break;

        case "9":
            screen.setText(screen.getText() + "9");
            break;

        case "+":
            if(!screen.getText().isEmpty()){

                firstNum = Double.parseDouble(screen.getText().toString());
                operator = 1;
                screen.setText("");
            }
            break;

        case "-":
            if(!screen.getText().isEmpty()){

                firstNum = Double.parseDouble(screen.getText().toString());
                operator = 2;
                screen.setText("");
            }
            break;

        case "*":
            if(!screen.getText().isEmpty()){

                firstNum = Double.parseDouble(screen.getText().toString());
                operator = 3;
                screen.setText("");
            }
            break;

        case "/":
            if(!screen.getText().isEmpty()){

                firstNum = Double.parseDouble(screen.getText().toString());
                operator = 4;
                screen.setText("");
            }
            break;


        case "AC":
            screen.setText("");
            break;

        default:
    }
//initialise the operator buttons
    if(command.equalsIgnoreCase("=")){
        if(!screen.getText().isEmpty()){
            secondNum = Double.parseDouble(screen.getText().toString());

            switch(operator){
                case 1:
                    screen.setText(String.valueOf((firstNum + secondNum)));
                    break;

                case 2:
                    screen.setText(String.valueOf((firstNum - secondNum)));
                    break;

                case 3:
                    screen.setText(String.valueOf((firstNum * secondNum)));
                    break;

                case 4:
                    screen.setText(String.valueOf((firstNum / secondNum)));
                    break;

                default:
            }
        }
    }
    }
}
//end of code
