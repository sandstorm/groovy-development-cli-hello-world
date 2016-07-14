# groovy-development-cli-hello-world

The *runner* allows to run some parts and the tests of the project *hello-world*.
It has no source at all: only the *runner/build.gradle*.

Try it out!

```bash
./gradlew installApp
./run
> help
> exit
```

## How it works

The groovy-runner searches for the *hello-world/src/main/scriptGroovy/ScriptMain.groovy* to find the implementation of the commands.
Each command has some code executed at start and some at stop.

The *groovy-runner interpretes* the groovy source files from the project *hello-world* on demand.
Thus no compilation or restart is needed to execute the up-to-date code.
Just hit *ENTER* to repeat the latest command.

This makes testing and developing wicked fast.

## Requirements

* each file must contain one class only
* packages must match file system paths
* all dependencies of *hello-world* need to be compiled (might change in future)

## Future work

* Add example to show how to manage external dependencies of *hello-world* with the *groovy-runner*.
* We want to support the in-place interpretation of the groovy code for more than one sub-project.


