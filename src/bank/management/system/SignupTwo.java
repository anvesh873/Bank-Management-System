

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupTwo extends JFrame implements ActionListener
{
   
    JTextField span,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,income,education;
    String formno;
     

    private static final String PAN_REGEX = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
    private static final Pattern PAN_PATTERN = Pattern.compile(PAN_REGEX);
    
    SignupTwo(String formno){
        
        this.formno=formno;        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATON FORM - PAGE 2");
             
        
        JLabel aditionalDetails=new JLabel("Page 2: Additional Details");
        aditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        aditionalDetails.setBounds(290,80,400,30);
        add(aditionalDetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valRegion[]={"Null","Hindu","Muslim","Christian","Sikh","Other"};
        religion =new JComboBox(valRegion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"Null","General","OBC","SC","ST","Other"}; 
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel jincome=new JLabel("Income:");
        jincome.setFont(new Font("Raleway",Font.BOLD,22));
        jincome.setBounds(100,240,200,30);
        add(jincome);
        
        String incomeCategory[]={"Null","No Salary / Unpaid","<= 1,50,000","<=2,50,000","<=5,00,000","> 5 Lakhs"};
        income=new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel jeducational=new JLabel("Educational");
        jeducational.setFont(new Font("Raleway",Font.BOLD,22));
        jeducational.setBounds(100,290,200,30);
        add(jeducational);
        
        JLabel jqualification=new JLabel("Qualification:");
        jqualification.setFont(new Font("Raleway",Font.BOLD,22));
        jqualification.setBounds(100,315,200,30);
        add(jqualification);
        
        String educationValue[]={"Null","Non-Graduate","Gradute","Post-Graduate","Doctrate","Others"};
        education=new JComboBox(educationValue);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
                
        
        JLabel joccupation=new JLabel("Occupation:");
        joccupation.setFont(new Font("Raleway",Font.BOLD,22));
        joccupation.setBounds(100,390,200,30);
        add(joccupation);
        
        String OccupationValue[]={"Null","Salaried","Self Employed","Bussiness","Student","Retires","Others"};
        occupation=new JComboBox(OccupationValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel pan=new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,22));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        span =new JTextField();
        span.setFont(new Font("Raleway",Font.BOLD,14));
        span.setBounds(300,440,400,30);
        add(span);
        
        JLabel jaadhar=new JLabel("Aadhar Number:");
        jaadhar.setFont(new Font("Raleway",Font.BOLD,22));
        jaadhar.setBounds(100,490,200,30);
        add(jaadhar);
        
        aadhar =new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel jsenior=new JLabel("Senior Citizen:");
        jsenior.setFont(new Font("Raleway",Font.BOLD,22));
        jsenior.setBounds(100,540,200,30);
        add(jsenior);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
       
        
        ButtonGroup bsenoircitizen=new ButtonGroup();
        bsenoircitizen.add(syes);
        bsenoircitizen.add(sno);
       
        
        JLabel jexisitingaccount=new JLabel("Existing Account:");
        jexisitingaccount.setFont(new Font("Raleway",Font.BOLD,22));
        jexisitingaccount.setBounds(100,590,200,30);
        add(jexisitingaccount);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
       
        
        ButtonGroup existingAcc=new ButtonGroup();
        existingAcc.add(eyes);
        existingAcc.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        //String formno=""+ random;
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        String exisitingaccount=null;
        if(eyes.isSelected()){
           exisitingaccount="Yes";
        }else if(eno.isSelected()){
            exisitingaccount="No";
        }
        
        String pan=span.getText();
        String saadhar=aadhar.getText();
        if(sreligion.equals("Null")){
            JOptionPane.showMessageDialog(null,"Select your Religion");
        }else if(scategory.equals("Null")){
            JOptionPane.showMessageDialog(null,"Select your Category");
        }else if(sincome.equals("Null")){
            JOptionPane.showMessageDialog(null,"Select your Income");
        }else if(seducation.equals("Null")){
            JOptionPane.showMessageDialog(null,"Select your Education");
        }else if(soccupation.equals("Null")){
            JOptionPane.showMessageDialog(null,"Select your Occupation");
        }else if(!validatepan(pan)){
            if(pan.equals(""))
                JOptionPane.showMessageDialog(null,"PAN no is Required");
            else
                JOptionPane.showMessageDialog(null,"Enter valid PAN No");
        }else if(saadhar.equals("") || saadhar.length()!=12 || !saadhar.matches("\\d{12}")){
            if(saadhar.equals(""))
                JOptionPane.showMessageDialog(null,"Aadhar No is Required");
            else
                JOptionPane.showMessageDialog(null,"Enter valid Aadhar No");
        }else if(seniorcitizen==null){
                JOptionPane.showMessageDialog(null,"Select Senior Citizen Status: ");
        }else if(exisitingaccount==null){
                JOptionPane.showMessageDialog(null,"Exisiting Account is Required");
        }
        else{
            try{

                conn c=new conn();
                String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+phoneno+"', '"+saadhar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }           
            catch (Exception e)
            {
                System.out.println(e);
            }
        }  
            
    }

 
    public static boolean validatepan(String panNumber){
         if (panNumber == null) {
            return false;
        }
        Matcher matcher = PAN_PATTERN.matcher(panNumber);
        return matcher.matches();
    }
   
    public static void main(String args[]) {
        
        new SignupTwo("");
    }
}