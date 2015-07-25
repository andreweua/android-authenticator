package com.orogersilva.authenticator;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by RogerSilva on 7/25/2015.
 */
public class Authenticator {

    // region INSTANCE VARIABLES

    private Context context;
    private RequestQueue requestQueue;

    private String address;
    private String username;
    private String password;

    // endregion

    public Authenticator(Context context, String address, String username, String password) {

        this.context = context;
        requestQueue = Volley.newRequestQueue(this.context);

        setAddress(address);
        setUsername(username);
        setPassword(password);
    }

    // region GETTERS AND SETTERS

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void authenticate() {

        StringRequest requestStr = new StringRequest(Request.Method.POST, address,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {


                    }
                },
                new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {


                    }
                }
        );

        requestQueue.add(requestStr);
    }

    // endregion
}
