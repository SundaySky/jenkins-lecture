pipeline {
	agent none
	parameters {
		booleanParam defaultValue: true, description: 'Whether to build production', name: 'buildProduction'
	}
	stages {
		stage('Build Dev') {
			agent {label 'agent1'}
			environment {
				ENV = "Dev"
			}
			steps {
				echo "Build $env.ENV"
				sleep 20
				echo "Double Build $env.ENV"
				sleep 20
				echo "triple Build $env.ENV"
				
			}
		}
		stage('Build Dev 2') {
			agent {label 'agent1'}
			environment {
				ENV = "Dev2"
			}
			steps {
				echo "Build $env.ENV"
				sleep 20
				echo "Double Build $env.ENV"
				sleep 20
				echo "triple Build $env.ENV"
				
			}
		}
		stage ('Build Production') {
			agent {label 'agent2'}
			environment {
				ENV = "Production"
			}
			when { 
				equals expected: true, actual: params.buildProduction 
			}
			steps {
				echo "Build $env.ENV"				
			}
		}
	}
}
