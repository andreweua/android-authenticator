package rogersilva.androidauthenticator.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.orogersilva.authenticator.Authenticator;

import rogersilva.androidauthenticator.R;

/**
 * Created by RogerSilva on 7/25/2015.
 */
public class MainFragment extends Fragment {

    // region INSTANCE VARIABLES

    private OnAuthenticatedListener mListener;

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    // endregion

    // region INTERFACES

    public interface OnAuthenticatedListener {
        public void onAuthenticated();
    }

    // endregion

    // region FRAGMENT LIFECYCLE METHODS

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        try {

            mListener = (OnAuthenticatedListener) activity;
        }
        catch (ClassCastException e) {

            throw new ClassCastException(activity.toString() + " must implement OnAuthenticatedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_authentication, container, false);

        usernameEditText = (EditText) view.findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) view.findViewById(R.id.password_edit_text);
        loginButton = (Button) view.findViewById(R.id.login_button);

        loginButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                Authenticator authenticator = new Authenticator((Activity) mListener, "", username, password);

                authenticator.authenticate();
            }
        });

        return view;
    }

    // endregion
}
