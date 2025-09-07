# Travel and Tourism Management System ✈️

**A comprehensive, feature-rich desktop application for managing a complete travel agency workflow, built with Java Swing and MySQL.**

This project is a fully functional simulation of a travel management system. It provides a robust desktop GUI for users to manage their travel plans, from creating an account and booking packages to viewing itineraries and making payments. It serves as a practical demonstration of Java application development, database management, and object-oriented programming principles.

![Dashboard Screenshot]()
<img width="1366" height="768" alt="Screenshot (89)" src="https://github.com/user-attachments/assets/c2460548-b0dd-49d7-8fef-4d30a7562d90" />

---
## ✨ Features & Modules in Detail

The application's functionality is organized into a modular dashboard, providing a seamless user experience.

### 👤 Customer Management
* **Add Personal Details:** After signing up, users are directed here to add essential personal information (ID type, number, address, etc.). This data is stored in the `customer` table and linked to their account.
* **Update Personal Details:** Allows the logged-in user to modify their existing information. The form is pre-populated with their current data, which can be edited and saved back to the database.
* **View Details:** Displays all the personal and contact information for the currently logged-in user in a read-only format.
* **Delete Personal Details:** Provides functionality for a user to permanently remove their personal details and associated bookings from the database.

### 🏞️ Package & Trip Planning
* **Check Package:** Presents three distinct travel packages (Gold, Silver, Bronze) in a tabbed view. Each tab details the package's duration, features, and cost.
* **Book Package:** A form that allows the user to select a package, specify the number of people traveling, and view the calculated total price before confirming the booking.
* **View Package:** After booking, this screen shows the user the complete details of their confirmed package, pulling data from the `bookpackage` table.

### 🏨 Hotel Management
* **View Hotels:** An automated slideshow that showcases images and names of various partner hotels, helping users decide on their accommodation.
* **Book Hotel:** Allows users to book a stay at a selected hotel. They can specify the number of days and select preferences for AC rooms and food inclusion, with the total price updated dynamically.
* **View Booked Hotel:** Displays the details of the user's current hotel reservation.

### 🗺️ Exploration & Utilities
* **Destinations:** A captivating slideshow of beautiful travel destinations to inspire users for future trips.
* **Payment:** A dedicated module for handling payments for booked packages and hotels.
* **Calculator:** Integrates the native system calculator (e.g., Windows Calculator) for user convenience.
* **Notepad:** Opens the native system's Notepad application, allowing users to take quick notes without leaving the ecosystem.
* **About:** A section providing information about the project and its purpose.

---
## 🗃️ Database Schema

The application is powered by a MySQL database named `travelmanagementsystem` containing five core tables to manage all data logically.

### 1. `account` Table
Stores user credentials and security information for authentication.
| Column              | Type          | Description                                  |
| :------------------ | :------------ | :------------------------------------------- |
| `username`          | `VARCHAR(20)` | **Primary Key.** Unique identifier for the user.   |
| `name`              | `VARCHAR(50)` | The full name of the user.                   |
| `password`          | `VARCHAR(50)` | The user's password for logging in.          |
| `security_question` | `VARCHAR(100)`| A security question for password recovery.  |
| `security_answer`   | `VARCHAR(100)`| The answer to the security question.         |

### 2. `customer` Table
Stores detailed personal information about each user.
| Column      | Type          | Description                                             |
| :---------- | :------------ | :------------------------------------------------------ |
| `username`  | `VARCHAR(20)` | **Primary Key/Foreign Key.** Links to the `account` table. |
| `id_type`   | `VARCHAR(50)` | The type of identification document (e.g., Passport).   |
| `id_number` | `VARCHAR(50)` | The unique number of the identification document.       |
| `gender`    | `VARCHAR(10)` | The customer's gender.                                  |
| `country`   | `VARCHAR(50)` | The customer's country of residence.                    |
| `address`   | `VARCHAR(100)`| The customer's physical address.                        |
| `phone`     | `VARCHAR(20)` | The customer's phone number.                            |
| `email`     | `VARCHAR(50)` | The customer's email address.                           |

### 3. `hotel` Table
Stores details about the available hotels.
| Column             | Type          | Description                               |
| :----------------- | :------------ | :---------------------------------------- |
| `name`             | `VARCHAR(50)` | **Primary Key.** The name of the hotel.      |
| `cost_per_person`  | `INT`         | The base cost per person per day.         |
| `ac_room_cost`     | `INT`         | The additional cost for an AC room.       |
| `food_included_cost` | `INT`         | The additional cost for food inclusion. |

### 4. `bookpackage` Table
Stores information about packages booked by users.
| Column        | Type          | Description                             |
| :------------ | :------------ | :-------------------------------------- |
| `username`    | `VARCHAR(20)` | The user who booked the package.        |
| `package_name`| `VARCHAR(50)` | The name of the package booked.         |
| `persons`     | `VARCHAR(10)` | The number of people in the group.      |
| `id_type`     | `VARCHAR(50)` | The user's ID type at the time of booking. |
| `id_number`   | `VARCHAR(50)` | The user's ID number at the time of booking. |
| `phone`       | `VARCHAR(20)` | The user's phone at the time of booking. |
| `price`       | `VARCHAR(20)` | The total price of the booking.         |

### 5. `bookhotel` Table
Stores details of hotel reservations made by users.
| Column     | Type          | Description                            |
| :--------- | :------------ | :------------------------------------- |
| `username` | `VARCHAR(20)` | The user who booked the hotel.         |
| `hotel_name` | `VARCHAR(50)` | The name of the hotel booked.          |
| `persons`  | `VARCHAR(10)` | The number of people staying.          |
| `days`     | `VARCHAR(10)` | The total number of days for the stay. |
| `ac_status`| `VARCHAR(10)` | 'AC' or 'Non-AC'.                    |
| `food_status`|`VARCHAR(10)` | 'Yes' or 'No'.                       |
| `id_type`  | `VARCHAR(50)` | User's ID type.                        |
| `id_number`| `VARCHAR(50)` | User's ID number.                      |
| `phone`    | `VARCHAR(20)` | User's phone.                          |
| `price`    | `VARCHAR(20)` | Total price for the hotel stay.        |

---
## 🛠️ Technology Stack
* **Frontend:** Java Swing
* **Backend:** Java
* **Database:** MySQL
* **Connectivity:** JDBC (Java Database Connectivity)
* **IDE:** IntelliJ IDEA
* **Database Management:** XAMPP with phpMyAdmin

---
## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites
* JDK 17 or higher.
* IntelliJ IDEA or any other Java IDE.
* XAMPP with Apache and MySQL services running.

### Installation
1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/Your-Repository-Name.git](https://github.com/your-username/Your-Repository-Name.git)
    ```
2.  **Database Setup:**
    * Open phpMyAdmin and create a new database named `travelmanagementsystem`.
    * Run the SQL commands provided in the "Database Schema" section above to create all the necessary tables.
3.  **Configure IntelliJ IDEA:**
    * Open the project folder in IntelliJ IDEA.
    * Add the **MySQL JDBC Driver** to the project libraries.
    * Verify that your database connection details in `Conn.java` are correct (database name, username `root`, password `""`).

---
## ▶️ How to Run
1.  Open the project in IntelliJ IDEA.
2.  Navigate to the `Splash.java` file.
3.  Right-click on the file and select **Run 'Splash.main()'**.

```
