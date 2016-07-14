import de.sandstormmedia.groovyDevelopmentCli.HelloWorld
import de.sandstormmedia.groovyrunner.ApplicationDescriptor

class ScriptMain extends ApplicationDescriptor {

    /**
     * implementation of help command
     */
    public void help() {
        println "help                 shows this help"
        println "test                 runs all tests"
        println "test regex           runs all tests which full qualified name contains regex"
        println "helloWorld           runs the hello world code"
    }

    /**
     * executed at start of helloWorld
     */
    public void helloWorldStartCommand() {
        println(new HelloWorld())
    }

    /**
     * executed at stop, exit or before start of next command
     */
    public void helloWorldStopCommand() {}
}
