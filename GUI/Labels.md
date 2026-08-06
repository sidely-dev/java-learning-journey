        //===========
        // LABEL
        //===========
        
        ImageIcon image = new ImageIcon("images/dog.png");

        JLabel label = new JLabel(); //CReate a label
        label.setText("He was whipping up shit in a  kettle"); //Sets texts of a label
        label.setIcon(image); 
        label.setHorizontalTextPosition(JLabel.CENTER); //sets the text position, LEFT<CENTER<RIGHT
        label.setVerticalTextPosition(JLabel.CENTER); //Sets the text Top,CENTER<BOTTOM of imageicon
        label.setForeground(Color.white); //Sets color of text
        label.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 26)); //Sets the text font
        //label.setIconTextGap(100); //Set gap of text to image


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //Sets the defualt size to accomate you imageicon - Add //components the pack

