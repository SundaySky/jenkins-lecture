pipeline {
	agent none	
	stages {
		stage('Parallel build') {
			parallel {
				stage('Build Dev') {
					agent { 
						label 'blue'
					}
					environment {
						ENV = "Dev"
					}
					steps {
						echo "Build $env.ENV"
						sleep 10		
					}
				}
				stage ('Build Production') {
					agent { 
						label 'blue'
					}
					environment {
						ENV = "Production"
					}					
					steps {
						echo "Build $env.ENV"	
						sleep 10			
					}
				}
			}
		}		
	}
}
