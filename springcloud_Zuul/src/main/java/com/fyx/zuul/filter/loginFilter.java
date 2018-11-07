package com.fyx.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component  //服务启动时注册到spring容器中
public class loginFilter extends ZuulFilter {
    @Override
    public String filterType() {
         //当前过滤器的执行顺序
        return "pre";
    }

    @Override
    public int filterOrder() {
        //过滤器执行的等级，默认数值越小执行越靠前
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否执行过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //实现过滤器逻辑
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
         currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
