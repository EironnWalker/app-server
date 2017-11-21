package com.weds.antd.appserver.filter;

import com.weds.antd.appserver.cons.FilterConstants;
import com.weds.antd.appserver.utils.JWTUtils;
import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.ResponseFacade;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.util.Strings;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Order(1)
public class AuthorizationFilter implements Filter {

    private static final Log log = LogFactory.getLog(AuthorizationFilter.class);

    private static List<Pattern> patterns = new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("start authorization filter...");
        Pattern p = Pattern.compile(FilterConstants.UN_FILTER_LOGIN_PATH);
        patterns.add(p);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String url = ((RequestFacade) request).getRequestURI();
        if (isInclude(url)) {
            filterChain.doFilter(request, response);
        } else {
            // 执行登录验证
            final String authorization = ((RequestFacade) request).getHeader(HttpHeaders.AUTHORIZATION);
            if (!Strings.isNullOrEmpty(authorization) && !authorization.contains("null")) {
                String[] strArray = authorization.split(" ");
                int result = JWTUtils.verifyTokenHMAC256(strArray[1]);
                if (1 == result) {
                    filterChain.doFilter(request, response);
                }
            } else {
                ((ResponseFacade) response).sendError(301,"Not Logged");
            }
        }
    }

    @Override
    public void destroy() {

    }

    /**
     * 是否需要过滤
     * @param url
     * @return
     */
    private boolean isInclude(String url) {
        for (Pattern pattern : patterns) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }
}
