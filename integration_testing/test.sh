#!/bin/bash

java -jar ../sourcecodeanalyzer/target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../sourcecodeanalyzer/src/main/resources/TestClass.java regex local actual_metrics csv
echo "loc,noc,nom," > expected_metrics.csv
echo "21,3,3," >> expected_metrics.csv
if [ cmp --silent actual_metrics.csv expected_metrics.csv ]; then 
  echo "WARNING: Integration test fail!";
  exit 1;
fi
echo "SUCCESS: Integration test pass!"
