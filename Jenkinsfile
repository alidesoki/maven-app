def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
            stage("init") {
                steps {
                    gv = load (script.groovy)
                }
            }
            stage("build jar") {
                steps {
                    script {
                        gv = load "script.groovy"
                    }
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
