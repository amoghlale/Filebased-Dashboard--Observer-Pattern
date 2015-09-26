CS542 Design Patterns
Spring 2015
PROJECT <3> README FILE

Due Date: <Friday, April 3, 2015>
Submission Date: <April 3, 2015>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <Lale Amogh Pramod> 
e-mail(s): <alale1@binghamton.edu> 

PURPOSE:
[
  My Assignment tries to successfully implement the Observer pattern by 
  making registering listeners with their filters and then  sending input line
  to appropriate listener based on the filter conditions.	
]

PERCENT COMPLETE:
[
  I believe I have completed 100% of this assignment. My judgement is based 
  on the fact that my code is working for all test cases. 
]

PARTS THAT ARE NOT COMPLETE:
[
  I believe everything is complete.
]

BUGS:

[
  None
]

FILES:

[

Included with this project are 10 class files ad 5 interfaces:
Class files-
Driver.java the main file associated with the program also contains main
UsersTab.java update and display method for UsersTab listener
ProcessesTab.java update and display method for ProcessesTab listener
PerformanceTab.java update and display method for PerformanceTab listener
UsersTabFilterImpl.java check filter condition for UsersTab 
ProcessesTabFilterImpl.java check filter condition for ProcessesTab listener
PerformanceTabFilterImpl.java  check filter condition for PerformanceTabFilterImpl listener
DashboardSubject.java file to register, notify and remove observers and to start processing
FileProcessor.java -the file to read from an input file and write to an output file
MyLogger.java the file to validate command line arguments and print to standard output method

Interface-
DisplayFile.java file having method to display file
Subject.java file having methods to register remove and notify Observers
Observer.java file having update method for listeners
FileProcessorInterface.java file having methods to read from and write to file
DashboardFilter.java the file to check filter conditions

README.txt the text file you are presently reading
]

SAMPLE OUTPUT:

