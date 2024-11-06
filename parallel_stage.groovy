pipeline {
    agent any

    stages {
        stage('Parallel Tasks') {
            parallel {
                stage('Build') {
                    steps {
                        echo 'Running Build Stage'
                        // Add build commands here
                        sh 'echo "Building..."'
                    }
                }

                stage('Unit Tests') {
                    steps {
                        echo 'Running Unit Tests'
                        // Add test commands here
                        sh 'echo "Running unit tests..."'
                    }
                }

                stage('Integration Tests') {
                    steps {
                        echo 'Running Integration Tests'
                        // Add integration test commands here
                        sh 'echo "Running integration tests..."'
                    }
                }
            }
        }
    }
}
