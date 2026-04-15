def call() {
    echo "Deploying Artifact to Nexus..."
    sh 'mvn deploy'
}
