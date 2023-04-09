package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JButton next,back;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 20);   
        add(additionalDetails);
        
        JLabel rel = new JLabel("Religion:");
        rel.setFont(new Font("Raleway", Font.BOLD, 20));  
        rel.setBounds(100, 140, 100, 30);   
        add(rel);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christain", "Other"}; 
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
   
        JLabel cat = new JLabel("Category:");
        cat.setFont(new Font("Raleway", Font.BOLD, 20));
        cat.setBounds(100, 190, 200, 30);    
        add(cat);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"}; 
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30); 
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel in = new JLabel("Income:");
        in.setFont(new Font("Raleway", Font.BOLD, 20));
        in.setBounds(100, 240, 200, 30);  
        add(in);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"}; 
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30); 
        income.setBackground(Color.WHITE);
        add(income);
        
        String educationValues[] = {"Non-Graduate", "Graduate", "Pst-Graduate", "Doctrate", "Others"}; 
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30); 
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel edu = new JLabel("Educational:");
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        edu.setBounds(100, 290, 200, 30);    
        add(edu);
        
        JLabel qual = new JLabel("Qualification:");
        qual.setFont(new Font("Raleway", Font.BOLD, 20));
        qual.setBounds(100, 320, 200, 30);
        add(qual);
        
        JLabel occ = new JLabel("Occupation:");
        occ.setFont(new Font("Raleway", Font.BOLD, 20));
        occ.setBounds(100, 390, 200, 30); 
        add(occ);
        
        String occupationalValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"}; 
        occupation = new JComboBox(occupationalValues);
        occupation.setBounds(300, 390, 400, 30); 
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel p = new JLabel("PAN Number:");
        p.setFont(new Font("Raleway", Font.BOLD, 20));
        p.setBounds(100, 440, 200, 30);
        add(p);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel ad = new JLabel("Aadhar Number:");
        ad.setFont(new Font("Raleway", Font.BOLD, 20));
        ad.setBounds(100, 490, 200, 30);
        add(ad);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30); 
        add(senior);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        
//        b = new JButton("Next");
//        b.setBackground(Color.BLACK);
//        b.setForeground(Color.WHITE);
//        b.setFont(new Font("Raleway", Font.BOLD, 14));
//        b.setBounds(720, 590, 80, 30);  // Before submitting on Github change JButton's x = 620, y = 660.
//        b.addActionListener(this);
//        add(b);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 630, 80, 30);  // Before submitting on Github change JButton's x = 620, y = 660.
        next.addActionListener(this);
        add(next);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.setBounds(520, 630, 80, 30);  // Before submitting on Github change JButton's x = 620, y = 660.
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);   // Color class is inside awt.
        
        setSize(850, 800);
        setLocation(350, 10);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == back){
            setVisible(false);
            new SignupOne().setVisible(true);
            return;
        }
        // What action to do, if button is clicked.
        // ActionEvent class helps in finding on which component action was perfformed. For e.g., Suppose, which button was clicked.
        String sreligion = (String) religion.getSelectedItem();  // Returns an object
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
            if(aadhar.equals("")){
                // Validation
                // If name inmput is empty string. Then we can use JOptionPane to show a pop-up(Dialog)
                JOptionPane.showMessageDialog(null, "Name is Rquired !");
           }else{
                Conn c = new Conn();
                String query = "insert into signuptwo value('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                // signup 3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}

