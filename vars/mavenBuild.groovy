def call() {
    echo "Running Maven Build"
    bat 'mvn clean package -DskipTests'
}
