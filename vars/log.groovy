def call(String message) {
    //def info(message) {
    //echo "INFO: ${message}"
    //}
    def src = new org.sharedlib.notification()
    echo "Testing"
    src.info(message)
}
