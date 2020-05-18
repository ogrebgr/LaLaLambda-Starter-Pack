package myLambdas

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2ProxyResponseEvent
import lalalambda.aws.AwsLambda
import lalalambda.aws.AwsRequestData

class AwsLambda1 : AwsLambda {
    override fun handleRequest(input: AwsRequestData): APIGatewayV2ProxyResponseEvent {
        val ret = APIGatewayV2ProxyResponseEvent()
        ret.statusCode = 200
        ret.body = "presni i chudesni"
        ret.headers = mapOf("Content-type" to "text/plain")

        return ret
    }

}