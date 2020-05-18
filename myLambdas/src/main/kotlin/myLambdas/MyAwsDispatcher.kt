package myLambdas

import lalalambda.aws.AwsLambdaDispatcher
import lalalambda.misc.HttpMethod

class MyAwsDispatcher : AwsLambdaDispatcher(true) {
    init {
        registerLambda("aws1", HttpMethod.GET, AwsLambda1())
        registerLambda("aws2", HttpMethod.GET, AwsLambda2())
    }
}