package mcm.edu.ph.a12_decisionbasedgame;

import android.view.View;

public class Story {

    MainActivity ma;
    String nextPage1, nextPage2, nextPage3, nextPage4;
    String sec1, sec2, sec3, sec4, sec5, sec6, sec7, sec8, sec9, sec10;
    String sus1, sus2, sus3, sus4, sus5, sus6, sus7, sus8, sus9, sus10;
    String extra1;

    public Story(MainActivity ma) {
        this.ma = ma;

    }

    public void selectPage(String page) {

        switch (page) {
            case "startingPoint":
                startingPoint();
                break;
            case "Result1":
                Result1();
                break;
            case "sec1":
                sec1();
                break;
            case "sec2":
                sec2();
                break;
            case "sec3":
                sec3();
                break;
            case "sus1":
                sus1();
                break;
            case "sus2":
                sus2();
                break;
            case "sus3":
                sus3();
                break;
            case "Result2":
                Result2();
                break;
            case "sec5":
                sec5();
                break;
            case "extra1":
                extra1();
                break;
            case "sec6":
                sec6();
                break;
            case "sec7":
                sec7();
                break;
            case "sus5":
                sus5();
                break;
            case "sus6":
                sus6();
                break;
            case "sus7":
                sus7();
                break;
            case "Result3":
                Result3();
                break;
            case "sec8":
                sec8();
                break;
            case "sec9":
                sec9();
                break;
            case "sec10":
                sec10();
                break;
            case "sus8":
                sus8();
                break;
            case "sus9":
                sus9();
                break;
            case "sus10":
                sus10();
                break;
            case "sus11":
                sus11();
                break;
            case "Result4":
                Result4();
                break;
        }
    }

    public void startingPoint() {
        ma.text.setText("\n On the Hooktown Academy, Chief Wallace sent you and Henry to the party after winning the hockey match. \n" +
                "After going there, they found the dead body of Kennedy Bowen, he got shot right in between his eyes. What do you do?");

        ma.image.setImageResource(R.drawable.scene1theafterparty);
        ma.btn1.setText("Let Chief Wallace take care of the scene");
        ma.btn2.setText("Report to Headmaster Seymour");
        ma.btn3.setText("Call Professor Milton in the other room");
        ma.btn4.setText("Leave the scene");

        ma.btn1.setVisibility(View.VISIBLE);
        ma.btn2.setVisibility(View.VISIBLE);
        ma.btn3.setVisibility(View.VISIBLE);
        ma.btn4.setVisibility(View.VISIBLE);

        nextPage1 = "Result1";
        nextPage2 = "Result2";
        nextPage3 = "Result3";
        nextPage4 = "Result4";

    }

    public void Result1() {

        ma.image.setImageResource(R.drawable.scene1theafterpartyonlytape);
        ma.text.setText("Chief Wallace took care of the scene. What do you do?");

        ma.btn1.setText("Talk to Chief Wallace about his ties to the investigation");
        ma.btn2.setText("Ask about the evidence gathered");
        ma.btn3.setText("Ask about the suspects");
        ma.btn4.setText("Back");

        ma.btn1.setVisibility(View.VISIBLE);
        ma.btn2.setVisibility(View.VISIBLE);
        ma.btn3.setVisibility(View.VISIBLE);
        ma.btn4.setVisibility(View.VISIBLE);

        nextPage1 = "sec1";
        nextPage2 = "sec2";
        nextPage3 = "sec3";
        nextPage4 = "startingPoint";
    }

    public void sec1() {
        ma.text.setText("Chief Wallace: I was instructed by Mr. Keating to tell the players of the hockey match about the party after the win.");

        ma.btn1.setText("Back");    

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result1";
    }

    public void sec2() {
        ma.text.setText("Chief Wallace shows the Killer's profile. The Killer handles guns and right-handed. He was not seen anywhere near the crime scene.");
        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result1";

    }

