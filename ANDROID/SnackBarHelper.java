import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;

/**
 * Created by yatnosudar on 6/11/15.
 */
public class Helper {

    public static void dismissKeyboard(Context context,EditText editText,boolean removeText){
        if (removeText){
            editText.setText("");
        }
        InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

  public static Snackbar snackbar(Context context,View view,String message){
        Snackbar snackbar = Snackbar.make(view,message,Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        TextView textView =  (TextView) snackBarView.findViewById(R.id.snackbar_text);
        textView.setTextColor(ContextCompat.getColor(context,android.R.color.white));
        snackbar.setActionTextColor(ContextCompat.getColor(context,android.R.color.holo_orange_light));

        return snackbar;
    }

    public static Snackbar snackbarListener(Context context,View view,String message,View.OnClickListener listener){
        Snackbar snackbar = Snackbar.make(view, message,Snackbar.LENGTH_LONG);
        snackbar.setAction("Coba lagi",listener);
        View snackBarView = snackbar.getView();
        TextView textView = (TextView) snackBarView.findViewById(R.id.snackbar_text);
        textView.setTextColor(ContextCompat.getColor(context,android.R.color.white));
        snackbar.setActionTextColor(ContextCompat.getColor(context,android.R.color.holo_orange_light));

        return snackbar;
    }
}
