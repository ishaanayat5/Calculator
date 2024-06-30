
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.Color;


public class calculator extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfresult;
    private double number1;
    private String operator = "";
    private boolean isOperatorClicked = false;
    private JButton[] buttons;
    private JRadioButton rbON;
    private JRadioButton rbOFF;
    private JButton btnCLEAR, btnDEL, btndivide, btnunderroot, btnSquare, btnInverse, tnsub, btnmultiply, btnsum, btnequal;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfresult = new JTextField();
		tfresult.setBounds(10, 31, 363, 32);
		contentPane.add(tfresult);
		tfresult.setColumns(10);
		
		JRadioButton rbON = new JRadioButton("on");
		rbON.setBackground(new Color(255, 255, 128));
		rbON.setBounds(20, 70, 42, 23);
		contentPane.add(rbON);
		
		JRadioButton rbOFF = new JRadioButton("off");
		rbOFF.setBackground(new Color(255, 255, 128));
		rbOFF.setBounds(20, 96, 42, 23);
		contentPane.add(rbOFF);
		
		
		ButtonGroup group = new ButtonGroup();
        group.add(rbON);
        group.add(rbOFF);
		
		
		JButton btnCLEAR = new JButton("C");
		btnCLEAR.setBackground(new Color(255, 0, 0));
		btnCLEAR.setBounds(108, 85, 89, 23);
		contentPane.add(btnCLEAR);
		
		JButton btnDEL = new JButton("DEL");
		btnDEL.setBackground(new Color(255, 0, 0));
		btnDEL.setBounds(207, 85, 89, 23);
		contentPane.add(btnDEL);
		
		JButton btndivide = new JButton("/");
		btndivide.setBackground(new Color(0, 255, 0));
		btndivide.setBounds(306, 85, 67, 23);
		contentPane.add(btndivide);
		
		JButton btnunderroot = new JButton("√");
		btnunderroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnunderroot.setBackground(new Color(0, 255, 0));
		btnunderroot.setBounds(10, 126, 89, 23);
		contentPane.add(btnunderroot);
		
		JButton btnSquare = new JButton("x²");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSquare.setBackground(new Color(0, 255, 0));
		btnSquare.setBounds(109, 126, 89, 23);
		contentPane.add(btnSquare);
		
		JButton btnInverse = new JButton("1/x");
		btnInverse.setBackground(new Color(0, 255, 0));
		btnInverse.setBounds(207, 126, 89, 23);
		contentPane.add(btnInverse);
		
		JButton tnsub = new JButton("-");
		tnsub.setBackground(new Color(0, 255, 0));
		tnsub.setBounds(306, 126, 67, 23);
		contentPane.add(tnsub);
		
		JButton btnmultiply = new JButton("x");
		btnmultiply.setBackground(new Color(0, 255, 0));
		btnmultiply.setBounds(306, 160, 67, 23);
		contentPane.add(btnmultiply);
		
		JButton btnsum = new JButton("+");
		btnsum.setBackground(new Color(0, 255, 0));
		btnsum.setBounds(306, 194, 67, 23);
		contentPane.add(btnsum);
		
		JButton btnequal = new JButton("=");
		btnequal.setBackground(new Color(0, 255, 0));
		btnequal.setBounds(306, 228, 67, 57);
		contentPane.add(btnequal);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(0, 0, 64));
		btn9.setBounds(10, 160, 89, 23);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(0, 0, 64));
		btn8.setBounds(109, 160, 89, 23);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(0, 0, 64));
		btn7.setBounds(207, 160, 89, 23);
		contentPane.add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(0, 0, 64));
		btn6.setBounds(10, 194, 89, 23);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(0, 0, 64));
		btn5.setBounds(109, 194, 89, 23);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(0, 0, 64));
		btn4.setBounds(207, 194, 89, 23);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(0, 0, 64));
		btn3.setBounds(10, 228, 89, 23);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(0, 0, 64));
		btn2.setBounds(109, 228, 89, 23);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(0, 0, 64));
		btn1.setBounds(207, 228, 89, 23);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(0, 0, 64));
		btn0.setBounds(10, 262, 190, 23);
		contentPane.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setForeground(new Color(255, 255, 255));
		btndot.setBackground(new Color(0, 0, 64));
		btndot.setBounds(207, 262, 89, 23);
		contentPane.add(btndot);
		
		
		buttons = new JButton[] {
	            btnCLEAR, btnDEL, btndivide, btnunderroot, btnSquare, btnInverse,
	            tnsub, btnmultiply, btnsum, btnequal, btn9, btn8, btn7, btn6,
	            btn5, btn4, btn3, btn2, btn1, btn0, btndot
	        };
		
		
		
		
		
		
		
		
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "2");
            }
        });
        
        
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "3");
            }
        });
        
        
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "4");
            }
        });
        
        
        
        
        
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "5");
            }
        });
        
        
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "6");
            }
        });
        
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "7");
            }
        });
        
        
        
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "8");
            }
        });
        
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "9");
            }
        });
        

        btnsum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleOperatorClicked("+");
            }
        });

        tnsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleOperatorClicked("-");
            }
        });

        btnmultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleOperatorClicked("*");
            }
        });

        btndivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleOperatorClicked("/");
            }
        });

        btnequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleEqualClicked();
            }
        });

        btnCLEAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfresult.setText("");
                number1 = 0;
                operator = "";
                isOperatorClicked = false;
            }
        });

        btnDEL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = tfresult.getText();
                if (!text.isEmpty()) {
                    tfresult.setText(text.substring(0, text.length() - 1));
                }
            }
        });

        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                if (!tfresult.getText().contains(".")) {
                    tfresult.setText(tfresult.getText() + ".");
                }
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + "0");
            }
        });
        
        
        
        
        
        
        
        
        btnunderroot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(tfresult.getText());
                    if (num < 0) {
                        JOptionPane.showMessageDialog(null, "Cannot calculate square root of a negative number.", "Error", JOptionPane.ERROR_MESSAGE);
                        tfresult.setText(""); // Clear display on error
                    } else {
                        double result = Math.sqrt(num);
                        tfresult.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                    tfresult.setText(""); // Clear display on error
                }
            }
        });
        
        
        btnSquare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(tfresult.getText());
                    double result = num * num;
                    tfresult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                    tfresult.setText(""); // Clear display on error
                }
            }
        });
        
        
        btnInverse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(tfresult.getText());
                    if (num == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
                        tfresult.setText(""); // Clear display on error
                    } else {
                        double result = 1 / num;
                        tfresult.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                    tfresult.setText(""); // Clear display on error
                }
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        rbON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enableButtons(true);
            }

			
        });

        rbOFF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enableButtons(false);
            }
        });

        // Initially disable all buttons (OFF state)
        enableButtons(false);
        
        
        
        
        
        
        
        
        
    }

	
	
	private void enableButtons(boolean enable) {
		// TODO Auto-generated method stub
		 for (JButton button : buttons) {
	            button.setEnabled(enable);
	        }
	        tfresult.setEnabled(enable);
		
	}
    private JButton createNumberButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setForeground(new Color(255, 255, 255));
        button.setBackground(new Color(0, 0, 64));
        button.setBounds(x, y, 89, 23);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    tfresult.setText(""); // Clear display after operator click
                    isOperatorClicked = false;
                }
                tfresult.setText(tfresult.getText() + text);
            }
        });
        return button;
    }

    private void handleOperatorClicked(String op) {
        operator = op;
        isOperatorClicked = true;

        try {
            number1 = Double.parseDouble(tfresult.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            tfresult.setText(""); // Clear display on error
        }
    }

    private void handleEqualClicked() {
        if (!isOperatorClicked) {
            try {
                double num2 = Double.parseDouble(tfresult.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = number1 + num2;
                        break;
                    case "-":
                        result = number1 - num2;
                        break;
                    case "*":
                        result = number1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = number1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
                            tfresult.setText(""); // Clear display on error
                            return;
                        }
                        break;
                   
                }

                tfresult.setText(String.valueOf(result));
                isOperatorClicked = false; // Reset flag after calculation
                operator = ""; // Reset operator after calculation
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                tfresult.setText(""); // Clear display on error
            }
        }
		


		
		
		
		
		
	}
    
    
    
 
    public JButton getBtnCLEAR() {
        return btnCLEAR;
    }

    public void setBtnCLEAR(JButton btnCLEAR) {
        this.btnCLEAR = btnCLEAR;
    }

    public JButton getBtnDEL() {
        return btnDEL;
    }

    public void setBtnDEL(JButton btnDEL) {
        this.btnDEL = btnDEL;
    }

    public JButton getBtndivide() {
        return btndivide;
    }

    public void setBtndivide(JButton btndivide) {
        this.btndivide = btndivide;
    }

    public JButton getBtnunderroot() {
        return btnunderroot;
    }

    public void setBtnunderroot(JButton btnunderroot) {
        this.btnunderroot = btnunderroot;
    }

    public JButton getBtnSquare() {
        return btnSquare;
    }

    public void setBtnSquare(JButton btnSquare) {
        this.btnSquare = btnSquare;
    }

    public JButton getBtnInverse() {
        return btnInverse;
    }

    public void setBtnInverse(JButton btnInverse) {
        this.btnInverse = btnInverse;
    }

    public JButton getTnsub() {
        return tnsub;
    }

    public void setTnsub(JButton tnsub) {
        this.tnsub = tnsub;
    }

    public JButton getBtnmultiply() {
        return btnmultiply;
    }

    public void setBtnmultiply(JButton btnmultiply) {
        this.btnmultiply = btnmultiply;
    }

    public JButton getBtnsum() {
        return btnsum;
    }

    public void setBtnsum(JButton btnsum) {
        this.btnsum = btnsum;
    }

    public JButton getBtnequal() {
        return btnequal;
    }

    public void setBtnequal(JButton btnequal) {
        this.btnequal = btnequal;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JButton getBtndot() {
        return btndot;
    }

    public void setBtndot(JButton btndot) {
        this.btndot = btndot;
    }

   
    public JRadioButton getRbON() {
        return rbON;
    }

    public void setRbON(JRadioButton rbON) {
        this.rbON = rbON;
    }

    public JRadioButton getRbOFF() {
        return rbOFF;
    }

    public void setRbOFF(JRadioButton rbOFF) {
        this.rbOFF = rbOFF;
    }

    
    public JTextField getTfresult() {
        return tfresult;
    }

    public void setTfresult(JTextField tfresult) {
        this.tfresult = tfresult;
    }
    
    
    
    
    
    
}