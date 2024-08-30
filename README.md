# AirPort_System

# Advanced Flight Management System

## Overview

The Advanced Flight Management System is a software application designed to create, manage, and track flights and passengers efficiently. This system leverages several design patterns to solve various challenges and ensure flexibility and scalability for future enhancements.

## Features

1. **Flight Search Mechanism (Strategy Pattern)**
   - The system includes a flexible flight search mechanism that allows for different search algorithms, such as searching by price, departure time, or flight duration. 
   - Users can choose the desired search strategy at runtime, providing a tailored experience based on specific needs.

2. **Hierarchical Model for Airlines (Composite Pattern)**
   - This feature allows for the construction of a hierarchical model of airlines, including sub-companies and flights under each company.
   - It enables centralized management and reporting of data for large airlines that own multiple sub-companies, offering a comprehensive view of operations.

3. **Real-Time Flight Alerts (Observer Pattern)**
   - The system implements a notification system for flight updates, including changes in departure times, cancellations, or new promotions.
   - Passengers and airline employees can register as observers to receive real-time updates, ensuring timely information and enhanced customer service.
