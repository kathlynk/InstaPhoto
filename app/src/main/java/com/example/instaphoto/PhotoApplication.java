package com.example.instaphoto;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class PhotoApplication extends Application {

    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        // Use for troubleshooting -- remove this line for production
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        // Use for monitoring Parse OkHttp traffic
        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        // See http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UX3zRPOyhHtXANaaL3BnwoofbonGExBayYxw2jgT")
                .clientKey("IKgh2V1KyHPU2W0LXppguWYfMuyp0agX1U7kQhkI")
                .server("https://parseapi.back4app.com")
                .build()
        );



        /**

        // New test creation of object below
        ParseObject testObject = new ParseObject("Task");
        testObject.put("username", "rick");
        testObject.put();
        testObject.saveInBackground();  **/
    }
}
