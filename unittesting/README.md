# Unittesting
A project for the second ASE Unit Testing assignment.

## Menu
- [Run the module](#run-the-module)
- [Demo](#demo)
- [Authors](#authors)

## Run the module
Step-by-step instructions on how to run the unittesting tests and export JaCoCo Report when you have already installed the project on your local machine.

In order to test the unittesting module, run the command in unittesting directory:
    
        mvn test
    
If you want to generate JaCoCo Report, run the command in unittesting directory:
 
        mvn package jacoco:report
     
  and to open the report run:

- For Windows cmd:
      
      target\site\jacoco\index.html
           
- For Git Bash:
   
      start target/site/jacoco/index.html
      
- For Linux terminal:
   
      xdg-open target/site/jacoco/index.html
    
## Demo
If you run the unittesting test successfully, you will see a green "BUILD SUCCESS" message:

<img src="../media/unittesting.png" alt="Quarantine Activities" height="500"/>
    
## Authors
* [Athina Davari](https://github.com/AthinaDavari) 
