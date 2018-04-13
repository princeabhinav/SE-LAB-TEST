package flappybird.failedcoder.com.demo2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class forum extends Activity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        String username = getIntent().getStringExtra("NAME");
        webView = findViewById(R.id.forum);
        Log.i("DD",username);
        webView.getSettings().setJavaScriptEnabled(true);
        String uu = "https://se-forum.herokuapp.com/chat.html?name="+username+"&room=FORUM";
        webView.setWebViewClient(new MyBrowser());
        webView.loadUrl(uu);
        webView.setWebChromeClient(new WebChromeClient());
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url) {
            view.loadUrl(url);
            return true;
        }
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //ketika disentuh tombol back
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
              webView.goBack(); //method goback() dieksekusi untuk kembali pada halaman sebelumnya
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
