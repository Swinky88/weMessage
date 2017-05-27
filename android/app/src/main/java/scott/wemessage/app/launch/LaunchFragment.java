package scott.wemessage.app.launch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import scott.wemessage.R;
import scott.wemessage.app.view.button.FontButton;

public class LaunchFragment extends Fragment {

    private FontButton signInButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_launch, container, false);

        return view;
    }
}
