package myLambdas

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2ProxyResponseEvent
import lalalambda.generic.AwsLambda
import lalalambda.generic.AwsRequestData

class MyLambda2 : AwsLambda {
    override fun handleRequest(input: AwsRequestData): APIGatewayV2ProxyResponseEvent {
        val ret = APIGatewayV2ProxyResponseEvent()
        ret.statusCode = 200
        ret.body = "hrupkawi lajna"
        ret.headers = mapOf("Content-type" to "text/plain")

        return ret
    }

}