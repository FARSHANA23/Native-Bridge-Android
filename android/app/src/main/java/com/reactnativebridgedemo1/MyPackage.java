//registering the module otherwise it wont be available from javascript
package com.reactnativebridgedemo1;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyPackage implements ReactPackage{
    //this MyPackage needs  to be provided in MyApplication.java  in getPackages method
    @Override
    public List<ViewManager > createViewManagers(ReactApplicationContext reactContext){
        return Collections.emptyList();

    }
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext){
        return Arrays.<NativeModule>asList(
                new ToastModule(reactContext)
        );
    }
}