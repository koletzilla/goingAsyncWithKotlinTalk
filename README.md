# CommitConf 2018 - Going Async with Kotlin
This repository contains the code with the examples related to this talk. You can find more details of this talk here:

 - [CommitConf talk webpage.](https://www.koliseo.com/events/commit-2018/r4p/5630471824211968/agenda#/5734118109216768/5738303689064448)
 - [Slides.](https://www.slideshare.net/jmkolt/going-async-with-kotlin)

## Repository structure

### Server

You can find here a little [Ktor](https://ktor.io/) server, a nice and simple web framework built using Kotlin and coroutines. It will just receive the request and wait a parametrized time.

You can add the `server` folder to IntelliJ and run the `Main.kt` file. If you have Gradle installed, you should be able to use it to run the server:
```
gradle run
```
It should start the server at http://0.0.0.0:8080

### Client

You can find the code for the client in the `client` folder. It's a Gradle proyect as well, so the dependences are listed there. If you are using IntelliJ, you can run the code just executing the files that contains a **main** function. These functions are inside the abstractions folders.

#### Package structure

Inside `com.door4c.goingAsync.client` you will found some packages.

**common** contains common code, like the `TimeMeasurements` function and the HTTP request used.

The rest of packages contains mainly the code used in the slides. In order of appearance: `sync`, `callbacks`, `completableFutures`, `rxjava` and `coroutines`. All of them contains the same structure:

- **Requests**: functions that are wrapping the HTTP request in the `common` package using different abstractions.
- **(--packageName--)[0-9]***: Contains the different examples used in the code.

## About the time measurements.

All the examples are runned individually, so for each one of the executions, some time will be used just to initialize things like the Threads and other things related to the creation of the JVM. This will lead to some executions having an 'overhead' of 100-200 ms. If you want to get more precise results, edit the code and copy-paste the code inside the main functions one under another, like 4-5 times, so each time you execute a main function, the 2nd and next iterations of this code will reuse some things like the Threads created by the 1st code.
