import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
String username;
JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage;
JButton viewpackage,viewhotels,destinations,bookhotel,viewbookedhotel,payment,calculators,notepad,about,deletePersonalDetails;
    Dashboard(String username){
        this.username=username;
        setBounds(0,0,1600,1200);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);


        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);

        JPanel p2= new JPanel();
        p2.setLayout(new GridLayout(15,1));
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

         addPersonalDetails= new JButton("Add Personal Details");

        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

         updatePersonalDetails= new JButton("Update Personal Details");

        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);


        viewPersonalDetails= new JButton("View Details");
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails= new JButton("Delete Personal Details");
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackages= new JButton("Check Package");
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.white);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackage= new JButton("Book Package");
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.addActionListener(this);
        bookpackage.setMargin(new Insets(0,0,0,120));
        p2.add(bookpackage);

         viewpackage= new JButton("View Package");
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

         viewhotels= new JButton("View Hotels");
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

         bookhotel= new JButton("Book Hotel");
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

         viewbookedhotel= new JButton("View Booked Hotel");
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.white);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);

         destinations= new JButton("Destinations");
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);



         payment= new JButton(" Payment");
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.white);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);

         calculators= new JButton("Calculator");
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.white);
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);

         notepad= new JButton("Notepad");
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);

         about= new JButton("About");
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);

        JScrollPane scrollPane=new JScrollPane(p2);
        scrollPane.setBounds(0,65,300,700);
        scrollPane.setBorder(null);
        add(scrollPane);

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5= i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text= new JLabel("Travel and Tourism Management System");
        text.setBounds(350,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway", Font.PLAIN,55));
         image.add(text);

        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()== viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()== checkpackages){
            new CheckPackage();
        }else if(ae.getSource()==bookpackage){
            new BookPackage(username);
        }else if(ae.getSource()== viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()== destinations){
            new Destinations();
        }else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()== viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()== payment){
            new Payment();
        }else if(ae.getSource()==calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                      e.printStackTrace();
            }
        }else if(ae.getSource()== about){
            new About();
        }else if(ae.getSource()== deletePersonalDetails){
            new DeleteDetails(username);
        }
   }




    public static void main(String[] args){




        new Dashboard("");
    }
}
