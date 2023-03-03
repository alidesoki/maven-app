pipeline {
    agent any
    environment {
        Version = '1.1.0'
    }
    parameters {
        
        choice(name: 'version', choices: ['1.1.0', '1.1.1', '1.1.2'], description: '')
        booleanParam(name: 'excuteTests', defaultValue: true, description: '')
    }
    stages {
            stage("build") {
                steps {
                    echo "building the application"
                    echo "building version ${Version}"
                }
            }
            stage("test") {
                when {
                    expression {
                        params.excuteTests
                    }
                }
                steps {
                    echo "testing the application"
                }
            }
            stage ("deploy"){
                steps {
                    echo "deploying the application"
                    echo "deploying app version ${params.version}"
                }
            }
    }
}