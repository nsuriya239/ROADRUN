pipeline{
     agent any
     stages{
         stage('Build Started'){
             steps{
                slackSend color: "#FDDD08", message: "Build Started - ${env.JOB_NAME} BUILD_NUMBER ${env.BUILD_NUMBER} Started by  (<${env.BUILD_URL}|Open>)" 
             }
         }
        stage('clean'){
		steps{
            echo 'Cleaning steps'
            slackSend color: "#439FE0", message: "Cleaning project - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            withMaven(
                    // Maven installation declared in the Jenkins "Global Tool Configuration"
                    maven: 'MAVEN_HOME') {
                              // Run the maven build
                                bat 'mvn clean'
                   }
		 }
        }
         stage('test'){
		steps{
            echo 'Testing testcases'
            slackSend color: "#439FE0", message: "Test Started - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            withMaven(
                    // Maven installation declared in the Jenkins "Global Tool Configuration"
                    maven: 'MAVEN_HOME') {
                              // Run the maven build
                                bat 'mvn test'
                   }
		 }
        }
        stage('results'){
            steps{
                echo 'Archiving results'
                slackSend color: "#439FE0", message: "Archiving Started - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            //archiveArtifacts artifacts: '**/test-output/*.*', fingerprint: true
            }
        }
     }
     post {
         success{
             slackSend color: "good", message: "Build Success - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		echo 'Build Success'
         } 
	failure{
        slackSend color: "danger", message: "Build Failed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		echo 'Archiving results after failure'
		           // archiveArtifacts artifacts: '**/test-output/*.*', fingerprint: true
	} 
	always {
	            echo 'End of Automation Pipeline'
                slackSend color: "#FDDD08", message: "Build Finished - ${env.JOB_NAME} ${env.BUILD_NUMBER}"
 	 }
    }

}
