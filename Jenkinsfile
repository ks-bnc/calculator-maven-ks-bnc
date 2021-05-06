pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
        
        post {
            always{
                sh 'cd $WORKSPACE/multiscm-pipeline'
                sh 'chmod +x replace.sh'
                sh ('./replace.sh')
            }
        }   
}
