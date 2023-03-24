pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/gregory-paidis-sonarsource/AutomaticDetectionJenkins.git'
            }
        }
        stage('Print Environment Variables') {
            steps {
                sh 'printenv'
                
            }
        }
    }
}