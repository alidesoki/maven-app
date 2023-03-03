def gv
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
            stage("init") {
                steps {
                    script {
                        gv = load "script.groovy"
                    }
                }
            
            stage("build") {
                steps {
                    script {
                        gv.buildJar()
                    }
                }
            }
            stage("test") {
                when {
                    expression {
                        params.excuteTests
                    }
                }
                steps {
                    script {
                        gv.buildImage()
                    }
                }
            }
            stage ("deploy"){
                steps {
                    script {
                        gv.deployApp()
                    }
                }
            }
    }
}