package ir.almasapps.javasimplelistview.Data;

import java.util.ArrayList;
import java.util.List;

import ir.almasapps.javasimplelistview.Model.App;
import ir.almasapps.javasimplelistview.R;

public class DataSource {

    public List<App> getAppsList(){

        ArrayList<App> appsList = new ArrayList<App>();
        appsList.add(new App("Facebook","Social Network","Mark Zuckerberg","Meta", R.drawable.facebook,"#FF35518D"));
        appsList.add(new App("Twitter","Social Network","Parag Agrawal","Twitter, Inc",R.drawable.twitter,"#FF1E9CEA"));
        appsList.add(new App("Pinterest","Image Sharing","Ben Silbermann","Pinterest, Inc",R.drawable.pinterest,"#FF9D1112"));
        appsList.add(new App("LinkedIn","Online Service Provider","Satya Nadella","Microsoft",R.drawable.linkedin,"#FF5A86A4"));
        appsList.add(new App("Whatsapp","Messenger Application","Mark Zuckerberg","Meta",R.drawable.whatsapp,"#FF10887A"));
        appsList.add(new App("Skype","Video Confrance","Niklas Zennström","Microsoft",R.drawable.skype,"#FF13A0EC"));
        appsList.add(new App("Instagram","Social Network","Adam Mosseri ","Meta",R.drawable.instagram,"#FFB16B73"));
        appsList.add(new App("Youtube","Video Sharing","Susan Wojcicki","Meta",R.drawable.youtube,"#FFDF2E25"));

        return appsList;
    }


}
