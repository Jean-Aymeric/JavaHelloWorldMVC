# A Simple Java HelloWorld MVC program example
## Hope this helps some of my students
[![GitHub Super-Linter](https://github.com/Jean-Aymeric/JavaHelloWorldMVC/workflows/Lint%20Code%20Base/badge.svg)](https://github.com/marketplace/actions/super-linter)

Author : [jeanaymeric@gmail.com](mailto:jeanaymeric@gmail.com")

JavaDoc : [https://jean-aymeric.github.io/JavaHelloWorldMVC/](https://jean-aymeric.github.io/JavaHelloWorldMVC/)

Visual Paradigm Files : https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/HelloWorldMVC.vpp
```
 _____     _ _     _ _ _         _   _    _____ _____ _____    _             __ _____ ____  
|  |  |___| | |___| | | |___ ___| |_| |  |     |  |  |     |  | |_ _ _    __|  |  _  |    \ 
|     | -_| | | . | | | | . |  _| | . |  | | | |  |  |   --|  | . | | |  |  |  |     |  |  |
|__|__|___|_|_|___|_____|___|_| |_|___|  |_|_|_|\___/|_____|  |___|_  |  |_____|__|__|____/ 
                                                                  |___|                     
---------------------------------------------------------------------------------------------
id	| Code	| Name
------------------------------------------
1	| FR	| France
6	| CH	| Suisse
2	| UK	| United Kingdom
3	| US	| United states of america
4	| ES	| España
5	| DE	| Deutschland
7	| ID	| Indonesia
------------------------------------------
```
## Instructions :
- Download the SQL script : ![SQL Script](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/helloworldmvc.sql) or docs/sql/helloworldmvc.sql.
- Execute the SQL script on your MySql or MAriaDB server.
- Change the user and password in the configuration file com/jad/model/dao/db.properties.
- Run the Main class.

## Use Case Diagram
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/Use%20Case%20Diagram.png)

## Class Diagram
![Class Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/Class%20Diagram.png)

## Sequences Diagram
### Global Sequence
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/Global%20Sequence.png)

### IModel.getCountries()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IModel.getCountries().png)

### IModel.getCountryByCode()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IModel.getCountryByCode().png)

### IModel.getCountryByName()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IModel.getCountryByName().png)

### IView.askCodeOrName()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IView.askCodeOrName().png)

### IView.askUserFindChoice()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IView.askUserFindChoice().png)

### IView.printMessage()
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/IView.printMessage().png)

### DbConnection Singleton Design Pattern
![Use Case Diagram](https://jean-aymeric.github.io/JavaHelloWorldMVC/vpp/DbConnection%20Singleton%20Design%20Pattern.png)
