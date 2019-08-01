package hongzhen.com.baselibrary.base;

/**
     * 开发者：hongzhen
     * 创建时间： 2019/7/31 19:28
     * 公司名称：
     * 类名：BaseRoute.java
     * 描述：路由跳转路径
     * 路径至少两级以上
     */
public final class BaseRoute {
    /**
     * 常见异常：
     * 1、Error: Program type already present: com.alibaba.android.arouter.routes.ARouter$$Group$$arouter
     *  原因：查看所有moudle中的路径配置，是否包含arouter，Arouter中的AutowiredServiceImpl类已经使用了/arouter/service/autowired这个路径
     *  所有冲突了。
     * 2、Error: Program type already present: com.alibaba.android.arouter.routes.ARouter$$Group$$Main，最后这个Main是自己定义的，可能不一样
     * 原因：查看所有moudle中，看看path的一级是否存在两个以上moudle使用Main的情况。
     * 3、运行异常：com.alibaba.android.arouter.exception.HandlerException: ARouter::Parameter is invalid!
     * 原因：可能是使用的path只有一级，如：ARouter.getInstance().build(BaseRoute.BB.LibraryB).navigation();
     */
    //LibraryA中使用
    public final class AA{
        public final static String LibraryA="/LibraryA";
        public final static String Home=LibraryA+"/Home";
//        public final static String Home="/Main"+"/Home";
        //出现2的异常
    }
    //主工程中使用
    public final class Main{
        public final static String Main="/Main";
        public final static String Work=Main+"/Work";
//        public final static String Work="arouter"+"/Work";
        //出现1的异常
    }
    //LibraryB中使用
    public final class BB{
        public final static String LibraryB="/LibraryB";
        public final static String New=LibraryB+"/New";
    }
}
