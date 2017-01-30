package alexis.defranoux.channelmessaging;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by defranoa on 30/01/2017.
 */
public class MessageAdapter extends ArrayAdapter<Message> {

    TextView txtMessage;
    TextView txtNom;

    public MessageAdapter(Context context, int resource, int textViewResourceId, List<Message> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_message, parent, false);

        txtMessage = (TextView) rowView.findViewById(R.id.txtMessage);
        txtMessage.setText(getItem(position).message);

        txtNom = (TextView) rowView.findViewById(R.id.txtNom);
        txtNom.setText(getItem(position).username);

        return rowView;
    }

}
