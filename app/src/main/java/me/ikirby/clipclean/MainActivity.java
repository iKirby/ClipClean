package me.ikirby.clipclean;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ClipboardManager manager = getSystemService(ClipboardManager.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            manager.clearPrimaryClip();
        } else {
            manager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        Toast.makeText(this, R.string.cleaned, Toast.LENGTH_SHORT).show();

        finish();
    }
}