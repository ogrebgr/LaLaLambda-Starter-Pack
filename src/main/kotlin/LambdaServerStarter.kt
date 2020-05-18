import ezlambda.server.La3Server
import myLambdas.MySimpleDispatcher

fun main(args: Array<String>) {
    val lambdaServer = La3Server(MySimpleDispatcher())
    lambdaServer.start()
}