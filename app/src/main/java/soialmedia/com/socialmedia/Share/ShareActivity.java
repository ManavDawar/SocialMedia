package soialmedia.com.socialmedia.Share;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import soialmedia.com.socialmedia.R;
import soialmedia.com.socialmedia.Utils.BottomNavigationViewHelper;

public class ShareActivity extends AppCompatActivity{
    private static final String TAG = "ShareActivity";
    private static final int Activity_NUM=2;


    private Context mContext = ShareActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");

        setupBottomNavigationView();
    }

    //Bottom Navigation view Setup
    private void setupBottomNavigationView(){
        Log.d(TAG, "setBottomNavigationView: setting up BottomNavigation");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem= menu.getItem(Activity_NUM);
        menuItem.setChecked(true);
    }
}
