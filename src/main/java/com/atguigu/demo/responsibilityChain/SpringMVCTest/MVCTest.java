package com.atguigu.demo.responsibilityChain.SpringMVCTest;

import org.springframework.web.servlet.DispatcherServlet;

public class MVCTest {
    public static void main(String[] args) {
    //    dispatcherServlet

        // 说明
        // 1.

        /**
         *  DispatcherServlet里面重要的方法
         *  protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
         *          HandlerExecutionChain mappedHandler = null;
         *
         *          mappedHandler = getHandler(processedRequest); // 获取到执行链 HandlerExecutionChain
         *
         *          mappedHandler.applyPreHandle(processedRequest, response)内部得到了 handlerInterceptor interceptor
         *          // 调用了拦截器的 interceptor.preHandle(request, response, this.handler)
         *
         *          if (!mappedHandler.applyPreHandle(processedRequest, response)) {
         * 					return;
         *          }
         *          //
         *          mappedHandler.applyPostHandle(processedRequest, response, mv);
         *              //获得拦截器
         *              interceptor.postHandle(request, response, this.handler, mv);
         *
         *          // 说明：
         *          mappedHandler.applyPreHandle(processedRequest, response)的方法中还调用了
         *              方法
         *              triggerAfterCompletion(request, response, null);该方法中调用了
         *
         *               try {
         * 					interceptor.afterCompletion(request, response, this.handler, ex);
         *                                }
         * 				catch (Throwable ex2) {
         * 					logger.error("HandlerInterceptor.afterCompletion threw exception", ex2);
         *                }
         *
         *
         *
         *  }
         *
         *
         *
         */

    }


}
