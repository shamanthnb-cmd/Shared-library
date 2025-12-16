def call(String imageName, String tag) {
    echo "Building Docker Image"
    bat "docker build -t ${imageName}:${tag} ."
}
