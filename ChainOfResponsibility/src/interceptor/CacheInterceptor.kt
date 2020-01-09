package interceptor

import Chain
import Interceptor

class CacheInterceptor : Interceptor {

    override fun intercept(chain: Chain): String? {
        var request = chain.request()
        request += "检查缓存，从缓存读取数据--->"
        request += "缓存无数据！"
        //假设这里没找到数据，向下一级请求
        //找到数据直接返回request
        return chain.process(request)
    }
}