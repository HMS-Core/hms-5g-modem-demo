/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.activitys.common;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

import com.huawei.hms5gkit.R;

public class LoadingDialog extends Dialog {
    private TextView loadingTv;

    LoadingDialog(Context context) {
        super(context);

        setContentView(R.layout.dialog_loading);
        loadingTv = findViewById(R.id.loading_tv);
        setCanceledOnTouchOutside(false);
    }

    /**
     * Set different prompt messages for the loading progress dialog
     *
     * @param message Prompt information displayed to users
     * @return build Mode design, you can chain call
     */
    public LoadingDialog setMessage(String message) {
        loadingTv.setText(message);
        return this;
    }
}
