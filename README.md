ElevatotAPI 
==================================================

This sample code is very much a work in progess. 
I have decided to leave it at this stage for now due to time constraints, so I am sorry that I couldn't add more functionality. 
Most of my time was given to learning and developing with technologies that were new to me.

Namely: 
AWS - CodeStar, CodeCommit, RDS, CodePipeline and CodeDeploy
SpringBoot - jdbc
Intellij - maven, tomcat server, aws plugin

I had not used most of these technologies previously, but I have really enjoyed learning and I will be sure to continue to work with them in this project and more, as I am truly excited by them.

The database settings are in the resources/application.properties file.
You can use the mysql database I have created in RDS, then you won't have to change anything.
Or you can create your own mysqldatabase and run the sample scripts provided in the project under the folder Database.

I have ran this in intellij using Tomcat 9.0.44 and have also successfully deployed to aws CodePipline.

To run locally, open pom.xml file with intellij, compile and build with maven and the run on a tomcat server.

I have also been using AWS CodeCommit and CodePipline to push to a repo, and AWS then creates a build and deploys it. Which I thought was just a brilliant tool.
