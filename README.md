### Class Setup
* Sign up for a [Google App Engine Account](https://appengine.google.com/start) if you don't already have one.
* Create a new app. Email me your app ID.
* Set the app id in *src/main/webapp/WEB-INF/appengine-web.xml* to your new app
* Update *build.gradle* with your account info in the gae/appcfg section.
* Run <code>./bin/gradle gaeUpload</code> to deploy your application.
