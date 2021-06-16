/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.activitys.base;

import android.os.Bundle;

public interface BaseViewInterface {
    void init(Bundle savedInstanceState);
    void initView();
    void initData();
    void initNav();
    void regReceiver();
    void unRegReceiver();
}
