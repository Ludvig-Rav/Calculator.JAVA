import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
   JFrame frame = new JFrame();

   private JTextArea textScreen = new JTextArea();
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 550;

   private JTextField textField = new JTextField(20);
   private JLabel textLabel = new JLabel();

   // Calculations variables
   String strNum1 = "";
   String strNum2 = "";

   String[] statement;

   int num1 = 0;
   int num2 = 0;

   String strTotal;
   int totalVal = 0;

   // NumButtons
   JButton oneButton = new JButton("1");
   JButton twoButton = new JButton("2");
   JButton threeButton = new JButton("3");
   JButton fourButton = new JButton("4");
   JButton fiveButton = new JButton("5");
   JButton sixButton = new JButton("6");
   JButton sevenButton = new JButton("7");
   JButton eightButton = new JButton("8");
   JButton nineButton = new JButton("9");
   JButton zeroButton = new JButton("0");

   JButton cButton = new JButton("C");
   JButton plusButton = new JButton("+");
   JButton minusButton = new JButton("-");
   JButton equalsButton = new JButton("=");

   JButton button = new JButton();

   public Calculator()
   {
      // Set attributes
      setLocation(200, 500);
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setVisible(true);
      setLayout(null);
      setResizable(false);

      // Set txtScreen attributes
      textScreen.setSize(380, 100);
      textScreen.setLocation(7, 5);
      textScreen.setEditable(false);

      // Add objects to screen
      add(textScreen);
      add(oneButton);
      add(twoButton);
      add(threeButton);
      add(fourButton);
      add(fiveButton);
      add(sixButton);
      add(sevenButton);
      add(eightButton);
      add(nineButton);
      add(zeroButton);
      add(equalsButton);
      add(cButton);
      add(minusButton);
      add(plusButton);

      CreateComponents();
   }

   private void CreateComponents()
   {
      JLabel headerLabel = new JLabel("Calculator ver.9.4");
      JPanel panel = new JPanel();

      // Botton No
      zeroButton.setSize(90, 50);
      zeroButton.setLocation(110, 460);
      zeroButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("0");
         }
      });

      oneButton.setSize(90, 50);
      oneButton.setLocation(10, 395);
      oneButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("1");
         }
      });

      twoButton.setSize(90, 50);
      twoButton.setLocation(110, 395);
      twoButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("2");
         }
      });

      threeButton.setSize(90, 50);
      threeButton.setLocation(210, 395);
      threeButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("3");
         }
      });

      fourButton.setSize(90, 50);
      fourButton.setLocation(10, 325);
      fourButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("4");
         }
      });

      fiveButton.setSize(90, 50);
      fiveButton.setLocation(110, 325);
      fiveButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("5");
         }
      });

      sixButton.setSize(90, 50);
      sixButton.setLocation(210, 325);
      sixButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("6");
         }
      });

      sevenButton.setSize(90, 50);
      sevenButton.setLocation(10, 255);
      sevenButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("7");
         }
      });

      eightButton.setSize(90, 50);
      eightButton.setLocation(110, 255);
      eightButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("8");
         }
      });

      nineButton.setSize(90, 50);
      nineButton.setLocation(210, 255);
      nineButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("9");
         }
      });

      minusButton.setSize(70, 50);
      minusButton.setLocation(310, 255);
      minusButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("-");
         }
      });

      plusButton.setSize(70, 50);
      plusButton.setLocation(310, 325);
      plusButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            textScreen.append("+");
         }
      });

      cButton.setSize(70, 50);
      cButton.setLocation(310, 460);
      cButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            if (textScreen.getText().contains("C"))
            {
               textScreen.setText(null);
            }

         }
      });

      equalsButton.setSize(70, 50);
      equalsButton.setLocation(310, 395);
      equalsButton.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            if (textScreen.getText().contains("+"))
            {
               statement = textScreen.getText().split("\\+");

               strNum1 = statement[0];
               strNum2 = statement[1];

               num1 = Integer.parseInt(strNum1);
               num2 = Integer.parseInt(strNum2);

               totalVal = num1 + num2;

               strTotal = Integer.toString(totalVal);

               textScreen.setText(strTotal);
            } else if (textScreen.getText().contains("-"))
            {
               statement = textScreen.getText().split("\\-");

               strNum1 = statement[0];
               strNum2 = statement[1];

               num1 = Integer.parseInt(strNum1);
               num2 = Integer.parseInt(strNum2);

               totalVal = num1 - num2;

               strTotal = Integer.toString(totalVal);

               textScreen.setText(strTotal);
            }
         }
      });
   }

   public static void main(String[] args)
   {
      new Calculator();
      JFrame frame = new Calculator();
      frame.setTitle("Kalkulator");

      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

}
