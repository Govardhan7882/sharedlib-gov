def call() {
    echo "Running SonarQube Analysis..."
    sh 'mvn sonar:sonar'
}
