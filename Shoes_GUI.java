 // Assignment 2 GUI 
 /*  Create a graphic user-interface for program Shoes. Add those items...
     1.Add, 2. Delete, 3. Edit, 4. Search, 5. Display and 6. Exit. 

     Must consist of Selection, Repetition, Menu (tasks user want to do),
     ArrayList, Exception Handling if invalid input.    */

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   
   import java.util.ArrayList;
   import javax.swing.table.DefaultTableModel;
  
class Shoes_GUI extends JFrame implements ActionListener {
   
   // My interface components
   private Container n;
   private JLabel title; // title of the interface     
   private JLabel name; // name                        
   private JTextField a_name;                        
   private JLabel age; // age                          
   private JComboBox a_age;                          
   private JLabel gender; // gender                   
   private JRadioButton male;                        
   private JRadioButton female;                      
   private ButtonGroup mof;
   private JLabel footsize; // foot size              
   private JComboBox a_foot;                         
   private JLabel email; // email                      
   private JTextField a_email;                       
   private JLabel pword; // password                   
   private JPasswordField a_pword;                   
   private JButton confirm; // confirms user
   private JButton reset; // resets the data
   private JTextArea display; // display the data entered
   private JLabel belowtxt; 
   
   private String ages[] = {"13", "14", "15", "16", "17", "18",
                            "19", "20", "21", "22", "23", "24"};
                            
   private String sizes[] = {"7", "8", "9", "10", "11", "12"};

   // new menu features
   private JLabel menu_desc;
   private JButton addbutton;
   private JButton deletebutton;
   private JButton editbutton;
   private JButton search;     
   private JButton exitbutton;

