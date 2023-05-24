import kotlinx.coroutines.*
fun main(args: Array<String>) {
    GlobalScope.launch {
        println("Code run in coroutine scope")
    }
    Thread.sleep(1000)
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}