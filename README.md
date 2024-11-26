# PharmaGes: Medication Management Application

**PharmaGes** is an application developed in **Java** and linked to a **MySQL** database. It is designed to facilitate medication management in a pharmacy.  

---

## **Features**
1. **Registration of medications**  
   Add medications to the database with their information such as name, price, quantity, and expiration date.  
2. **Search queries**  
   Quickly get details on:
   - The price of medicines
   - The quantity available
   - The expiration date
   - Availability of medicines in stock.

3. **Friendly user interface**  
   An intuitive graphical interface makes it easy to interact with the application.

---

## **Prerequisites**
1. **Java Development Kit (JDK)**: Make sure the JDK is installed on your machine.  
2. **MySQL database**: Import or create the database from the `pharmabase.sql` file.

---

## **Installation and Use**

### 1. **Direct use**
- Download the `setup/PharmaGes.jar` file.
- Make sure the JDK is installed.
- Launch the application with the command:  
  ```bash
  java -jar PharmaGes.jar
```
## 2. Editing the code**

If you want to modify or adapt the application to your needs, follow these steps:

1. Clone this GitHub repository:  
   ```bash
   git clone https://github.com/votre-user/PharmaGes.git
   ```
2.Import the project into an IDE like IntelliJ IDEA.
3.Configure the MySQL connection directly in the source code, if necessary.
4.Launch or modify the project as needed.

### Database configuration
1.Import the SQL file into your MySQL database management system (DBMS):
```bash
mysql -u root -p < pharmabase.sql
```
Verify that the database connection parameters (host, user, password) are configured correctly in the application code.
Main interface
Here is an overview of the main PharmaGes GUI:
![Screenshot 2024-11-26 134801](https://github.com/user-attachments/assets/4b094fde-565d-4d26-af66-2cae39752c25)
