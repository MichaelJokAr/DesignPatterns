package interceptor

import Chain
import Interceptor

class ConnectInterceptor:Interceptor {
    override fun intercept(chain: Chain): String? {
        var request = chain.request()
        request += "链接成功，处理服务器返回数据...."
        //假设这里没找到数据，向下一级请求
        //找到数据直接返回request
        return chain.process(request)
    }
}