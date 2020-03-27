def info(message) {
    stage('Test') {
        def src = new org.sharedlib.notification()
        echo "Testing"
        src.info(message)
    }
}