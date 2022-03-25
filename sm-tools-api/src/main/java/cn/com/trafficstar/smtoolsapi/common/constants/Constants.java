package cn.com.trafficstar.smtoolsapi.common.constants;

/**
 * 通用常量信息
 * 
 * @author ruoyi
 */
public class Constants
{
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    public static final String GBK = "GBK";

    /**
     * http请求
     */
    public static final String HTTP = "http://";

    /**
     * https请求
     */
    public static final String HTTPS = "https://";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "isAsc";

    /**
     * 系统用户授权缓存
     */
    public static final String ruoyi_AUTH_CACHE = "sys-authCache";

    /**
     * 参数管理 cache name
     */
    public static final String ruoyi_CONFIG_CACHE = "sys-config";

    /**
     * 参数管理 cache key
     */
    public static final String ruoyi_CONFIG_KEY = "ruoyi_config:";

    /**
     * 字典管理 cache name
     */
    public static final String ruoyi_DICT_CACHE = "sys-dict";

    /**
     * 字典管理 cache key
     */
    public static final String ruoyi_DICT_KEY = "ruoyi_dict:";

    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * 参数验证 sign密钥
     */
    public static final String SECRET_KEY = "ED97D71E016948189E6A271990CB7923";

    /*
     * RMI 远程方法调用
     */
    public static final String LOOKUP_RMI = "rmi://";

    /**
     * LDAP 远程方法调用
     */
    public static final String LOOKUP_LDAP = "ldap://";

    /**
     * 定时任务违规的字符
     */
    public static final String[] JOB_ERROR_STR = { "java.net.URL", "javax.naming.InitialContext", "org.yaml.snakeyaml",
            "org.springframework.jndi" };
}
