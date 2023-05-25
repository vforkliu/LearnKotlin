import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.produce

fun testProduceActor() {
    runBlocking {
        val receiveChannel: ReceiveChannel<Int> = produce {
            var i = 0
            while(true){
                delay(1000)
                send(i)
                i++
            }
        }
        delay(3000)
        receiveChannel.cancel()
        var sendChannel: SendChannel<Int> = actor<Int> {
            for (ele in channel)
                ele
        }


    }

}
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