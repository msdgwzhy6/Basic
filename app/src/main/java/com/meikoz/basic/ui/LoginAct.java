package com.meikoz.basic.ui;

import com.meikoz.basic.R;
import basic2.base.adapter.ViewHolder;

import basic2.base.BaseAct;
import basic2.base.adapter.CommonAdapter;
import basic2.control.annotation.LayoutId;

/**
 * @USER: https://github.com/meikoz/
 * @DATE: 2017/5/18
 */
@LayoutId(R.layout.activity_splash)
public class LoginAct extends BaseAct {

    @Override
    protected void setupLayout() {
        new CommonAdapter<String>(this, R.layout.item_content_home) {
            @Override
            public void convert(ViewHolder helper, String item, int position) {
            }
        };
    }
}
