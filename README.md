# bookstore

Running this Application:

Run:

mvn package

This will generate a war file in the target folder : bookstore.war

you can copy this file to your wildfly standalone deployments folder

alternatively uncomment the 

<outputDirectory>D:\Downloads\wildfly-21.0.0.Beta1\standalone\deployments</outputDirectory>

line in your pom.xml and update the path to your local wildlfy instance

mvn package will package the jar and copy it to the deployments folder