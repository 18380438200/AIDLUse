package com.example.apple.aidluse;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Create by libo
 */
public class UserService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    //使用IGetUser之前，需要编译或运行一下，不然找不到接口
    private Binder binder = new IGetUser.Stub(){

        @Override
        public UserBean getUserBean(){
            return new UserBean("小王",23);
        }
    };
}
