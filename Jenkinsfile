pipeline {
    agent any
    tools {
        maven 'Maven' // Nom de l'outil configuré dans Jenkins
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
                bat 'mvn clean compile'  // ✅ Changé de sh à bat
            }
        }
        stage('Test') {
            steps {
                echo 'Exécution des tests...'
                bat 'mvn test' 
            }
        }
        stage('Package') {
            steps {
                echo 'Création du JAR...'
                bat 'mvn package' 
            }
        }
    }
    post {
        always {
            echo 'Fin du pipeline Jenkins.'
        }
        success {
            echo 'Build réussi !'
        }
        failure {
            echo 'Build échoué !'
        }
    }
}
