package com.motivity.api_gateway.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ErrorFilter extends ZuulFilter{

	private static org.slf4j.Logger log=LoggerFactory.getLogger(PostFilter.class);
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		  HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		    
		    log.info("ErrorFilter: " + String.format("response status is %d", response.getStatus()));
		return response;
	}

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