    public void sec3() {

        ma.text.setText("Chief Wallace shows a folder with the list of suspects \n" +
                "\n 1. Mr. Charles Keating was the organizer of the party. He is right-handed, and has a background of owning guns. \n" +
                "\n 2. Professor Franklin Milton was seen at the hockey match angry about the loss of his team to Midnight Marauders team, alledgedly caught sabotaged their players. He was seen at the party and is right-handed.\n" +
                "\n 3. Headmaster Seymour Gray, the Headmaster of the Academy, was not present during the match. Owns a gun for protection, is right-handed.\n" +
                "\n Who are you going to arrest?");

        ma.image.setImageResource(R.drawable.scene1theafterpartynobody);
        ma.btn1.setText("Mr. Keating");
        ma.btn2.setText("Professor Milton");
        ma.btn3.setText("Headmaster Seymour");
        ma.btn4.setText("Back");

        nextPage1 = "sus1";
        nextPage2 = "sus2";
        nextPage3 = "sus3";
        nextPage4 = "Result1";
    }

    public void sus1() {
        ma.text.setText("You arrested Mr. Keating for the murder of Kennedy Bowen, although the evidence was pointing at him you have a gut feeling that he was just the accomplice and the real killer is still out there.");
        ma.image.setImageResource(R.drawable.black);
        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus2() {
        ma.text.setText("You arrested Professor Milton for the murder of Kennedy Bowen. Both you and Henry looked at each other having a gut feeling that he might be innocent");
        ma.image.setImageResource(R.drawable.black);
        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus3() {
        ma.text.setText("You arrested Headmaster Seymour Gray after the death of Kennedy Bowen. Both you and Henry looked at each other having a gut feeling that he might be innocent");
        ma.image.setImageResource(R.drawable.black);
        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void Result2() {
        ma.text.setText("Headmaster Seymour took care of the crime scene.\n" +
                "What do you do?");

        ma.image.setImageResource(R.drawable.scene1theafterpartyonlytape);
        ma.btn1.setText("Talk to Headmaster Seymour about his ties to the investigation");
        ma.btn2.setText("Ask about the evidence in the crime scene");
        ma.btn3.setText("Ask about the suspects");
        ma.btn4.setText("Back");

        ma.btn1.setVisibility(View.VISIBLE);
        ma.btn2.setVisibility(View.VISIBLE);
        ma.btn3.setVisibility(View.VISIBLE);
        ma.btn4.setVisibility(View.VISIBLE);

        nextPage1 = "sec5";
        nextPage2 = "sec6";
        nextPage3 = "sec7";
        nextPage4 = "startingPoint";
    }

    public void sec5() {
        ma.text.setText("Headmaster Seymour: I was here at my office the whole time. I had an alibi and that was Kennedy.");
        ma.image.setImageResource(R.drawable.headmaster);
        ma.btn1.setText("Ask about what Kennedy wanted from him");
        ma.btn2.setText("Back");

        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "extra1";
        nextPage2 = "Result2";

    }

    public void extra1() {
        ma.text.setText("Headmaster Seymour: He was hallucinating from time to time about Chief Wallace's appearance");

        ma.btn4.setText("Back");

        nextPage4 = "Result2";

        ma.image.setImageResource(R.drawable.headmaster);
        ma.btn4.setVisibility(View.VISIBLE);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
    }

    public void sec6() {
        ma.text.setText("Headmaster Seymour shows the Killer’s profile. The Killer handles guns and is right-handed. He was still at the party when the body was discovered.");

        ma.btn1.setText("Back");
        ma.image.setImageResource(R.drawable.black);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result2";

    }

    public void sec7() {
        ma.text.setText("Headmaster Seymour shows a folder with the list of suspects \n" +
                "\n 1. Mr. Charles Keating was the organizer of the party, is Right-handed, and has a background in owning guns. \n" +
                "\n 2. Professor Franklin Milton was seen the hockey match angry about the loss of his team to the Midnight Marauders, allegedly sabotaged their players. Was seen at the party. is Right-handed.\n" +
                "\n 3. Chief Wallace Belmont was the person last seen at the crime scene, has no alibi before the murder, is right-handed.");

        ma.image.setImageResource(R.drawable.headmaster);
        ma.btn1.setText("Mr. Keating");
        ma.btn2.setText("Professor Milton");
        ma.btn3.setText("Chief Wallace");
        ma.btn4.setText("Back");

        nextPage1 = "sus5";
        nextPage2 = "sus6";
        nextPage3 = "sus7";
        nextPage4 = "Result2";
    }

    public void sus5() {
        ma.text.setText("You arrested Mr. Charles Keating for the death of Kennedy Bowen, although the evidence was pointing at him you have a gut feeling that he was just an accomplice and the real killer is still out there");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus6() {
        ma.text.setText("You arrested Professor Franklin Milton for the death of Kennedy Bowen. Both you and Henry looked at each other have a gut feeling that he might be innocent");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus7() {
        ma.text.setText("You arrested Chief Wallace Belmont for the death of Kennedy Bowen. Henry doesn’t understand why he would do this and refuses to think that the chief would kill anyone but despite that, you know that you’ve caught the killer");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void Result3() {
        ma.text.setText("Professor Milton took care of the crime scene and took you and Henry to his office a week later.\n" +
                "\n What do you do?");

        ma.image.setImageResource(R.drawable.scene1theafterpartyonlytape);
        ma.btn1.setText("Talk about his ties to the investigation");
        ma.btn2.setText("Ask about the evidence in the crime scene");
        ma.btn3.setText("Ask about the suspects");
        ma.btn4.setText("Back");

        ma.btn1.setVisibility(View.VISIBLE);
        ma.btn2.setVisibility(View.VISIBLE);
        ma.btn3.setVisibility(View.VISIBLE);
        ma.btn4.setVisibility(View.VISIBLE);

        nextPage1 = "sec8";
        nextPage2 = "sec9";
        nextPage3 = "sec10";
        nextPage4 = "startingPoint";
    }

    public void sec8() {
        ma.text.setText("Professor Milton: I was in the other room, drinking our loss away");

        ma.btn1.setText("Back");

        ma.image.setImageResource(R.drawable.professorsoffics);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result3";

    }

    public void sec9() {
        ma.text.setText("Professor Milton shows the Killer’s profile. The Killer handles guns and is right-handed. He was still in the party when the body was discovered.");

        ma.btn1.setText("Back");

        ma.image.setImageResource(R.drawable.black);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result3";

    }

    public void sec10() {
        ma.text.setText("Professor Milton shows a folder with the list of suspects \n" +
                "\n 1. Mr. Charles Keating was the organizer of the party, is Right-handed, and has a background of owning guns \n" +
                "\n 2. Chief Wallace Belmont was the person last seen at the crime scene, has no alibi before the murder, is right-handed.\n" +
                "\n 3. Seymour Gray the headmaster of the Academy, was not present during the match. Owns a gun for protection, is Right-handed \n" +
                "\n 4. Arrest Professor Milton");

        ma.image.setImageResource(R.drawable.professorsoffics);
        ma.btn1.setText("Mr. Keating");
        ma.btn2.setText("Chief Wallace");
        ma.btn3.setText("Headmaster Seymour");
        ma.btn4.setText("Professor Milton");

        nextPage1 = "sus8";
        nextPage2 = "sus9";
        nextPage3 = "sus10";
        nextPage4 = "sus11";
    }
    public void sus8() {
        ma.text.setText("You arrested Mr. Charles Keating for the death of Kennedy Bowen, although the evidence was pointing at him you have a gut feeling that he was just an accomplice and the real killer is still out there");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus9() {
        ma.text.setText("You arrested Chief Wallace Belmont for the death of Kennedy Bowen. Henry doesn’t understand why he would do this and refuses to think that the chief would kill anyone but despite that, you know that you caught the killer");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus10() {
        ma.text.setText("You arrested Headmaster Seymour Gray for the death of Kennedy Bowen. Both you and Henry looked at each other with the gut feeling that he might be innocent");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.black);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus11() {
        ma.text.setText("You arrested Professor Franklin Milton for the death of Cedric Diggory. Both you and Henry looked at each other with the gut feeling that he might be innocent");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.professorsoffics);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void Result4(){
        ma.text.setText("You left the scene and Chief Wallace took over the investigation. A week later, Headmaster Seymour Gray was arrested for the murder of Kennedy Bowen. Everyone in Hooktown Academy was devastated, in denial, and eventually left the Acedemy for good");

        ma.btn4.setText("Restart");

        ma.image.setImageResource(R.drawable.scene1theafterpartynobody);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
}


