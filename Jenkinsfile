pipeline {
    agent any
    environment {
        Version = '1.1.0'
    }
    stages {
            stage("build") {
                steps {
                    echo "building the application"
                    echo "building version ${Version}"
                }
            }
            stage("test") {
                steps {
                    echo "testing the application"
                }
            }
            stage ("deploy"){
                steps {
                    echo "deploying the application"
                }
            }
    }
}