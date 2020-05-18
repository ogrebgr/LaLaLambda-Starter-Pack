package myLambdas

import ezlambda.simple.SimpleLambda
import ezlambda.simple.SimpleRequestContext
import ezlambda.simple.SimpleResponse
import ezlambda.simple.SimpleResponseBuilder

class SimpleLambda1 : SimpleLambda {
    override fun handleRequest(input: SimpleRequestContext): SimpleResponse {
        val b = SimpleResponseBuilder(200)
        b.addHeader("Content-type", "text/plain")
        b.body("Presni i chudesni, but simple")

        return b.build()
    }

}