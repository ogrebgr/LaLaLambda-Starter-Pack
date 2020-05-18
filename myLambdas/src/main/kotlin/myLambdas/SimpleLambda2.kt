package myLambdas

import ezlambda.simple.SimpleLambda
import ezlambda.simple.SimpleRequestContext
import ezlambda.simple.SimpleResponse
import ezlambda.simple.SimpleResponseBuilder

class SimpleLambda2 : SimpleLambda {
    override fun handleRequest(input: SimpleRequestContext): SimpleResponse {
        val b = SimpleResponseBuilder(200)
        b.addHeader("Content-type", "text/plain")
        b.body("hrupkawi lajna, but simple")

        return b.build()
    }

}