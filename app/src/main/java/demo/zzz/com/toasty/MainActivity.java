package demo.zzz.com.toasty;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import demo.zzz.com.mylibrary.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonErrorToast;
    private Button mButtonSuccessToast;
    private Button mButtonInfoToast;
    private Button mButtonWarningToast;
    private Button mButtonNormalToastWoIcon;
    private Button mButtonNormalToastWIcon;
    private Button mButtonCustomConfig;
    private ScrollView mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initView();
    }

    private void initView() {
        mButtonErrorToast=(Button) findViewById( R.id.button_error_toast );
        mButtonErrorToast.setOnClickListener( this );
        mButtonSuccessToast=(Button) findViewById( R.id.button_success_toast );
        mButtonSuccessToast.setOnClickListener( this );
        mButtonInfoToast=(Button) findViewById( R.id.button_info_toast );
        mButtonInfoToast.setOnClickListener( this );
        mButtonWarningToast=(Button) findViewById( R.id.button_warning_toast );
        mButtonWarningToast.setOnClickListener( this );
        mButtonNormalToastWoIcon=(Button) findViewById( R.id.button_normal_toast_wo_icon );
        mButtonNormalToastWoIcon.setOnClickListener( this );
        mButtonNormalToastWIcon=(Button) findViewById( R.id.button_normal_toast_w_icon );
        mButtonNormalToastWIcon.setOnClickListener( this );
        mButtonCustomConfig=(Button) findViewById( R.id.button_custom_config );
        mButtonCustomConfig.setOnClickListener( this );
        mActivityMain=(ScrollView) findViewById( R.id.activity_main );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_error_toast:
                Toasty.getInstance( MainActivity.this ).error(MainActivity.this, "This is an error toast.", Toasty.LENGTH_SHORT, true );
                break;
            case R.id.button_success_toast:
                Toasty.getInstance( MainActivity.this ).success(MainActivity.this, "This is an success toast.", Toasty.LENGTH_SHORT, true );
                break;
            case R.id.button_info_toast:
                Toasty.getInstance( MainActivity.this ).info(MainActivity.this, "This is an info toast.", Toasty.LENGTH_SHORT, true );
                break;
            case R.id.button_warning_toast:
                Toasty.getInstance( MainActivity.this ).warning(MainActivity.this, "This is an warning toast.", Toasty.LENGTH_SHORT, true );
                break;
            case R.id.button_normal_toast_wo_icon:
                Toasty.getInstance( MainActivity.this ).normal(MainActivity.this, "This is an normal toast.", Toasty.LENGTH_SHORT,null, false );
                break;
        }
    }
}
