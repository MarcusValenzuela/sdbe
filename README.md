# Getting Started with the Sun Devil Book Exchange (SDBE) Repository

Welcome to the Sun Devil Book Exchange repository! This guide will walk you through the steps to set up the project on your local machine.

## Prerequisites

Before you begin, ensure you have the following installed:

1. **Java Development Kit (JDK) 17**: 
   - Download from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or use an open-source version like OpenJDK.

2. **Apache Maven**:
   - Download from the [Maven website](https://maven.apache.org/download.cgi) and follow the installation instructions.

3. **Git**:
   - Install Git from [git-scm.com](https://git-scm.com/).

4. **Visual Studio Code** (optional, but recommended):
   - Download from [Visual Studio Code](https://code.visualstudio.com/).

## Cloning the Repository

1. Open your terminal (or command prompt).
2. Navigate to the directory where you want to clone the repository.
3. Run the following command:
 git clone https://github.com/MarcusValenzuela/sdbe.git
4. Navigate into the cloned repository
cd sdbe

Setting Up Environment Variables

1. JAVA_HOME:
Open your terminal.
Set the JAVA_HOME variable to point to your JDK installation:
$env:JAVA_HOME = "C:\Program Files\Java\jdk-17"

2. JAVA_FX_SDK:
Set the JAVA_FX_SDK variable to point to your JavaFX SDK installation:
$env:JAVA_FX_SDK = "C:\Program Files\Java\javafx-sdk-17.0.13"

3. Building the Project
Make sure you are in the root directory of the project (where the pom.xml file is located).
Run the following command to compile and package the project:
mvn clean package

4. Running the Project
After a successful build, you can run the project using the following commands:
mvn clean
mvn compile
mvn package
mvn spring-boot:run

make sure your localhost is "http://localhost:8080/"


Troubleshooting
If you encounter issues with JavaFX not being found, ensure that the JAVA_FX_SDK path is correctly set and points to the lib directory of the JavaFX SDK.
For any other errors, check the error messages in the terminal and ensure all dependencies are correctly defined in the pom.xml file.


Contributing
If you would like to contribute to this project, please fork the repository and create a pull request with your changes.
