package cn.keking.anti_reptile.rule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kl @kailing.pub
 * @since 2019/7/8
 */
public interface AntiReptileRule {
    /**
     * 反爬规则具体实现
     * @param request
     * @param response
     * @return true为击中反爬规则
     */
    boolean execute(HttpServletRequest request, HttpServletResponse response);

    /**
     * 重置已记录规则
     * @param request
     * @param realRequestUri
     * @retun
     */
    void reset(HttpServletRequest request, String realRequestUri);

    /**
     * 规则优先级
     * @return
     */
    int getOrder();
}
