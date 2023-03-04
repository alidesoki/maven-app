def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
            stage("init") {
                steps {
                    script {
                        gv = load "script.groovy"
                    }
                }
            }
            stage("build jar") {
                steps {
                    script {
                        gv = load "script.groovy"
                    }
                    sh "aws s3 ls"
                }
            }
            
            stage("build docker image") {
                steps {
                    script {
                        gv.buildJar()
                    
                    }
                }
            }
    }
}
