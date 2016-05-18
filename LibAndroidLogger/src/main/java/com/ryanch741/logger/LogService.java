package com.ryanch741.logger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by Ryan
 * On 2016/4/29.
 */
public class LogService extends Service {
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public IBinder onBind(Intent intent) {
        return new ILogService.Stub() {

            @Override
            public boolean path(String path, String prefix) throws RemoteException {
                AppLogger.init(LogService.this, path, prefix);
                return true;
            }

            @Override
            public boolean append(String line) throws RemoteException {
                AppLogger.append(LogService.this, line);
                return true;
            }

            @Override
            public boolean flush() throws RemoteException {
                AppLogger.flush(LogService.this);
                return true;
            }

            @Override
            public boolean clear(int beforeDay) throws RemoteException {
                AppLogger.clear(LogService.this, beforeDay);
                return true;
            }
        };
    }

    public static final String ACTION = "com.ryanch741.logger.ILogService";
}
