def notify = new org.sharedlib.notification()

def info(message) {
    notify.notificationInfo(message)
}

def warning(message) {
    notify.notificationWarn(message)
}