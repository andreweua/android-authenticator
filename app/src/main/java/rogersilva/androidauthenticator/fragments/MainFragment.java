package rogersilva.androidauthenticator.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rogersilva.androidauthenticator.R;

/**
 * Created by RogerSilva on 7/25/2015.
 */
public class MainFragment extends Fragment {

    // region INSTANCE VARIABLES

    private OnAuthenticatedListener mListener;

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

        return inflater.inflate(R.layout.fragment_authentication, container, false);
    }

    // endregion
}
