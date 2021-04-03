# Lab_Assignments_Applied_Engineering
Assignment for 6th semester course "Applied Software Engineering"\
Department of Management Science and Technology\
Athens University of Economics and Business

## Description
This repo contains all the lab assignments for applied engineering course.

## Getting Started
These instructions will give you a copy of the project up and running on
your local machine. See deployment
for notes on deploying the project on a live system.

### Prerequisites
Requirements for the software and other tools to build, test and push
- [Java 8 or newer](https://www.java.com/en/download/manual.jsp)
- [Apache Maven](https://maven.apache.org/download.cgi)

### Installing
A step by step instructions on how to get the jar running.

To install this repo locally

    git clone https://github.com/AthinaDavari/Lab_Assignments_Applied_Engineering.git

In order to build gradeshistogram module and install the jar, run the command in repos' ase2021_practical_assignments directory
    
    mvn package

and then enter the folder gradeshistogram and run the command

    java -jar target\gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar [FILE]

FILE : the name of the txt which contains the dataset for the chart.  

## Authors
* [Athina Davari](https://github.com/AthinaDavari) 
