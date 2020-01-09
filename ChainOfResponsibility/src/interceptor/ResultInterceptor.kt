package interceptor

import Chain
import Interceptor

class ResultInterceptor : Interceptor {
    override fun intercept(chain: Chain): String? {
        var request = chain.request()
        request += "向客户端返回数据"
        //找到数据，直接返回
        return request
    }
}