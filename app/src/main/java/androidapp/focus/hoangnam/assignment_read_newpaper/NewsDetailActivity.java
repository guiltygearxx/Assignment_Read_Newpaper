package androidapp.focus.hoangnam.assignment_read_newpaper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by huy.nquoc on 12/24/2017.
 */

public class NewsDetailActivity extends AppCompatActivity {

    private News news;

    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.web_view_details);

        news = (News) getIntent().getSerializableExtra("news");

        webView = (WebView) findViewById(R.id.view_newspaper);
    }

    @Override
    protected void onResume() {

        super.onResume();

        webView.loadUrl(news.getUrl());
    }
}
