package com.example.akshay.farmconnect;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    RecyclerView lv;
    RecyclerView.LayoutManager mLayoutManager;


    String[]cropArray = {"NEW DELHI: The government will soon come out with a policy to ensure that farmers get the support price 1.5 times " +
            "higher than the production cost, Agriculture Minister Radha Mohan Singh said today."+
            "Government think tank Niti Aayog has come out with a draft policy after discussion with states and it will be finalised soon " +
            "after further deliberations, he added.The minister promised that the notified crops whose minimum support price (MSP) is not" +
            " 50 per cent higher than the cost.He noted that MSPs of some crops are already 50 per cent higher than the cost of production. \n" +
            "\n" +
            "In Budget 2018-19, the government had announced fixing MSP 1.5 times higher than the cost of production. The centre fixes MSP of 22 agri-commodities. \n" +
            "\n" +
            "Singh assured farmers that the government will intervene when prices fall below MSP and protect their interest even if it hurts the government exchequer. \n" +
            "\n" +
            "Read more at:\n" +
            "//economictimes.indiatimes.com/articleshow/63429654.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst",
            "CHANDIGARH: Wheat output is likely to come down marginally in Northern states mainly in Uttar Pradesh as scanty rains, higher than normal temperature and recent winds looks to check crop yield this Rabi season. In the last few days, the light rain and strong winds, has also affected standing wheat crop in some parts in UP, Haryana and Punjab. \n" +
                    "\n" +
                    "“Strong recent winds and untimely rains on standing crops have affected crop that has attained maturity in few parts in Uttar Pradesh,” a senior o .. \n" +
                    "\n" +
                    "Read more at:\n" +
                    "//economictimes.indiatimes.com/articleshow/63416272.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst","MUMBAI: The domestic vegetable seeds industry is likely to double its size to around Rs 8,000 crore in the next five years driven by growth in adoption of hybrid seeds, says a report. \n" +
            "\n" +
            "The current market size of the vegetable seeds industry is around Rs 4,000 crore. \n" +
            "\n" +
            "Rating agency IcraBSE -1.53 % in its report said increasing awareness to consume more vegetables to meet diverse dietary and nutritional needs has raised the demand for vegetables. \n" +
            "\n" +
            "Sachin Sachdeva, associate .. \n" +
            "\n" +
            "Read more at:\n" +
            "//economictimes.indiatimes.com/articleshow/63414617.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst"
            ,
            "Domestic vegetable seeds industry is expected to double from the current size to around Rs. 8,000 crore in the next five years. " +
                    "This growth will be necessitated by the estimated growth in vegetable production required to meet future demand, and " +
                    "driven by greater use of hybrid seeds, which as of now have low penetration, says an ICRABSE -1.53 % note." +
                    "Throwing more light on the aspect, Mr. Sachin Sachdeva, Associate Head & AVP –" +
                    " Corporate Ratings, ICRA says, “Increasing population awa .. "
            ,
            "BHOPAL: National Dairy Development Board (NDDB) is using information technology to bring transparency " +
                    "in its operations and improve efficiency in milk collection, said an official."
            , "My name is Kiranjit Kaur. My father was a farmer. He committed suicide two years ago.Kiranjit, a girl in her early twenties," +
            " was presenting her heart-rending testimony before a small audience comprising politicians, economists, civil society leaders" +
            " and farmers and farm women who had lost their son or father over the last few years, at an event organised by ‘Committee " +
            "for Farmers and Families of Agrarian Suicide Victims’ at Chandigarh recently. With the state government officially admitting " +
            "that 16,000 farmers and farm workers have ended their own lives since the year 2000, \n"+
            "While the testimonies were being presented, and tears rolled from the eyes of many participants, including experts, the common factor one could visualise was mounting indebtedness. But there is more to it than what meets the eye. " +
            "Credit pe credit, and then taking credit from another source to pay back the earlier credit has now become a norm.\n"+
            "The first time I visited a farm victim’s family to understand the reasons behind the sudden spate of suicides was in 1987 when 37 farm suicides were reported from Warangal district in Andhra Pradesh. Across the country, " +
            "from Bundelkhand to Vidharbha"
            ,
            "Prime Minister Narendra Modi today said MSP for crops will be at least 1.5 times the production cost so as to boost farmers' " +
                    "incomes and the Centre is working with states to ensure that they get the benefit of the support prices.\n" +
            "\n"+ "He said all input costs would be included while fixing MSPs of various crops and this decision would help double farm income by 2022.\n"
            ,
            "Congress whip Govind Singh Dotasara on Monday claimed that the Raje government used only 8 percent budget allocation for " +
                    "agriculture in the last financial year and demanded a complete loan waiver for farmers, terming the government budget " +
                    "announcement of waiving off Rs 50,000 loan a drop in the ocean.\n" +
            "Dotasara, speaking over grants, in the House, raised the issue ‘insincerity’ of the Raje government towards " +
                    "agriculture and agrarian community. “CM Raje had approved Rs1,723 crore for agriculture in her previous budget " +
                    "(2017-18), of which Rs139 crore was spent till November-December which is 8 percent of entire budget. " +
                    "Rs520 crore was sanctioned for sprinkler and other grants, of which only Rs800 crore was spent. " +
                    "This is also only 15 percent of entire budget allocation,” said Dotasara.\n"+
            "The Laxmangarh MLA also informed the House about plight of farmers who are committing suicides due to the apathy " +
                    "of the government. He alleged that the latest budget did not heeded to the grievances of the agriculture and " +
                    "animal husbandry sectors. The member recalled that in previous budget 10 pages were dedicated to announcements " +
                    "on agriculture and animal husbandry. But this year, it contains only four pages.\n"
            ,
            "Rajasthan’s farmers and scientists are at odds. While the farmers are claiming that alcohol spray on crops has increased " +
                    "the yield, the scientists are rejecting their claim, which according to them needs to be investigated.\n"+
            "The farmers in Jhunjhunu district have been spraying alcohol on pulses crop for last three to four years. " +
                    "The farmers claim that whether Rabi or Kharif, they have been mixing alcohol in water and spraying on gram, " +
                    "gwar and methi.\n"+
            "The farmers claim that country liquor is more effective. Even former army men have been using rum and other " +
                    "IMFL to get better yield. A bottle of alcohol cost them Rs 125, which they use in a bigha and the yield is doubled."
            ,
            "If you live at the edge of a metro, in a peri-urban area" +
            " like I do, " +
            "then the agrarian crisis is not something one only reads in newspaper editorials, it is visible all around. " +
            "As urbanisation marches on relentlessly, the government stakes claim to the agrarian land in the borders " +
            "to sell to the developers who build apartments or office spaces or malls here. " +
            "About a decade ago farmers were protesting this claim and unwilling to give up the land they owned for generations. " +
            "Now, there is less protest as they are happy to get a good price for the land, quit farming and start some other venture " +
                    "or get a salaried job. In the villages of Greater Noida and Noida, almost no land is left which belongs to the farmer." +
                    " \n" +
            "\n" +
            "Agriculture is beset with problems. Lack of or unseasonal rains, poor yield from the land, low price of the crop for the " +
                    "farmer, landlessness and debt being some of the bigger issues. The farmer suicides in the Vidarbha region " +
                    "are stark evidence of the crisis. The green revolution and its preoccupation with yield, made the use of chemical" +
                    " fertilisers an entrenched practice among farmers. I recently met a young man from Etah, in Uttar Pradesh," +
            " who quit farming to become a yoga teacher in Noida. He narrated with feeling how when he was a boy their family woul" +
                    "d get everything they ate from their own land: bajra, wheat, dal, vegetables. But the land’s yield became poorer" +
                    " with each passing year and now they got only one fasal"};
    Integer[]imgid={R.drawable.agri1,R.drawable.agri2,R.drawable.agri3,R.drawable.agri4,R.drawable.agri5,R.drawable.agri6,R.drawable.agri7
            ,R.drawable.agri8,R.drawable.agri9,R.drawable.agri10};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lv= view.findViewById(R.id.recycle);
        HomeListAdapter customListview=new HomeListAdapter(getActivity(),cropArray ,imgid);
        mLayoutManager = new LinearLayoutManager(getContext());
        lv.setLayoutManager(mLayoutManager);
        lv.setAdapter(customListview);
        return view;
    }
}

