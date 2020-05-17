pipeline
{
agent any
  stages
      {
        stage("clean")
        {
            steps
              {
                 bat 'mvn clean'
              }
        }
        stage("test")
        {
            steps
              {
                 bat 'mvn test'
               }
        }
       stage("package")
        {
            steps
              {
                  bat 'mvn package'
              }
        }
        stage("Consolidate Results")
        {
			      steps 
             {
				        input ("Do you want to capture results?")
				        junit '**/target/surefire-reports/TEST-*.xml'
				        archive 'target/*.jar'
			       }
		    }
		    stage("Email Build Status")
        {
			      steps 
            {
				       mail body: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult} \n\nCheck console output at ${env.BUILD_URL} to view the results.", subject: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult}!!", to: 'kalyan.veera536@gmail.com'
			      }
		    }
      }
 }
