class RealInterceptorChain(
    var interceptors: ArrayList<Interceptor>,
    var index: Int,
    var request: String?
) : Chain {

    override fun request(): String? {
        return "$request\n"
    }


    override fun process(request: String?): String? {
        if (interceptors.isNullOrEmpty() || index >= interceptors.size) {
            return request
        }
        val next = RealInterceptorChain(interceptors, index + 1, request)
        //获取当前拦截器
        val interceptor = interceptors[index]
        //执行当前拦截器操作
        return interceptor.intercept(next)
    }
}