# Lost Ones Transport

This is the FHNW IT-Product by Group LostOnes. It is a WebApp running with springboot.


#### Contents:
- [Installation Guide](#installation-guide)
  - [local IntelliJ Installation](#local-intellij-installation)
  - [Online](#online)
- [User-Guide](#user-guide)
  - [Shop-Page](#shop-page)
  - [Settings-Page](#settings-page)
- [Teammember](#teammember)
- [Template](#template)
- [License](#License)
 

## Installation Guide

The Application can run locally or Online. The local version is reset after every new run and does not save files in the postgres-database.
We recommend to run the project online.

### local IntelliJ Installation
1. Unzip the file and save it at the place you want to access the project.
2. In IntelliJ, hover over file in the topbar and choose "Project from existing sources" to add the file from the current destination. Alternatively, the project can be cloned with Version Control and the following link: *https://github.com/janwilhelmfhnw/LOTransport.git*
3. install the maven library (rightside-bar and /lifecycle/install) and check that openjdk18 is installed.
4. Ctrl + F9 to build the project.
5. Run the Project via ACRMWebApplication.
6. open *http://localhost:8080/* to access the project on your prefered browser.


### Online 

open *https://lo-transport.herokuapp.com/*  to access the project on your prefered browser.

## User-Guide

1. A fresh user is greeted with our HomeScreen and is asked to Login to access the website.
2. Since a fresh user has not an account, pressing the register button is the way to go.
3. The user is asked to register with a name, email and password. The Password has to full-fill certain parameters.
4. After registering, the user is able to login and access the webshop
5. On the top-left, the user can access the navbar with the following sites:
- Past Orders: Shows past orders
- Shop: Interface to order Products
- Settings: Interface to change the user profile and add the Address
- About Us: Shows the team Lost Ones.
- Log Out: Logs the user out of the website and returns him to the HomeScreen

![](images/home.png)


### Shop-Page

The User is able to choose from 4 different Products. Changing the amount of the product show the current price and the palletspace it would use.
The order button sends the user to the connected "order review" site to look at the selection again. This Button is blocked if the user does not choose any products. If the user proceeds with the order, he is sent to the "past order" page.

### Settings-Page

The User is able to change the following data that is injected into the database. Depending on a local or Heraku-Deployment, the data is saved for the next visit.
- Name
- Email
- Password
- Street
- Street Number
- Postal Code
- City


## Teammember
- [Philippe Gagneux]
- [Tijana Dobric]
- [Kenan Ahmetasevic]
- [Jan Wilhelm]

## Template
This WebApp has been created on top of the ACRM-Template by Andreas Martin: *https://github.com/DigiPR/acrm-webapp*


### License
[![License](https://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
- [Apache License, Version 2.0](blob/master/LICENSE)
- ![](images/logo.png)