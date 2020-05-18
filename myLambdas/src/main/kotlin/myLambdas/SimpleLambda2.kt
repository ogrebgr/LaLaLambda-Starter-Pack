package myLambdas

import lalalambda.simple.SimpleLambda
import lalalambda.simple.SimpleRequestContext
import lalalambda.simple.SimpleResponse
import lalalambda.simple.SimpleResponseBuilder

class SimpleLambda2 : SimpleLambda {
    override fun handleRequest(input: SimpleRequestContext): SimpleResponse {
        val b = SimpleResponseBuilder(200)
        b.addHeader("Content-type", "text/plain")
        b.body("hrupkawi lajna, but simple")

        return b.build()
    }

}