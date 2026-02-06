pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9' // Nom de l'outil configuré dans Jenkins
    }

    stages {
        stage('Clone') {
            steps {
                echo 'Clonage du dépôt...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Création du JAR...'
                sh 'mvn package'
            }
        }
    }

    post {
        always {
            echo 'Fin du pipeline Jenkins.'
        }
    }
}
