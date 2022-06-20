@Library("sharedlib")_
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                helloWorld("khadar","Thursday")
            }
        }
    }
}
