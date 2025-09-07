import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About  extends JFrame implements ActionListener {

    About(){
   setBounds(600,200,500,550);
   setLayout(null);
   getContentPane().setBackground(Color.WHITE);
   JLabel l1= new JLabel("About");
   l1.setBounds(200,10,100,40);
   l1.setForeground(Color.RED);
   l1.setFont(new Font("Tahoma",Font.PLAIN,20));
   add(l1);

   String s ="Welcome to the Travel and Tourism Management System, a comprehensive desktop application built with Java Swing that simulates a real-world travel agency's booking and management process. This project provides a complete user journey, from initial login to managing detailed travel itineraries.\n" +
           "\n" +
           "This application is designed to be an all-in-one solution for both customers and administrators, featuring a clean graphical user interface and robust database integration to handle all aspects of travel planning.\n" +
           "\n" +
           "## Key Features ✈\uFE0F\n" +
           "Animated Splash Screen: A visually engaging entry point that welcomes users to the application.\n" +
           "\n" +
           "Secure User Authentication: A full-fledged login and signup system to manage user accounts securely.\n" +
           "\n" +
           "Personalized Loading Screen: A dynamic loading bar that greets each user by name for a personalized experience.\n" +
           "\n" +
           "Centralized Dashboard: The main hub of the application, providing easy access to all modules:\n" +
           "\n" +
           "Add/Update Personal Details: Customers can enter and modify their personal information, ensuring all records are current.\n" +
           "\n" +
           "View/Delete Personal Details: Provides a clear view of existing customer data with the ability to remove records from the database.\n" +
           "\n" +
           "Check & Book Packages: Users can browse detailed travel packages and book their desired trip with just a few clicks.\n" +
           "\n" +
           "Check & Book Hotels: A module for viewing available hotels and making reservations based on preferences like AC and food inclusion.\n" +
           "\n" +
           "View Booked Itineraries: Allows users to review the complete details of their confirmed package and hotel bookings.\n" +
           "\n" +
           "Destination Showcase: An automated slideshow that presents beautiful images of various travel destinations to inspire users.\n" +
           "\n" +
           "Utility Tools: Includes a built-in calculator and notepad for convenience during travel planning.\n" +
           "\n" +
           "## Core Technologies\n" +
           "Language: Java\n" +
           "\n" +
           "UI Framework: Java Swing (for the graphical user interface)\n" +
           "\n" +
           "Database: MySQL (managed via XAMPP)\n" +
           "\n" +
           "Connectivity: JDBC (Java Database Connectivity)";

   TextArea area= new TextArea(s,10,40,Scrollbar.VERTICAL);
   area.setEditable(false);
   area.setBounds(20,100,450,300);
   add(area);

   JButton back= new JButton("Back");
   back.setBounds(200,420,100,25);
    back.addActionListener(this);
    add(back);


   setVisible(true);


    }
public void actionPerformed(ActionEvent ae){

        setVisible(false);
}


    public static void main(String[] args){
         new About();
    }


}
