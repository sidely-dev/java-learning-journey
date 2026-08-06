        //===========

        // PANELS-Layount Managers

        //===========

        ImageIcon image = new ImageIcon("images/people.png");

        JLabel label = new JLabel();
        label.setText("Bro the smell Mike the smell");
        label.setIcon(image);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0, 250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);

        greenPanel.setBounds(0,250, 250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        redPanel.add(label);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);



    }
