import interceptor.CacheInterceptor
import interceptor.ConnectInterceptor
import interceptor.ResultInterceptor

fun main() {
    var request = "网络请求"
    var interceptors = arrayListOf<Interceptor>()
    interceptors.add(CacheInterceptor())
    interceptors.add(ConnectInterceptor())
    interceptors.add(ResultInterceptor())
    //
    val realInterceptorChain = RealInterceptorChain(interceptors, 0, request)
    println(realInterceptorChain.process(request))
}