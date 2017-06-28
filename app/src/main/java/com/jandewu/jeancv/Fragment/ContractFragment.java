package com.jandewu.jeancv.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jandewu.jeancv.Model.MailItem;
import com.jandewu.jeancv.Model.PhoneItem;
import com.jandewu.jeancv.Model.WebItem;
import com.jandewu.jeancv.R;
import com.jandewu.jeancv.View.CvRow;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ContractFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    public ContractFragment() {
        // Required empty public constructor
    }
@BindView(R.id.contractFragmentContainer)
    LinearLayout container;

    // TODO: Rename and change types and number of parameters
    public static ContractFragment newInstance() {
        ContractFragment fragment = new ContractFragment();
        return fragment;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contract, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final PhoneItem phoneItem = new PhoneItem();
        CvRow phoneRow = new CvRow(getActivity(), phoneItem);
        container.addView(phoneRow);

        final MailItem mailItem = new MailItem("wartalski.jan@gmail.com");
        CvRow mailRow = new CvRow(getActivity(), mailItem);
        container.addView(mailRow);

        final WebItem webItem = new WebItem("www.google.pl");
        CvRow webRow = new CvRow(getActivity(), webItem);
        container.addView(webRow);





//        final MailItem mailItem = new MailItem();
//        CvRow mailRow = new CvRow(getActivity(), mailItem);
//        mailRow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mailItem.mail(getActivity());
//            }
//        });
//        container.addView(mailRow);


//        CvRow mailRow = new CvRow(getActivity(), new CVItem(R.drawable.ic_mail_outline_black_24dp, "wartalski.jan@gmail.com"));
//        container.addView(mailRow);
//
//        CvRow webRow = new CvRow(getActivity(), new CVItem(R.drawable.ic_language_black_24dp, "www.google.com"));
//        container.addView(webRow);
//    }

    }
}
