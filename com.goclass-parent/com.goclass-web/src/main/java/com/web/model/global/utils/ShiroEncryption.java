package com.web.model.global.utils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 
 * @ClassName: ShiroEncryption
 * @Description: shiro密码加密工具类 
 * @Author pengdehe
 * @DateTime 2019年11月3日 上午11:19:06
 */
public class ShiroEncryption {
	
	// 加密次数
	private static int times = ShiroEncryptionProperties.TIMES;
	// 算法名称
	private static String algorithmName = ShiroEncryptionProperties.ALGORITHM_NAME;
	
	/**
	 * 
	 * @Title: shiroEncryption
	 * @Description: 对密码进行性md5+salt加密
	 * @Author pengdehe
	 * @DateTime 2019年11月3日 上午11:20:36
	 * @param password
	 * @param salt
	 * @return
	 */
	public static String shiroEncryption(String password,String salt) {		
		return new SimpleHash(algorithmName,password,salt,times).toString();		
	}
	/**
	 * 
	 * @Title: getSalt
	 * @Description: 随机生成salt
	 * @Author pengdehe
	 * @DateTime 2019年11月3日 上午11:20:30
	 * @return
	 */
	public static String getSalt() {
		return new SecureRandomNumberGenerator().nextBytes().toString();
	}
}
