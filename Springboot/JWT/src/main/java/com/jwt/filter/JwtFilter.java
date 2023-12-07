package com.jwt.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jwt.service.UserService;
import com.jwt.util.JwtUtil;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private UserService service;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String authHeader = request.getHeader("Authorization");
		String username =null;
		String token = null;
	     if(authHeader != null && authHeader.startsWith("Bearer ")) 
	     {
	    	 token = authHeader.substring(7);
	    	 username = jwtUtil.extractUsername(token);
	     }
	     if(username != null && SecurityContextHolder.getContext().getAuthentication()==null) {
	    	 UserDetails details = service.loadUserByUsername(username);
	    	 if(jwtUtil.validateToken(token, details)) {
	    		 UsernamePasswordAuthenticationToken authenticationToken = 
	    				 new UsernamePasswordAuthenticationToken(details,null,details.getAuthorities());
	    		 SecurityContextHolder.getContext().setAuthentication(authenticationToken);
	    	 }
	     }
	     filterChain.doFilter(request, response);
	}

}