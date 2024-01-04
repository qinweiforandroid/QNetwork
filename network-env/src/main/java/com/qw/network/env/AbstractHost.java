package com.qw.network.env;

/**
 * Created by qinwei on 2020/7/6 7:11 PM
 * email: qinwei_it@163.com
 * 接口环境抽象
 *
 * @author qinwei
 */
public abstract class AbstractHost {
    private static int mEnv = Env.ENV_RELEASE;

    public static void setEnv(int env) {
        mEnv = env;
    }

    /**
     * 获取接口地址
     *
     * @return
     */
    public String host() {
        switch (mEnv) {
            case Env.ENV_DEV:
                return dev();
            case Env.ENV_ALPHA:
                return qa();
            case Env.ENV_BETA:
                return beta();
            case Env.ENV_RELEASE:
                return release();
            default:
                return "";
        }
    }

    /**
     * 开发环境host
     *
     * @return
     */
    public abstract String dev();

    /**
     * 测试环境host
     *
     * @return
     */
    public abstract String qa();

    /**
     * 公测环境host
     *
     * @return
     */
    public abstract String beta();

    /**
     * 正式环境host
     *
     * @return
     */
    public abstract String release();
}