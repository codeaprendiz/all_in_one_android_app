package android.example.com.allinone;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link CardFlipActivity} and {@link
 * ScreenSlideActivity} samples.</p>
 */

/*
    My experience : To create a new instance of the fragment your return type should be android.support.v4.app.Fragment. This is only possible if
    the given fragment class extends andorid.support.v4.app.Fragment. If it rather extends Fragment class then you get the error whenever you try
     to create a fragment i.e in the return statement of other class( where you are creating the instance of this fragment class) and the error is
     required android.support.v4.app.Fragment
     found    [package name].name_of_this_fragment_class which is exactly correct


 */
public class ScreenSlidePageFragment extends android.support.v4.app.Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static android.support.v4.app.Fragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mPageNumber = getArguments().getInt(ARG_PAGE);
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.title_template_step, mPageNumber + 1));

        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */

}