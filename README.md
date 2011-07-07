## Class Setup
* Sign up for a [Google App Engine Account](https://appengine.google.com/start) if you don't already have one.
* Create a new app. Name it whatever you like, but email me your application ID.
* Set the value of the &lt;application&gt; element in the file *src/main/webapp/WEB-INF/appengine-web.xml* to your new app id
* Set the value of the gae:appcfg:email property in *build.gradle* to the account you used to sign up for Google App Engine.
* Run <code>gradle gaeUpload</code> to deploy your application. You may be prompted for a password. This will be the password to the account you used to sign up for Google App Engine. _It may print this password in clear text, so be careful!_

## Basic Build Commands

You can use these commands to build, test, and deploy your application. Note that you must perform the steps listed above in "Class Setup" for some of them to work. Also note that these commands depend on [Gradle](http://www.gradle.org/), which may need to be installed and added to your PATH.

#### Get a list of all the available tasks
    gradle tasks

#### Compile and run tests
    gradle test

#### Run your application locally
    gradle gaeRun

#### Deploy your app to Google App Engine (This will prompt for a password)
    gradle gaeUpload

#### Generate an eclipse project
    gradle eclipse

## Basic git Commands

#### Clones this repository

    git clone https://github.com/benrady/cs370

#### Add files to be committed

    git add .

#### Commits added files with the given commit message

    git commit -m "A sample commit message"
