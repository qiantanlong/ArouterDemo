package hongzhen.com.libraryb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import hongzhen.com.baselibrary.base.BaseRoute;
/**
     * 开发者：hongzhen
     * 创建时间： 2019/8/1 10:50
     * 公司名称：
     * 类名：LibraryBActivity.java
     * 描述：
     */
@Route(path = BaseRoute.BB.New)
public class LibraryBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_library_b);
        findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(BaseRoute.AA.Home).navigation();
                finish();
            }
        });

        findViewById(R.id.btn_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(BaseRoute.Main.Work).navigation();
                finish();
            }
        });
    }

}
