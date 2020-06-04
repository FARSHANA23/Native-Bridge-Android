package com.reactnativebridgedemo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.widget.Toast;

//created ToastModule Class that is  inherited from ReactContextBaseJavaModule
public class ToastModule extends ReactContextBaseJavaModule{
    //constructor
    public ToastModule(ReactApplicationContext.reactContext){
        super(reactContext);
    }
    //Mandatory fn getname that specifies modulename
    @Override
    //purpose of this fn is to return the String name of the NativeModule which represents this class in JS
    public String getName(){
        return "ToastModule";
    }
    //Custom fn that we are going to export to JavaScript
    //@ReactMethod is used to expose a function in javascript as all functions are not exposed to JavaScript explicitly. These methods are of void return type
    @ReactMethod

    //showToast will be the fn we will call in react-native JS code
    public void showToast(String Message){
      Toast.makeText(getReactApplicationContext(), Message, Toast.LENGTH_SHORT).show();
    }
}
