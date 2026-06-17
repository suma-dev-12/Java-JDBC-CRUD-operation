# ☕ Advanced Java - JDBC DAO Project

A Java project demonstrating **Database Connectivity** and the 
**DAO (Data Access Object)** design pattern using JDBC and MySQL.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Database Connectivity | JDBC |
| Database | MySQL |
| Pattern Used | DAO (Data Access Object) |
| IDE | Eclipse |

---

## 📂 Project Structure
src/
├── connection/
│   └── DBConnection.java      → MySQL database connection setup
├── model/
│   └── Person.java            → Person entity/model class
├── DaoLayer/
│   └── DaoLayer.java          → All DB operations (CRUD)
└── Main/
└── Main.java              → Main program entry point

---

## ✨ Features

- 🔌 MySQL Database Connection using JDBC
- 👤 Person model with attributes
- 📋 DAO Layer for clean separation of logic
- ➕ Create, Read, Update, Delete operations

---

## ⚙️ How to Run

1. Import project into **Eclipse IDE**
2. Set up **MySQL database**
3. Update credentials in `DBConnection.java`:
```java
String url = "jdbc:mysql://localhost:3306/yourDB";
String user = "your_username";
String password = "your_password";
```
4. Run `Main.java`

---

## 👩‍💻 Developer

Made with ❤️ by [suma-dev-12](https://github.com/suma-dev-12)
