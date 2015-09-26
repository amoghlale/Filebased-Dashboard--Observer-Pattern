# Filebased-Dashboard--Observer-Pattern
Develop a file based dashboard for a TaskManager. There are three tabs on the dashboard for this
assignment.
Performance: It has the following information: Memory Total, Memory Used, Memory Free,
Memory Cached, CPU Idle, CPU User Level, CPU System Level.
Processes: It has the following information: PID, Command, User, %CPU, %MEM
Users: It has the following information: User name, Status.
Use the following to split the strings in the input files:

( * ) for tabs

( - ) if there are multiple items in the tab (multiple users and processes)

( : ) seperates fields of items

Data from the local file should be read by a single thread. So, do NOT design for a multi-threaded
application.
Use MyLogger (renamed the Debug class) in the following manner:

0: No output should be printed. Only error messages should be printed (for example, message from
a catch caluse before exiting).

1: Only ouput from the dashboard should be printed

2: Design on your own and mention in the README what is printed at this debug granularity

3: Design on your own and mention in the README what is printed at this debug granularity

4: Design on your own and mention in the README what is printed at this debug granularity
The following should be read from command line (or hardcoded in build.xml): inputFileName,
outputFileName, Logger_level

Program Flow

The Driver should create a Subject instance, 3 observers and their filters, and register the observers
and corresponding filters with the subject.

The Subject implementation should have an appropriate data structure to store observers and filters.

The Driver should then invoke a method on the Subject to get it started.

The Subject should use the FileProcessor to read a line at at time from the input file. The Subject
should use notifyAllObservers to send the string (entire line) to the appropriate listener, not all
listeners. However, if a line has data for more than one listener, then split the line correctly in the
Subject to send the appropriate data to each listener.. Use filter (programmed to an interface) so just
the appropriate method of the listener is called.

Each listener should use internal methods to process the data it has received, store it in a data
structure, and also write it to the output file using the method in the displayFile interface.

Code Organization

Your directory structure should be the following:

lastName_firstName_assign3

---taskManager

----- README.txt

----- src

---taskManager

----- build.xml

----------driver

----------Driver
[Driver: create the FileProcessor
instance(s), listeners, filterImpl
instances, and DashboardSubjectImpl;
register the listeners and filter with the
subject. In a loop, till end of file, use
the fileProcessor instance to read a line
at a time, ask the Subject impl to notify.
This loop can also be implemented in a
method of the Subject implementation,
startProcessing(...), instead of the
driver. Close the file in the same class in
which it was opened.]

----------util

----------FileProcessor
[methods to read a line and write a line]

----------subject

----------DashBoardSubject
[DashBoardSubject: use a data structure to
store observers and listeners, split an
input line if it has information for more
than one listener, add the Begin-Tab and
End-Tab strings, apply the filters and
accordingly update the listeners. It can
have a startProcessing(...) method, if
needed.]

----------Subject [interface]

----------observers

----------Observer [interface]

----------ProcessesTab
[ProcessTab: Implement the Observer and
DisplayFile. Contains a data structure to store
the parsed input. In the update method
implementation, parse the input string and add
it to the data structure. Next, in the update
method itself, call the method of the
DisplayFile interface to format the output as
needed. In this method of the DisplayInterface,
read from the data structure, format it as
required for the output file, and then write it
the output file using the method in the
FileProcessor.]

----------UsersTab

----------PerformanceTab

----------PerformanceTabFilterImpl
[Has one method, boolean check(String s); This
method implementation checks if the input string
has "Performance" as a substring. If so, it
returns "true" or else "false".]

----------UsersTabFilterImpl

----------ProcessesTabFilterImpl

----------display

----------DisplayFile [interface]

----------filter

----------DashboardFilter [interface]

----------other packages that you need
