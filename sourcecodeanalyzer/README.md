# Sourcecodeanalyzer
A project for the third ASE Design Pattern assignment. It reads a Java source
code file that is stored locally or on the web, calculates the Lines of Code
(LOC), Number of Classes (NOC) and Number of Methods (NOM) metrics,
and finally, exports these metrics to an output file.


## Menu
- [Run the module](#run-the-module)
- [Class Diagram](#class-diagram)
- [Report](#report)
- [Authors](#authors)

## Run the module
Step-by-step instructions on how to get the jar running, run the tests and export JaCoCo report when you have already installed the project on your local machine.

In order to build sourcecodeanalyzer module and install the jar, run the command in sourcecodeanalyzer directory:

    mvn package

then enter the target folder and run the command:

    java -jar sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar [arg0] [arg1] [arg2] [arg3] [arg4]

[arg0] : “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)\
[arg1] : “sourceCodeAnalyzerType” [regex|strcomp]\
[arg2] : “SourceCodeLocationType” [local|web]\
[arg3] : “OutputFilePath” (e.g., ../output_metrics_file)\
[arg4] : “OutputFileType” [csv|json]

In order to test the sourcecodeanalyzer module, run the command in sourcecodeanalyzer directory:
    
     mvn test
    
If you want to generate JaCoCo Report, run the command in sourcecodeanalyzer directory:
 
     mvn package jacoco:report
     
  and to open the report run:

- For Windows cmd:
      
      target\site\jacoco\index.html
           
- For Git Bash:
   
      start target/site/jacoco/index.html
      
- For Linux terminal:
   
      xdg-open target/site/jacoco/index.html

## Class Diagram

<img src="ClassDiagram.png" alt="Class Diagram" width="800"/>

## Report
    
## Authors
* [Athina Davari](https://github.com/AthinaDavari) 
