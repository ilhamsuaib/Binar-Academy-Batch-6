package id.ilhamsuaib.fragment.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import id.ilhamsuaib.fragment.R;
import id.ilhamsuaib.fragment.fragment.HomeFragment;
import id.ilhamsuaib.fragment.fragment.NotificationFragment;
import id.ilhamsuaib.fragment.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        navBottom = findViewById(R.id.bottom_nav);

        navBottom.setOnNavigationItemSelectedListener(this);

        String title = getResources().getString(R.string.home);
        commitFragmentTransaction(HomeFragment.newInstance(title), title);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragmentContainer = null;
        String title = "";
        //untuk menghandle ketika bottom menu diklik
        switch (item.getItemId()) {
            case R.id.nav_home:
                title = getResources().getString(R.string.home);
                fragmentContainer = HomeFragment.newInstance(getResources().getString(R.string.home));
                break;
            case R.id.nav_notification:
                title = getResources().getString(R.string.notification);
                fragmentContainer = NotificationFragment.newInstance(getResources().getString(R.string.notification));
                break;
            case R.id.nav_profile:
                title = getResources().getString(R.string.profile);
                fragmentContainer = ProfileFragment.newInstance(title);
                break;
        }
        commitFragmentTransaction(fragmentContainer, title);
        return true;
    }

    private void commitFragmentTransaction(Fragment fragment, String title) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment).commit();
        setTitle(title);
    }
}
