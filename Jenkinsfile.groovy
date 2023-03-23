pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/<your-github-repo>.git'
            }
        }
        stage('Print Environment Variables') {
            steps {
                sh 'printenv'
            }
        }
    }
}