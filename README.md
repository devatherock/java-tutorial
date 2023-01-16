# java-tutorial
Java tutorial project for beginners

## Setup
- Download and install [eclipse](https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-ide-enterprise-java-and-web-developers)
- Open `Terminal`( `Cmd + Space` -> Type `Terminal` for Mac) 
- Navigate to any directory where you want the code downloaded
```
cd - To enter a directory
mkdir - To create a directory
ls - To list all files in the current directory
```
- Fork the project in Github to create a copy under your username
- Clone the project from Github
```
	git clone git@github.com:<your-username>/java-tutorial.git
```
- Open eclipse
- In the `Select a workspace` dialog, browse to a different workspace folder if required and click `OK`
- Open the import dialog
```
	File -> Import...
```
- Choose to import existing project
```
	Gradle -> Existing Gradle Project -> click 'Next'
```
- In the next window, browse to the path where you cloned the project and choose the `java-tutorial` folder
- Click `Finish`

## Before exercise
- In `Termial`, navigate inside `java-tutorial` folder
```
cd java-tutorial
```
- Create a new git branch named `exercise` to keep your changes separate
```
git checkout -b exercise
```

## Exercise
- In eclipse,  `Cmd + Shift + R`(or `Ctrl + Shift + R`) to launch the `Open Resource` dialog
- Type `HelloWorld` and open `HelloWorld.java`
- Replace the `TODO` lines with actual code


## Testing
To test if the code is correct
- In `Termial`, navigate to the `java-tutorial` folder
- Run `./gradlew clean test`

## To push changes from local machine to git
- Add the modified file to git
```
git add src/main/java/io/github/devatherock/javabasics/HelloWorld.java
```
- Commit the changes to local git index
```
git commit -m "feat: Completed exercise - HelloWorld"
```
- Push the branch `exercise` to remote git
```
git push origin exercise
```