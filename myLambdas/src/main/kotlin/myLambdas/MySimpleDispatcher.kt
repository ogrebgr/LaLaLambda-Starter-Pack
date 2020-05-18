package myLambdas

import ezlambda.misc.HttpMethod
import ezlambda.simple.SimpleLambdaDispatcher

class MySimpleDispatcher : SimpleLambdaDispatcher(true) {
    init {
        registerLambda("simple1", HttpMethod.GET, SimpleLambda1())
        registerLambda("simple2", HttpMethod.GET, SimpleLambda2())
    }
}