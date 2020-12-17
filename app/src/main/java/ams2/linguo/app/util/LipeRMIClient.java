package ams2.linguo.app.util;

import android.os.AsyncTask;

import ams2.linguo.interfaces.ICourseQueries;
import ams2.linguo.interfaces.ITestQueries;
import ams2.linguo.model.Course;

import java.util.ArrayList;
import java.util.List;

import lipermi.handler.CallHandler;
import lipermi.net.Client;

public class LipeRMIClient extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids) {
        CallHandler callHandler = new CallHandler();
        String remoteHost = "90.170.204.160";
        int port = 2460;
        try {
            System.out.println("Loading connection...");
            Client client = new Client(remoteHost, port, callHandler);
            ITestQueries remoteObject = (ITestQueries)client.getGlobal(ITestQueries.class);
            if (client != null) {
                System.out.println("Connection successful\n");
                System.out.println("Querying data...\n");
                System.out.println(remoteObject.getHelloWorld());
                System.out.println();
            }
            client.close();
            System.out.println("Connection closed successfully");
        } catch (Exception e) {
            System.out.println("AYYYYYYYYY LMAO");
            e.printStackTrace();
        }
        return "HOLA";
    }

}
