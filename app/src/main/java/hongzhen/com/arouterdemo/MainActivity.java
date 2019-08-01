package hongzhen.com.arouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import hongzhen.com.baselibrary.base.BaseRoute;
/**
     * 开发者：hongzhen
     * 创建时间： 2019/8/1 10:50
     * 公司名称：
     * 类名：MainActivity.java
     * 描述：
     */
@Route(path = BaseRoute.Main.Work)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_main_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(BaseRoute.AA.Home).navigation();
            }
        });
        findViewById(R.id.btn_main_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(BaseRoute.BB.LibraryB).navigation();
            }
        });
    }
}
