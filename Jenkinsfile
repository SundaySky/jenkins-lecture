pipeline {
	agent { label 'blue' }	
	stages {
		stage('Parallel build') {
			parallel {
				stage('Build Dev') {					
					environment {
						ENV = "Dev"
					}
					steps {
						echo "Build $env.ENV"
						sleep 10		
					}
				}
				stage ('Build Production') {					
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
