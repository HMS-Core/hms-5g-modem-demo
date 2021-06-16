/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.utils;

import android.widget.Toast;

import com.huawei.MyApplication;

public class ToastUtil {
    public static void toast(String text) {
        Toast.makeText(MyApplication.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
