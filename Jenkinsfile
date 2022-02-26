 node {
      
  stage('Checkout from SVN') { checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Fly-20/POC']]]) }
  stage('Build Maven Project'){
   withMaven(maven : 'apache-maven-3.6.1') {
                bat'mvn clean compile'
            }}

  }