[

amogh@ubuntu:~/Documents/eclipse_workspace/taskManager/src$ ant -buildfile build.xml run
Buildfile: build.xml

jar:
    [mkdir] Created dir: /home/amogh/Documents/eclipse_workspace/taskManager/BUILD/jar
      [jar] Building jar: /home/amogh/Documents/eclipse_workspace/taskManager/BUILD/jar/taskManager.jar

run:
     [java] ---TAB(s) BEGIN---
     [java] displayFile of UsersTab called
     [java] ---USERS---
     [java] 
     [java] User: (unknown)  Status: inactive
     [java] User: root  Status: inactive
     [java] User: dgolemb1  Status: active
     [java] User: mslocum1  Status: active
     [java] User: ndangwa1  Status: active
     [java] User: awiesin1  Status: active
     [java] User: bsendir1  Status: active
     [java] User: tkargul1  Status: active
     [java] User: rashong1  Status: active
     [java] User: dgolemb1  Status: active
     [java] User: cigdebe1  Status: active
     [java] ---TAB(s) END---
     [java] ---TAB(s) BEGIN---
     [java] displayFile() of PerformanceTab called
     [java] ---PERFORMANCE---
     [java] Memory Total: 2058364  Memory Used: 1364884  Memory  Free: 693480  Memory  Cached: 1090952
     [java] CPU Idle: 94.9  CPU User Level: 4.3  CPU System Level: 0.5
     [java] displayFile of UsersTab called
     [java] ---USERS---
     [java] 
     [java] User: (unknown)  Status: inactive
     [java] User: root  Status: inactive
     [java] User: dgolemb1  Status: active
     [java] User: mslocum1  Status: active
     [java] User: ndangwa1  Status: active
     [java] User: awiesin1  Status: active
     [java] User: bsendir1  Status: active
     [java] User: tkargul1  Status: active
     [java] User: rashong1  Status: active
     [java] User: dgolemb1  Status: active
     [java] User: cigdebe1  Status: active
     [java] displayFile of ProcessesTab called
     [java] ---PROCESSES---
     [java]   PID COMMAND         USER     %CPU %MEM
     [java]  1881 gdb             dgolemb1  0.0  0.7
     [java]  3203 Xorg            root      0.0  0.1
     [java]  3994 getty           root      0.0  0.0
     [java]  3995 getty           root      0.0  0.0
     [java]  3996 getty           root      0.0  0.0
     [java]  3997 getty           root      0.0  0.0
     [java]  3998 getty           root      0.0  0.0
     [java]  3999 getty           root      0.0  0.0
     [java]  5393 tcsh            ndangwa1  0.0  0.1
     [java]  5975 tcsh            dgolemb1  0.0  0.1
     [java]  7377 bash            root      0.0  0.0
     [java]  7581 watch           root      0.0  0.0
     [java] 17264 gdb             dgolemb1  0.0  0.7
     [java] 17528 tcsh            bsendir1  0.0  0.1
     [java] 17674 bomb            dgolemb1  0.0  0.0
     [java] 18090 tcsh            tkargul1  0.0  0.1
     [java] 18108 nano            ndangwa1  0.7  0.2
     [java] 18116 tcsh            dgolemb1  0.0  0.1
     [java] 18151 python          bsendir1  1.1  0.4
     [java] 18196 sh              bsendir1  0.0  0.0
     [java] 18197 ps              bsendir1  0.0  0.0
     [java] 18666 bash            mslocum1  0.0  0.1
     [java] 27983 vim             mslocum1  0.0  0.8
     [java] 28029 tcsh            cigdebe1  0.0  0.1
     [java] 30920 tcsh            rashong1  0.0  0.1
     [java] 31023 gdb             rashong1  0.0  0.7
     [java] 31358 bomb            rashong1  0.0  0.0
     [java] 31444 tcsh            awiesin1  0.0  0.1
     [java] 32380 emacs           awiesin1  0.0  0.9
     [java] ---TAB(s) END---
     [java] ---TAB(s) BEGIN---
     [java] displayFile of UsersTab called
     [java] ---USERS---
     [java] 
     [java] User: (unknown)  Status: inactive
     [java] User: root  Status: inactive
     [java] User: dgolemb1  Status: active
     [java] User: mslocum1  Status: active
     [java] User: ndangwa1  Status: active
     [java] User: awiesin1  Status: active
     [java] User: bsendir1  Status: active
     [java] User: tkargul1  Status: active
     [java] User: rashong1  Status: active
     [java] User: dgolemb1  Status: active
     [java] User: cigdebe1  Status: active
     [java] ---TAB(s) END---
     [java] ---TAB(s) BEGIN---
     [java] displayFile of ProcessesTab called
     [java] ---PROCESSES---
     [java]   PID COMMAND         USER     %CPU %MEM
     [java]  1881 gdb             dgolemb1  0.0  0.7
     [java]  3203 Xorg            root      0.0  0.1
     [java]  3994 getty           root      0.0  0.0
     [java]  3995 getty           root      0.0  0.0
     [java]  3996 getty           root      0.0  0.0
     [java]  3997 getty           root      0.0  0.0
     [java]  3998 getty           root      0.0  0.0
     [java]  3999 getty           root      0.0  0.0
     [java]  5393 tcsh            ndangwa1  0.0  0.1
     [java]  5975 tcsh            dgolemb1  0.0  0.1
     [java]  7377 bash            root      0.0  0.0
     [java]  7581 watch           root      0.0  0.0
     [java] 17264 gdb             dgolemb1  0.0  0.7
     [java] 17528 tcsh            bsendir1  0.0  0.1
     [java] 17674 bomb            dgolemb1  0.0  0.0
     [java] 18090 tcsh            tkargul1  0.0  0.1
     [java] 18108 nano            ndangwa1  1.0  0.2
     [java] 18116 tcsh            dgolemb1  0.0  0.1
     [java] 18151 python          bsendir1  0.4  0.4
     [java] 18231 sh              bsendir1  0.0  0.0
     [java] 18232 ps              bsendir1  0.0  0.0
     [java] 18666 bash            mslocum1  0.0  0.1
     [java] 27983 vim             mslocum1  0.0  0.8
     [java] 28029 tcsh            cigdebe1  0.0  0.1
     [java] 30920 tcsh            rashong1  0.0  0.1
     [java] 31023 gdb             rashong1  0.0  0.7
     [java] 31358 bomb            rashong1  0.0  0.0
     [java] 31444 tcsh            awiesin1  0.0  0.1
     [java] 32380 emacs           awiesin1  0.0  0.9
     [java] ---TAB(s) END---
     [java] ---TAB(s) BEGIN---
     [java] displayFile() of PerformanceTab called
     [java] ---PERFORMANCE---
     [java] Memory Total: 2058364  Memory Used: 1365928  Memory  Free: 692436  Memory  Cached: 1090960
     [java] CPU Idle: 94.9  CPU User Level: 4.3  CPU System Level: 0.5
     [java] displayFile of ProcessesTab called
     [java] ---PROCESSES---
     [java]   PID COMMAND         USER     %CPU %MEM
     [java]  1881 gdb             dgolemb1  0.0  0.7
     [java]  3203 Xorg            root      0.0  0.1
     [java]  3994 getty           root      0.0  0.0
     [java]  3995 getty           root      0.0  0.0
     [java]  3996 getty           root      0.0  0.0
     [java]  3997 getty           root      0.0  0.0
     [java]  3998 getty           root      0.0  0.0
     [java]  3999 getty           root      0.0  0.0
     [java]  5393 tcsh            ndangwa1  0.0  0.1
     [java]  5975 tcsh            dgolemb1  0.0  0.1
     [java]  7377 bash            root      0.0  0.0
     [java]  7581 watch           root      0.0  0.0
     [java] 17264 gdb             dgolemb1  0.0  0.7
     [java] 17528 tcsh            bsendir1  0.0  0.1
     [java] 17674 bomb            dgolemb1  0.0  0.0
     [java] 18090 tcsh            tkargul1  0.0  0.1
     [java] 18108 nano            ndangwa1  1.3  0.2
     [java] 18116 tcsh            dgolemb1  0.0  0.1
     [java] 18151 python          bsendir1  0.3  0.4
     [java] 18269 sh              bsendir1  0.0  0.0
     [java] 18270 ps              bsendir1  0.0  0.0
     [java] 18666 bash            mslocum1  0.0  0.1
     [java] 27983 vim             mslocum1  0.0  0.8
     [java] 28029 tcsh            cigdebe1  0.0  0.1
     [java] 30920 tcsh            rashong1  0.0  0.1
     [java] 31023 gdb             rashong1  0.0  0.7
     [java] 31358 bomb            rashong1  0.0  0.0
     [java] 31444 tcsh            awiesin1  0.0  0.1
     [java] 32380 emacs           awiesin1  0.0  0.9
     [java] ---TAB(s) END---

BUILD SUCCESSFUL
Total time: 0 seconds


]

TO COMPILE:

[
  ant -buildfile src/build.xml all
]

TO RUN:

[
  ant -buildfile src/build.xml run
]

EXTRA CREDIT:

[
  Project running successfully on eclipse as well as using ANT. 
  DEBUG_VALUE=0 [Print to stdout everytime an exception is caught] 			
  DEBUG_VALUE=1 [Print to stdout output from dashboard is called]
  DEBUG_VALUE=2 [Print to stdout everytime a constructor is called] 
  DEBUG_VALUE=3 [Print to stdout everytime a method other than constructor is called] 

 
]

BIBLIOGRAPHY:

[

http://examples.javacodegeeks.com/core-java/lang/string/java-string-format-example/
http://examples.javacodegeeks.com/core-java/io/bufferedwriter/write-file-with-bufferedwriter-example/
http://www.java-examples.com/java-string-split-example
http://java.dzone.com/articles/hashmap

]

ACKNOWLEDGEMENT:
[

Prof. Madhusudhan Govindaraju
cs542.cs.binghamton.edu mailing list

]
