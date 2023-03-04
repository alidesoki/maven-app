// def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
            stage("build jar") {
                steps {
                    script {
                        // gv = load "script.groovy"
                        echo "building the application"
                        sh 'mvn package'
                    }
                }
            }
            
            stage("build docker image") {
                steps {
                    script {
                        // gv.buildJar()
                        echo building docker image
                        withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                            sh 'docker build -t alidesoki/maven-app:1.1.2 .'
                            sh "echo $PASS | docker login -u $USER --password-stdin"
                            sh "docker push alidesoki/maven-app:1.1.2"
                        }
                    }
                }
            }
    }
}
