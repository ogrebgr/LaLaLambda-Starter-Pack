package myLambdas

import lalalambda.misc.HttpMethod
import lalalambda.simple.SimpleLambdaDispatcher

class MySimpleDispatcher : SimpleLambdaDispatcher(true) {
    init {
        registerLambda("simple1", HttpMethod.GET, SimpleLambda1())
        registerLambda("simple2", HttpMethod.GET, SimpleLambda2())
    }
}