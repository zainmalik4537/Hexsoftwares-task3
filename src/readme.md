# Travel and Tourism Management System ✈️

A comprehensive desktop application built with Java Swing for managing travel agency operations. This project simulates a real-world booking and management system, providing a complete user journey from initial login to managing detailed travel itineraries.



## 📖 About The Project

This application is an all-in-one solution for both customers and administrators, featuring a clean graphical user interface and robust database integration to handle all aspects of travel planning. It allows users to sign up, manage their personal details, browse and book travel packages, reserve hotels, and view their complete travel plans. The system is designed to be intuitive and user-friendly, showcasing a full-stack approach to desktop application development.

---

## ✨ Key Features

* **User Authentication:** Secure user login and a seamless signup process for new users.
* **Animated Splash Screen:** A visually engaging entry point that welcomes users to the application.
* **Personalized Experience:** A dynamic loading screen that greets each logged-in user by name.
* **Centralized Dashboard:** A feature-rich main hub providing easy access to all modules:
    * **Customer Management:** Add, update, view, and delete personal details.
    * **Package Booking:** Browse detailed travel packages (e.g., Gold, Silver, Bronze) and book a trip.
    * **Hotel Booking:** View available hotels and make reservations with custom preferences.
    * **Itinerary Viewing:** Review the complete details of confirmed package and hotel bookings.
    * **Visual Showcases:** Automated slideshows for various travel destinations and available hotels.
* **Utility Tools:** Includes a built-in calculator and notepad for convenience during planning.

---

## 🛠️ Technology Stack

* **Frontend:** Java Swing
* **Backend:** Java
* **Database:** MySQL
* **Connectivity:** JDBC (Java Database Connectivity)
* **IDE:** IntelliJ IDEA
* **Database Management:** XAMPP with phpMyAdmin

---

## 🚀 Setup and Installation

To get a local copy up and running, follow these simple steps.

### Prerequisites

* **JDK 17** or higher.
* **IntelliJ IDEA** or any other Java IDE.
* **XAMPP** with Apache and MySQL services running.

### Installation

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/Your-Repository-Name.git](https://github.com/your-username/Your-Repository-Name.git)
    ```

2.  **Database Setup:**
    * Open **phpMyAdmin** from your XAMPP control panel.
    * Create a new database named `travelmanagementsystem`.
    * Select the new database and go to the **SQL** tab.
    * Run the following SQL commands to create the necessary tables:
        ```sql
        CREATE TABLE account (
            username VARCHAR(20) PRIMARY KEY,
            name VARCHAR(50),
            password VARCHAR(50),
            security_question VARCHAR(100),
            security_answer VARCHAR(100)
        );

        CREATE TABLE customer (
            username VARCHAR(20) PRIMARY KEY,
            id_type VARCHAR(50),
            id_number VARCHAR(50),
            gender VARCHAR(10),
            country VARCHAR(50),
            address VARCHAR(100),
            phone VARCHAR(20),
            email VARCHAR(50)
        );

        CREATE TABLE hotel (
            name VARCHAR(50) PRIMARY KEY,
            cost_per_person INT,
            ac_room_cost INT,
            food_included_cost INT
        );

        CREATE TABLE bookpackage (
            username VARCHAR(20),
            package_name VARCHAR(50),
            persons VARCHAR(10),
            id_type VARCHAR(50),
            id_number VARCHAR(50),
            phone VARCHAR(20),
            price VARCHAR(20)
        );
        -- Add CREATE TABLE statements for bookhotel if you have one --
        ```

3.  **Configure IntelliJ IDEA:**
    * Open the cloned project folder in IntelliJ IDEA.
    * Add the **MySQL JDBC Driver** to the project. Go to **File > Project Structure > Libraries > + > Java**, and select your `mysql-connector-j-x.x.xx.jar` file.
    * Ensure your database connection details in the `Conn.java` file match your local setup (database name, username `root`, and password `""`).

---

## ▶️ How to Run

1.  Open the project in IntelliJ IDEA.
2.  Navigate to the `Splash.java` or `Login.java` file.
3.  Right-click on the file and select **Run 'Splash.main()'**.

