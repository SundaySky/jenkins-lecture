
void buildEnv(env) {
    try {        
        echo "Building $env"        
    } catch (ex) {
        errorReason = "$ex"
        echo "${errorReason}"
    }
}
