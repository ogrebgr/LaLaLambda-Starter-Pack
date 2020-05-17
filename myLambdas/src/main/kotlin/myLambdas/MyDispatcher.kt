package myLambdas

import lalalambda.generic.AwsLambdaDispatcher
import lalalambda.misc.HttpMethod

class MyDispatcher : AwsLambdaDispatcher(true) {
    init {
        registerLambda("l1", HttpMethod.GET, MyLambda1())
        registerLambda("l2", HttpMethod.GET, MyLambda2())
    }
}