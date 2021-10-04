
pipeline {
	agent any
	triggers {
		pollSCM '* * * * *'
	}
	parameters {
		booleanParam defaultValue: true, description: 'Whether to build production', name: 'buildProduction'
	}
	stages {
		stage('Build Dev') {
			environment {
				ENV = "Dev"
			}
			steps {
				echo "Build $env.ENV"				
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
			}
		}
	}
}
