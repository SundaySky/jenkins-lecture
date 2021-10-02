pipeline {
	agent { label 'agent1'}
	triggers {
		pollSCM '* * * * *'
	}
	parameters {
		booleanParam defaultValue: true, description: 'Whether to build production', name: 'buildProduction'
	}
	stages {
		stage ('Parallel') {
			parallel {
				stage('Build Dev') {
					environment {
						ENV = "Dev"
					}
					steps {
						echo "Build $env.ENV"
						sleep 5			
					}
				}
				stage ('Build Production') {
					environment {
						ENV = "Production"
					}
					when { 
						equals expected: true, actual: params.buildProduction 
					}
					steps {
						echo "Build $env.ENV"
						sleep 5			
					}
				}
			}
		}
	}
}
