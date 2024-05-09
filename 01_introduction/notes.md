types of languages : procedural functions oop

procedural : well structured steps in program
functional : first class functions
oop : classes and objects

static vs dynamic languages

static : type checking at compile time; error at compile time; declaration of datatype; more control
dynamic : type checking at runtime; error after run; no declaration of datatype

memory management : stack and heap

** more than one reference variables can point towards the same object
** if any of the reference variables change the object it is going to be changed for all
** all the objects that do not have reference variables pointing towards them gets automatically deleted from the memory as garbage collection

flowchart & pseudocode

********************************* JAVA CODE EXECUTION ******************************


.java file (human readable) ==compiler==> .class file (byte code) ==interpreter==> machine code (0 1)

* .byte code can run on any system (platform independence) provided we have jvm installed in that system

JDK vs JRE vs JVM vs JIT

JDK :
environment to develop and run java program
dev tools
jre
compiler - javac
archiver - jar
docs generator - javadoc
interpreter/ loader

JRE :
enviroment to only run the program
deployment technologies
user interface toolkits
integration libraries
base libraries
jvm

JVM : 

class loader 
- loading : 
 - reads .class file and generates data
 - an object of this class is created in heap
- linking :
 - jvm verifies the .class file
 - allocates memory for class variables and default values
 - replace symbolic refrences from the type with direct references
- initialization :
 - all static variables are assigned with their values defined in the code and static block
jvm contains stack and heap memory allocations

jvm execution
- interpreter :
 - line by line execution
 - when one method is called many times it will interpret again and again

JIT :
direct machine code so no reinterpretation for repeated methods
faster execution
garbage collector