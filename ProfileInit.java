package apps.searchme.searchmeapplication.CompleteYourProfile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import apps.searchme.searchmeapplication.R;


public class ProfileInitFragment extends Fragment {
    private LinearLayout linearLayout, edu_linearLayout,con_linearLayout,buy_linearLayout,professional_linearLayout,publish_linearLayout,coworking_linearLayout,lookingfor_linearLayout,usemyself_linearLayout,riding_linearLayout,journey_linearLayout,express_linearLayout;
    private ImageButton imageButton, edu_imageButton,con_imageButton,buy_imageButton,professional_imageButton,publish_imageButton,coworking_imageButton,lookingfor_imageButton,usemyself_imageButton,riding_imageButton,journey_imageButton,express_imageButton;
    private int count1st = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_init, container, false);

        /*
        variable Initialization starts from here
         */
        linearLayout = view.findViewById(R.id.personal_info_expand);
        imageButton = view.findViewById(R.id.ib_personal_info);
        edu_linearLayout = view.findViewById(R.id.educational_info_expand);
        edu_imageButton = view.findViewById(R.id.ib_educational_info);
        con_linearLayout = view.findViewById(R.id.contact_info_expand);
        con_imageButton = view.findViewById(R.id.ib_contact_info);
        buy_linearLayout =view.findViewById(R.id.buy_info_expand);
        buy_imageButton =view.findViewById(R.id.ib_buy_info);
        professional_linearLayout = view.findViewById(R.id.professional_info_expand);
        professional_imageButton = view.findViewById(R.id.ib_professional_info);
        publish_linearLayout = view.findViewById(R.id.business_info_expand);
        publish_imageButton = view.findViewById(R.id.ib_business_info);
        coworking_linearLayout = view.findViewById(R.id.cowork_info_expand);
        coworking_imageButton = view.findViewById(R.id.ib_cowork_info);
        lookingfor_linearLayout = view.findViewById(R.id.lookingfor_info_expand);
        lookingfor_imageButton = view.findViewById(R.id.ib_lookingfor_info);
        usemyself_linearLayout = view.findViewById(R.id.usemyself_info_expand);
        usemyself_imageButton = view.findViewById(R.id.ib_usemyself_info);
        riding_linearLayout  = view.findViewById(R.id.riding_info_expand);
        riding_imageButton = view.findViewById(R.id.ib_riding_info);
        journey_linearLayout = view.findViewById(R.id.journeypartner_info_expand);
        journey_imageButton = view.findViewById(R.id.ib_journeypartner_info);
        express_linearLayout = view.findViewById(R.id.express_info_expand);
        express_imageButton = view.findViewById(R.id.ib_express_info);

        ExpandTheView(imageButton, linearLayout);
        ExpandTheView(edu_imageButton, edu_linearLayout);
        ExpandTheView(con_imageButton,con_linearLayout);
        ExpandTheView(buy_imageButton,buy_linearLayout);
        ExpandTheView(professional_imageButton,professional_linearLayout);
        ExpandTheView(publish_imageButton,publish_linearLayout);
        ExpandTheView(coworking_imageButton,coworking_linearLayout);
        ExpandTheView(lookingfor_imageButton,lookingfor_linearLayout);
        ExpandTheView(usemyself_imageButton,usemyself_linearLayout);
        ExpandTheView(riding_imageButton,riding_linearLayout);
        ExpandTheView(journey_imageButton,journey_linearLayout);
        ExpandTheView(express_imageButton,express_linearLayout);

        return view;
    }


    /*
    Expandable View Code
     */
    private void ExpandTheView(final ImageButton imageButton, final LinearLayout linearLayout) {

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1st == 0) {
                    linearLayout.setVisibility(View.VISIBLE);
                    imageButton.setImageResource(R.drawable.ic_expand_less_black_24dp);
                    count1st++;
                } else {

                    linearLayout.setVisibility(View.GONE);
                    imageButton.setImageResource(R.drawable.ic_expand_more_black_24dp);
                    count1st = 0;
                }
            }
        });

    }


}
