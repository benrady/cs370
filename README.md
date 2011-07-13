## Requirements

You will build a RESTful web service using Google App Engine that will help banks electronically clear checks. As part of the clearing process a HTTP POST request will be made to your web service, to the */checkclearing* path, and using the *application/json* content type. The body of this post will be a JSON array of amounts. Each entry in the array represents the 'amount' value that has been written into an individual check. Your response will be a JSON object containing keys that match the entries in the JSON array, and values that represent the amount of the check in integer cents.

### Example request
    [
        "one",
        "two and 50/100",
        “three dollars”
    ]

### Example response
    {
        "one": 100,
        "two and 50/100": 250,
        “three dollars” : 300
    }

## Grading

You will receive 1 cent in commissions for every check that you clear. Incorrect entries will be penalized 10 cents. Missing entries will not be penalized, so if your service cannot parse an amount in the array, you can simply ignore it when generating the response. Responses that fail or return invalid JSON will receive no commissions.

The check clearing process will run on a periodic basis throughout the duration of the course. The exact schedule will change as specified by the instructor. 

Final grades will be determined by the amount of commissions that each student has earned throughout the course. The amounts for each grade letter will be specified during the first class. They may be curved later if necessary.

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

#### Build from scratch and run
    gradle clean build gaeRun

## Basic git Commands

#### Clones this repository

    git clone https://github.com/benrady/cs370

#### Add files to be committed

    git add .

#### Commits added files with the given commit message

    git commit -m "A sample commit message"
