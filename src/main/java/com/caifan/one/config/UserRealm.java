package com.caifan.one.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm  extends AuthorizingRealm {
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        //假设数据可的用户和密码
        String name="admin";
        String password="123456";

        UsernamePasswordToken ustoken = (UsernamePasswordToken)authenticationToken;
        if(!ustoken.getUsername().equals(name)) {
            //用户名不存在.底层默认抛出UnknownAccountException
            return null;
        }

        //判断密码
        return new SimpleAuthenticationInfo("",password,"");
    }
}
