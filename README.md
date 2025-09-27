# 🛒 Online Electronic Store Management System  

## 📌 Overview  
The **Online Electronic Store Management System** is a **Java-based full-stack web application** that manages electronic products with **Admin** and **Customer** modules.  
It is developed using **Java Servlets, JSP, JDBC, and Oracle Database** following the **MVC architecture** with **DAO pattern** for database operations.  

This project demonstrates **real-world application design** with secure login, session handling, CRUD operations, and responsive UI.  

---![IMAGE5](https://github.com/user-attachments/assets/865932cb-0dad-4e72-a8bc-b782f51378ef)

![IMAGE4](https://github.com/user-attachments/assets/a4452a9e-40be-465e-abd0-770b87385b52)

![IMAGE3](https://github.com/user-attachments/assets/10bb7ea8-c1a8-4fee-82a7-5440b39103a2)

![IMAGE2](https://github.com/user-attachments/assets/476f1929-6d97-4519-b27c-2608a6b9a5fa)

![IMAGE1](https://github.com/user-attachments/assets/52faed84-35a9-482e-82b5-1adeb870c1d4)

![IMAG6](https://github.com/user-attachments/assets/82a1af38-ab91-4071-b8eb-ec8558067532)

![IMAGE7](https://github.com/user-attachments/assets/c91bb967-d37e-48cf-bdc3-c4b24b2871e7)

## 🚀 Features  

### 👤 Admin Module  
- Secure **Admin Login & Authentication**  
- Add, Edit, and Delete Products  
- View & Manage Product Inventory  
- Session & Cache Management to prevent unauthorized access  
- Error Handling with custom failure pages  

### 🧑‍🤝‍🧑 Customer Module  
- Customer Login with authentication  
- View available products dynamically  
- Personalized session management for customers  

---

## ⚙️ Technical Highlights  
- **Servlets & JSP** for server-side logic and dynamic page rendering  
- **JDBC with Oracle DB** for CRUD operations (SQL & PL/SQL)  
- **DAO Pattern** for clean and reusable database interaction  
- **MVC Architecture** ensuring separation of concerns  
- **CSS + Bootstrap** for responsive and user-friendly UI  
- **Session & Cache Management** for security and data consistency  
- **Exception Handling** for robust error-free execution  

---

## 🛠️ Tech Stack  

**Frontend:**  
- HTML5, CSS3, JSP, Bootstrap  

**Backend:**  
- Java (Servlets, JDBC, DAO Pattern, MVC)  

**Database:**  
- Oracle Database (SQL, PL/SQL)  

**Server:**  
- Apache Tomcat  

---

## 📂 Project Structure  
pack1/
│── AdminLoginservlet.java # Handles Admin login
│── customer_login_servlet.java # Handles Customer login
│── deletedproductservlet.java # Delete product logic
│── editproductservlet.java # Edit product logic
│── DAO Classes # Database CRUD operations
│── Bean Classes # JavaBeans for data encapsulation

JSP Pages/
│── AdminLogin.html
│── AdminLoginFailed.jsp
│── adminhome.jsp
│── customerhome.jsp
│── deleteproduct.jsp
│── Editproduct.jsp

CSS/
│── style.css # UI Styling

---

## 🔑 Key Learning Outcomes  
✔ Practical experience in **Java Web Application Development**  
✔ Implemented **CRUD operations** with JDBC + Oracle DB  
✔ Designed using **MVC Architecture & DAO Pattern**  
✔ Built secure modules with **Session & Cache Management**  
✔ Developed responsive UI with **JSP, CSS, and Bootstrap**  

---

## 📝 How to Run  
1. Clone this repository.  
2. Configure **Oracle Database** and update DAO classes with DB credentials.  
3. Deploy project on **Apache Tomcat Server**.  
4. Access application in browser:  
   - Admin Login: `http://localhost:8080/OnlineStore/al`  
   - Customer Login: `http://localhost:8080/OnlineStore/cl`  

---

## 🙌 Acknowledgements  
This project was developed as part of hands-on training in **Java, Advanced Java (J2EE), SQL/PLSQL, Spring & Spring Boot** at **Naresh IT**.  





