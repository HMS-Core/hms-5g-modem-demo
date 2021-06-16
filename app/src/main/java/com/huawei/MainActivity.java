/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei;

import android.os.Handler;

import com.huawei.hms5gkit.R;
import com.huawei.hms5gkit.activitys.base.PermissionBaseActivity;
import com.huawei.hms5gkit.activitys.impl.HmsKitActivity;

public class MainActivity extends PermissionBaseActivity {
    @Override
    public void initView() {
        requestPermission();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void requestPermission() {
        int time = 500; // Set the waiting time in milliseconds
        verifyStoragePermissions(flag -> {
            Handler handler = new Handler();
            // When the timer ends, jump to the HmsKitActivity
            handler.postDelayed(() -> gotoActivity(HmsKitActivity.class, true), time);
        });
    }
}
