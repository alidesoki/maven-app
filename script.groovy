def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t alidesoki/maven-app:1.1.2 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push alidesoki/maven-app:1.1.2"
    }
    }

return this