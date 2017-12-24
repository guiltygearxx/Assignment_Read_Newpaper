package androidapp.focus.hoangnam.assignment_read_newpaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView newsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initListView();
    }

    private void initListView() {

        newsListView = (ListView) findViewById(R.id.list_data_newspaper);

        final News[] newsList = this.getNewsList();

        NewsListViewAdapter listViewAdapter =
                new NewsListViewAdapter(this, R.layout.custom_list_view_newspaper, newsList);

        newsListView.setAdapter(listViewAdapter);

        final MainActivity this_ = this;

        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                this_.viewNewsDetail(newsList[position]);
            }
        });
    }

    private News[] getNewsList() {

        return new News[]{

                new News("Vietnamnet's Home page", "Vietnamnet", "http://www.vietnamnet.vn/"),
                new News("Google's Home page", "Vietnamnet", "https://www.google.com.vn/"),
                new News("Show Loader To Open Url In WebView", "Android Example",
                        "https://www.androidexample.com/Show_Loader_To_Open_Url_In_WebView__-_Android_Example/index.php?view=article_discription&aid=125")
        };
    }

    private void viewNewsDetail(News news) {

        Intent intent = new Intent(this, NewsDetailActivity.class);

        intent.putExtra("news", news);

        startActivity(intent);
    }
}
