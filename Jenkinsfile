node {
  stage('Checkout') {
    checkout scm
  }

  stage('Build') {
    sh './mvnw clean install'
  }

  stage('Test') {
    sh './mvnw test'
  }

  stage('Package') {
    sh './mvnw package'
  }
}


