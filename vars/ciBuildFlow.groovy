def call() {
    stage('Maven Build') {
        mavenBuild()
    }

    stage('SQ Report') {
        sonarReport()
    }

    stage('Deploy to Nexus') {
        nexusDeploy()
    }
}
