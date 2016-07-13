import de.sandstormmedia.groovyDevelopmentCli.HelloWorld
import de.sandstormmedia.groovyrunner.ApplicationDescriptor

class ScriptMain extends ApplicationDescriptor {

    public void helloWorldStartCommand() {
        println(new HelloWorld())
    }

    public void helloWorldStopCommand() {}
}
