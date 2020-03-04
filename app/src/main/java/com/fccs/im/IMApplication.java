package com.fccs.im;

import android.app.Application;

import com.tencent.imsdk.TIMSdkConfig;
import com.tencent.qcloud.tim.uikit.TUIKit;
import com.tencent.qcloud.tim.uikit.config.CustomFaceConfig;
import com.tencent.qcloud.tim.uikit.config.GeneralConfig;
import com.tencent.qcloud.tim.uikit.config.TUIKitConfigs;

/**
 * Created on 2019-12-20 09:18
 * .
 *
 * @author yj
 * @org 浙江房超信息科技有限公司
 */
public class IMApplication extends Application {

    public static final int SDKAPPID = 1400293334;

    @Override
    public void onCreate() {
        super.onCreate();

        // 配置 Config，请按需配置
        TUIKitConfigs configs = TUIKit.getConfigs();
        configs.setSdkConfig(new TIMSdkConfig(SDKAPPID));

        TUIKit.init(this, SDKAPPID, configs);
    }
}
