node {
    echo 'Started my pipeline job'
    stage("Build") {
        deleteDir()
        scm checkout
        sh 'ls'
        sh 'mvn clean install'
        echo 'Building code here ...'
    }
    stage("Deploy") {
        echo 'Deploying artifacts here ...'
    }
    stage("Test") {
        echo 'Run the tests ...'
    }
}