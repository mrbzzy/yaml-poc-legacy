# yaml-poc

This POC depicts the use of Github Action with a sample Spring Boot app in order to deploy it on a Azure Repo.
Docker integration steps are enabled but it only pushes the image to a specifc private docker registry. 
PLEASE NOTE : Docker images is not pulled for deoployment Yet

Below are the steps for the Workflow


1.Sets up JDK

2. Mvn clean install

3. Creating a docker image and pushing it to docker hub

4. Uploading the artifact created by maven

5. Running Test on the code

6. SonarCloud Configuration

7. Downloading the Artifacts from github

8. Deploying the artifact on Azure Web App



End Point : https://yamlpoc.azurewebsites.net/yamlpoc 
