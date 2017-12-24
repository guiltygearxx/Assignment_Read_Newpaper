package androidapp.focus.hoangnam.assignment_read_newpaper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by huy.nquoc on 12/24/2017.
 */

public class NewsListViewAdapter extends ArrayAdapter<News> {

    private Context context;

    private News[] newsList;

    public NewsListViewAdapter(@NonNull Context context, int resource, @NonNull News[] newsList) {

        super(context, resource, newsList);

        this.context = context;

        this.newsList = newsList;
    }

    private News getNewsByIndex(int index) {

        return newsList[index];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        News news = this.getNewsByIndex(position);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.custom_list_view_newspaper, parent, false);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt_title);

        txtTitle.setText(news.getTitle());

        TextView txtAuthor = (TextView) rowView.findViewById(R.id.txt_author);

        txtAuthor.setText(news.getAuthor());

        return rowView;
    }
}
