package app.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import app.entity.User;

@Configuration
public class MyRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(MyRealm.class);

    /**
     * 用于认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       logger.info("执行认证。。。");
    	
    	// 取出登录用户名字
        String username = (String) authenticationToken.getPrincipal();

        // 根据名字查询数据库得到密码
        User user = getPassword(username);

        // 如果查询为空就返回空 抛出org.apache.shiro.authc.UnknownAccountException
        if (null == user) {
            return null;
        }

        // 查询到就组装信息返回 密码错误抛出：org.apache.shiro.authc.IncorrectCredentialsException
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(user.getSalt()), this.getClass().getName());

        return info;
    }

    /**
     * 用于授权
     *
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    	logger.info("执行授权。。。。");
    	// 取出身份信息
        User user = (User) principalCollection.getPrimaryPrincipal();

        // 查询数据库获取该用户的权限信息
        List<String> permiss = getPermiss(user.getUsername());

        // 组装授权信息 没有权限抛出:org.apache.shiro.authc.IncorrectCredentialsException
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        info.addStringPermissions(permiss);

        return info;
    }

    /**
     * 模拟数据库查询认证信息
     *
     * @param username
     * @return
     */
    private User getPassword(String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("749d3c663c547ddf1ec5f7a39a7cef19");
        user.setSalt("salt1");
        return user;
    }


    /**
     * 模拟数据库查询授权信息
     *
     * @param username
     * @return
     */
    private List<String> getPermiss(String username) {
        List<String> permis = new ArrayList<String>();
        permis.add("user:create");
        permis.add("user:query");
        return permis;
    }

}
