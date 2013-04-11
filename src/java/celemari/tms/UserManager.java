package celemari.tms;

import celemari.tms.vo.UserBean;

/**
 * 提供用户账户的管理服务。包括注册账户，登录，管理信息等。
 */
public interface UserManager{

    /**
     * 代表学生身份的常量
     */
    int ROLE_STUDENT = 1;
    /**
     * 代表导师身份的常量
     */
    int ROLE_TEACHER = 2;

    /**
     * 以用户名和密码注册用户
     *
     * @param username 用户名
     * @param password 密码
     * @param role 用户身份
     * @param info 用户信息
     * @return 用户对象
     */
    UserBean register(String username, String password, int role, Object... profile);

    /**
     * 以用户名和密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @param role 用户身份
     * @return 用户对象
     */
    UserBean login(String username, String password, int role);

    /**
     * 更新用户信息
     *
     * @param userBean 要更新的用户对象
     */
    void update(UserBean userBean);
}