   // Constructor
   public Shoes_GUI() {
      setTitle("Shoes GUI"); 
      setBounds(300, 90, 950, 650);  
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setResizable(false);
      
      n = getContentPane(); 
      n.setLayout(null);
      
      Object [] column = {"Name", "Colour", "Features", "Price"};
      DefaultTableModel model = new DefaultTableModel();
          model.setColumnIdentifiers(column);
         
      JTable table = new JTable();
      table.setModel(model);
      table.setRowHeight(50); 
      table.setBackground(Color.CYAN);
      
      // title inside the GUI
      title = new JLabel("Welcome to the Shoes Info.......!"); 
         title.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
         title.setSize(350, 40); 
         title.setLocation(330, 20); 
         n.add(title); 

      // attribute regarding name
      name = new JLabel("Enter your name:"); 
         name.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         name.setSize(150, 20); 
         name.setLocation(50, 80); 
         n.add(name);
      
      a_name = new JTextField();
         a_name.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_name.setSize(190, 25); 
         a_name.setLocation(200, 80); 
         n.add(a_name);
      
      // attribute regarding age
      age = new JLabel("Age: ");
         age.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         age.setSize(100, 20); 
         age.setLocation(50, 115); 
         n.add(age);
         
      a_age = new JComboBox(ages);
         a_age.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_age.setSize(75, 25); 
         a_age.setLocation(150, 115); 
         n.add(a_age);
      
      // attribute regarding gender
      gender = new JLabel("Gender: ");
         gender.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         gender.setSize(100, 20); 
         gender.setLocation(50, 150); 
         n.add(gender);
         
      male = new JRadioButton("Male");    // male
         male.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         male.setSelected(true); 
         male.setSize(75, 20); 
         male.setLocation(150, 150); 
         n.add(male); 

      female = new JRadioButton("Female");      // female
         female.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         female.setSelected(false); 
         female.setSize(100, 20); 
         female.setLocation(250, 150); 
         n.add(female); 
         
      mof = new ButtonGroup(); 
         mof.add(male); 
         mof.add(female);
         
      // attribute regarding foot size
      footsize = new JLabel("Foot Size: ");
         footsize.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         footsize.setSize(100, 20); 
         footsize.setLocation(50, 185); 
         n.add(footsize);
      
      a_foot = new JComboBox(sizes);
         a_foot.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_foot.setSize(75, 25); 
         a_foot.setLocation(150, 185); 
         n.add(a_foot);
         
      // attribute regarding e-mail
      email = new JLabel("E-mail: ");
         email.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         email.setSize(100, 20); 
         email.setLocation(50, 220); 
         n.add(email);
      
      a_email = new JTextField();
         a_email.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_email.setSize(190, 25); 
         a_email.setLocation(150, 220); 
         n.add(a_email);
      
      // attribute regarding password
      pword = new JLabel("Password: ");
         pword.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         pword.setSize(100, 20); 
         pword.setLocation(50, 255); 
         n.add(pword);
        
      a_pword = new JPasswordField();   
         a_pword.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_pword.setSize(190, 25); 
         a_pword.setLocation(150, 255); 
         n.add(a_pword);

      // confirm button   
      confirm = new JButton("Are you confirm?");
         confirm.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         confirm.setSize(200, 30); 
         confirm.setLocation(50, 300); 
         confirm.addActionListener(this);
         n.add(confirm);
      
      // reset button 
      reset = new JButton("Reset");
         reset.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         reset.setSize(100, 30); 
         reset.setLocation(260, 300); 
         reset.addActionListener(this);
         n.add(reset);
         
      /////   
      // NEW EXTENSION (Assignment 3)
      menu_desc = new JLabel("Choose what you wanna do.");
         menu_desc.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
         menu_desc.setSize(300, 30);
         menu_desc.setLocation(100, 355); 
         n.add(menu_desc);

      // shoe name  
      JLabel shoename = new JLabel("Shoe: ");
        shoename.setBounds(40, 395, 100, 23);
        shoename.setFont(new Font("Arial", Font.BOLD, 15)); 
        n.add(shoename);
      
      JTextField a_shoename = new JTextField();                           
         a_shoename.setBounds(115, 395, 225, 25);
         n.add(a_shoename);
            
      // shoe colour   
      JLabel shoecolor = new JLabel("Colour:");
        shoecolor.setBounds(40, 430, 100, 23);
        shoecolor.setFont(new Font("Arial", Font.BOLD, 15)); 
        n.add(shoecolor);
      
      JTextField a_shoecolor = new JTextField();                     
         a_shoecolor.setBounds(115, 430, 225, 25);
         n.add(a_shoecolor);
      
      // shoe features
      JLabel features = new JLabel("Features:");
        features.setBounds(40, 465, 100, 23);
        features.setFont(new Font("Arial", Font.BOLD, 15)); 
        n.add(features);
      
      JTextField a_features = new JTextField();                   
         a_features.setBounds(115, 465, 225, 25);
         n.add(a_features);
        
      // shoe price
      JLabel price = new JLabel("Price:");
        price.setBounds(40, 500, 100, 23);
        price.setFont(new Font("Arial", Font.BOLD, 15)); 
        n.add(price);
      
      JTextField a_price = new JTextField();                       
         a_price.setBounds(115, 500, 225, 25);
         n.add(a_price);
            
     // new features of Menu
     // add item      
     addbutton = new JButton("Add");
        addbutton.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
        addbutton.setSize(80, 25);
        addbutton.setLocation(35, 540); 
        addbutton.addActionListener(this);
        n.add(addbutton);
    
     // remove item     
     deletebutton = new JButton("Delete");
        deletebutton.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
        deletebutton.setSize(100, 25);
        deletebutton.setLocation(120, 540); 
        n.add(deletebutton);
        
     // edit button
     editbutton = new JButton("Edit");
        editbutton.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
        editbutton.setSize(80, 25);
        editbutton.setLocation(225, 540); 
        n.add(editbutton);
        
     // search item   
     search = new JButton("Search");
        search.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
        search.setSize(90, 25);
        search.setLocation(310, 540); 
        n.add(search);
        
     // exit the GUI   
     exitbutton = new JButton("Exit");
        exitbutton.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
        exitbutton.setSize(80, 30);
        exitbutton.setLocation(800, 20); 
        exitbutton.addActionListener(this);
        n.add(exitbutton);
      
      // text above the display
      belowtxt = new JLabel("This is a space for personal data.");
         belowtxt.setFont(new Font("Courier New", Font.PLAIN, 15));
         belowtxt.setSize(500, 30); 
         belowtxt.setLocation(475, 65); 
         n.add(belowtxt);
         
      // display   
      display = new JTextArea(); 
         display.setFont(new Font("Courier New", Font.PLAIN, 16)); 
         display.setSize(450, 260); 
         display.setLocation(440, 100); 
         display.setLineWrap(true); 
         display.setEditable(false); 
         display.setBackground(Color.yellow);
         n.add(display);
     
     // table for Shoes
     JScrollPane pane = new JScrollPane(table);
        pane.setBounds(440, 375, 450, 200);
        n.setLayout(null);
        n.add(pane);
        
        Object[] row = new Object[4];
        
        
     // SAMBUNG SINI ESOK!!!   
     /* ArrayList 
     ArrayList kasut = new ArrayList();
       kasut.add("Shoes: Nike\nColour: Red.");
       kasut.add("Shoes: Adidas\nColour: Green-Silver");
       
        for(int i = 0; i < kasut.size(); i++) {
            JOptionPane.showMessageDialog(null, kasut.get(i).toString() );  } */
       
        // operation mechanisms     
        // Add button
        addbutton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
                row[0] = a_shoename.getText();
                row[1] = a_shoecolor.getText();
                row[2] = a_features.getText();
                row[3] = a_price.getText();
              
                model.addRow(row);    
          
            ArrayList kasut = new ArrayList();
            kasut.add(row[0] + "\n" + row[1] + "\n" + row[2] + "\n" + row[3]);
       
            for(int i = 0; i < kasut.size(); i++) {
                JOptionPane.showMessageDialog(null, kasut.get(i).toString() );  }
          
          }
        });
        
        // Delete button
        deletebutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                int i = table.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i); }
                else {
                    System.out.println("Delete Error...");}
                
            }
        });
        
        // Edit button
        editbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                int i = table.getSelectedRow();      
                if (i >= 0){
                    model.setValueAt(a_shoename.getText(), i, 0);
                    model.setValueAt(a_shoecolor.getText(), i, 1);
                    model.setValueAt(a_features.getText(), i, 2);
                    model.setValueAt(a_price.getText(), i, 3);   }
                else
                    System.out.println("Editing error...");

            }
        });
        
        // Get values
        table.addMouseListener(new MouseAdapter() {
        
            public void mouseClick (MouseEvent er){
                
                int i = table.getSelectedRow();
                a_shoename.setText((String) model.getValueAt(i, 0));
                a_shoecolor.setText((String) model.getValueAt(i, 1));
                a_features.setText((String) model.getValueAt(i, 2));
                a_price.setText((String) model.getValueAt(i, 3));   }
            
        });
        
        // Reset Button
        reset.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) { 
               a_name.setText(""); 
               a_age.setSelectedIndex(0); 
               a_foot.setSelectedIndex(0); 
               mof.clearSelection();
               a_email.setText(""); 
               a_pword.setText("");
               display.setText("");            
               belowtxt.setText("Fill in the blanks " +
                                "with appropriate data.");    }
        });
        
        // BERSAMBUNG...
        
        
        
        
      setVisible(true);
   } // end of GUI
      
   // method actionPerformed as a mechanism of the GUI   
   public void actionPerformed(ActionEvent e) { 
              
      // if "Confirm" button is clicked             
      if (e.getSource() == confirm) {        
            // displays name, age, gender, foot size, e-mail, password
            String a0 = "--------------------------------------------" + "\n" +
                        "\t     BASIC INFORMATIONS \n\n";
            String att1 = "Name: "+ a_name.getText() +"\n";
            String att2 =  "Age: "+ (String)a_age.getSelectedItem() +"\n";
            
            String att3;
            if (male.isSelected())
               att3 = "Gender: Male"+ "\n";
            else
               att3 = "Gender: Female"+ "\n";
               
            String att4 = "Foot Size: "+ (String)a_foot.getSelectedItem() +"\n";
            String att5 = "E-mail: "+ a_email.getText() +"\n";
            String a1 = "--------------------------------------------\n";
            String welc = "Nice to meet you, "+ a_name.getText() + "!" +
                          "\nWe have certain types of shoes here! \nEnjoy yourself!";
            
            display.setText(a0 + att1 + att2 + att3 + att4 + att5 + a1 + welc);               
            display.setEditable(false);
            belowtxt.setText("Login successful!");                     
            
       if (e.getSource() != confirm){ 
            display.setText(""); 
            belowtxt.setText("Please accept the "
                     + "confirmation..."); } 
                                       
      } // end of "Confirm" button
      
      // if "Exit" button is prompted
      if(e.getSource() == exitbutton) {
          System.exit(0);
          dispose();    }
    
   } // end of actionPerformed
   
} // end of actionlistener

   
   
// Driver Code 
class Start { 
   public static void main(String[] args) throws Exception 
   { 
      Shoes_GUI z = new Shoes_GUI(); 
   } 
} 

    
  
