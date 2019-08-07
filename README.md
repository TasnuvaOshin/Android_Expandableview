# Android_Expandableview
Easy Android Expandable-view without any dependency . Easy Code and Easy Work Check out the code Bellow For Android Expandable View 



Main Method Behind it is :

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
    
    
    


    
    For Demo Check Out The Video 
    
   ![](https://tasnuvaoshin.com/ezgif-1-cc853ac954b7.gif)
