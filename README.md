# Lab_Assignments_Applied_Engineering
Assignment for 6th semester course "Applied Software Engineering"\
Department of Management Science and Technology\
Athens University of Economics and Business

## Description
Create and generate an simple line chart with a txt dataset.

## Getting Started
These instructions will give you a copy of the project up and running on
your local machine.

### Prerequisites
Requirements for the project's software and other tools to build it in your machine.
- [Java 8 or newer](https://www.java.com/en/download/manual.jsp)
- [Apache Maven](https://maven.apache.org/download.cgi)

### Installing
A step by step instructions on how to get the jar running.

To install this repo locally run

    git clone https://github.com/AthinaDavari/Lab_Assignments_Applied_Engineering.git

In order to build gradeshistogram module and install the jar, run the command in repos' ase2021_practical_assignments directory
    
    mvn package

and then enter the folder gradeshistogram and run the command

    java -jar target\gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar [FILE]

FILE : the name of the txt which contains the dataset for the chart.  

## Demo
If you install and run the software successfully, you will see a chart like the following:

<img src="media/demo.png" alt="Quarantine Activities" height="500"/>

## Authors
* [Athina Davari](https://github.com/AthinaDavari) 
