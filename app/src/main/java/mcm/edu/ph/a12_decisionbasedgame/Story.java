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
        ma.text.setText("\n On the Hogwarts School, Chief Moody sent you and Harry to the party after winning the Quidditch match. \n" +
                "\n After going there, they found the dead body of Cedric Diggory, he got shot right in between his eyes. What do you do?");

        ma.btn1.setText("Let Chief Moody take care of the scene");
        ma.btn2.setText("Report to Albus Dumbledore");
        ma.btn3.setText("Call Professor Snape in the other room");
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

        ma.text.setText("Chief Moody took care of the scene. What do you do?");

        ma.btn1.setText("Talk to Chief Moody about his ties to the investigation");
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
        ma.text.setText("Chief Moody: I was instructed by Lucious Malfoy to tell the players of the Quidditch match about the party after the win.");

        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result1";
    }

    public void sec2() {
        ma.text.setText("Chief Moody shows the Killer's profile. The Killer handles guns. The Killer was not anywhere near the crime scene. The Killer is right-handed.");

        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result1";

    }

    public void sec3() {

        ma.text.setText("Chief Moody shows a folder with the list of suspects \n" +
                "\n 1. Lucious Malfoy was the organizer of the party. He is right-handed, and has a background of owning guns. \n" +
                "\n 2. Professor Snape was seen at the Quidditch match angry about the loss of his team to Hufflepuff. He was alledgedly caught sabotaging players of Hufflepuff. Was seen at the party.\n" +
                "\n 3. Albus Dumbledore is the Headmaster of the school. Was not present during the match. Owns a gun for self protection. He is right-handed.\n" +
                "\n Who are you going to arrest?");

        ma.btn1.setText("Lucious Malfoy");
        ma.btn2.setText("Professor Snape");
        ma.btn3.setText("Albus Dumbledore");
        ma.btn4.setText("Back");

        nextPage1 = "sus1";
        nextPage2 = "sus2";
        nextPage3 = "sus3";
        nextPage4 = "Result1";
    }

    public void sus1() {
        ma.text.setText("You arrested Lucious Malfoy for the murder of Cedric Diggory. Although the evidence was pointing at him you have a gut feeling that Lucious Malfoy was just the accomplice and the real killer is still out there.");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus2() {
        ma.text.setText("You arrested Professor Snape for the murder of Cedric Diggory. Both you and Harry looked at each other having a gut feeling that you arrested someone innocent");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus3() {
        ma.text.setText("You arrested Albus Dumbledore for the murder of Cedric Diggory. Both you and Harry looked at each other having a gut feeling that you arrested someone innocent");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void Result2() {
        ma.text.setText("Albus Dumbledore took care of the crime scene.\n" +
                "What do you do?");

        ma.btn1.setText("Talk to Albus Dumbledore about his ties to the investigation");
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
        ma.text.setText("Albus Dumbledore: I was here at my office the whole time. I had an alibi and that was Cedric Diggory.");

        ma.btn1.setText("Ask about what Cedric wanted from him");
        ma.btn2.setText("Back");

        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "extra1";
        nextPage2 = "Result2";

    }

    public void extra1() {
        ma.text.setText("Albus Dumbledore: He was hallucinating from time to time about Chief Moody's appearance");

        ma.btn4.setText("Back");

        nextPage4 = "Result2";

        ma.btn4.setVisibility(View.VISIBLE);
        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
    }

    public void sec6() {
        ma.text.setText("Albus Dumbledore shows the Killer's profile. The Killer handles guns. The Killer was still at the party when the body was discovered. The Killer is right-handed");

        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result2";

    }

    public void sec7() {
        ma.text.setText("Albus Dumbledore shows a folder with the list of suspects \n" +
                "\n 1. Lucious Malfoy was the organizer of the party. He is right-handed, and has a background of owning guns. \n" +
                "\n 2. Professor Snape was seen at the Quidditch match angry about the loss of his team to Hufflepuff. He was alledgedly caught sabotaging players of Hufflepuff. Was seen at the party.\n" +
                "\n 3. Chief Moody was the person last seen at the crime scene. Has no alibi. He is right-handed.");

        ma.btn1.setText("Lucious Malfoy");
        ma.btn2.setText("Professor Snape");
        ma.btn3.setText("Chief Moody");
        ma.btn4.setText("Back");

        nextPage1 = "sus5";
        nextPage2 = "sus6";
        nextPage3 = "sus7";
        nextPage4 = "Result2";
    }

    public void sus5() {
        ma.text.setText("You arrested Lucious Malfoy for the murder of Cedric Diggory. Although the evidence was pointing at him you have a gut feeling that Lucious Malfoy was just the accomplice and the real killer is still out there.");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus6() {
        ma.text.setText("You arrested Professor Snape for the murder of Cedric Diggory. Both you and Harry looked at each other having a gut feeling that you arrested someone innocent");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void sus7() {
        ma.text.setText("You Arrested Chief Moody! for the murder of Cedric Diggory. Harry doesn't understand why he would do this and refuses to think Chief Moody would kill anyone but despite that, you are confident that you caught the killer!");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }

    public void Result3() {
        ma.text.setText("Professor Snape took care of the crime scene and took you and Harry to his office a week later.\n" +
                "\n What do you do?");

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
        ma.text.setText("Professor Snape: I was in the other room, drinking our loss away");

        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result3";

    }

    public void sec9() {
        ma.text.setText("Professor Snape shows the Killer's profile. The Killer handles guns. The Killer was still at the party when the body was discovered. The Killer is right-handed");

        ma.btn1.setText("Back");

        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);
        ma.btn4.setVisibility(View.INVISIBLE);

        nextPage1 = "Result3";

    }

    public void sec10() {
        ma.text.setText("Professor Snape shows a folder with the list of suspects \n" +
                "\n 1. Lucious Malfoy was the organizer of the party. He is right-handed, and has a background of owning guns. \n" +
                "\n 2. Chief Moody was the person last seen at the crime scene. Has no alibi. He is right-handed.\n" +
                "\n 3. Albus Dumbledore is the Headmaster of the school. He was not present during the Quidditch match. Owns a guns for self protection. He is right-handed \n" +
                "\n 4. Arrest Professor Snape");

        ma.btn1.setText("Lucious Malfoy");
        ma.btn2.setText("Professor Snape");
        ma.btn3.setText("Chief Moody");
        ma.btn4.setText("Professor Snape");

        nextPage1 = "sus8";
        nextPage2 = "sus9";
        nextPage3 = "sus10";
        nextPage4 = "sus11";
    }
    public void sus8() {
        ma.text.setText("You arrested Lucious Malfoy for the murder of Cedric Diggory. Although the evidence was pointing at him you have a gut feeling that Lucious Malfoy was just the accomplice and the real killer is still out there.");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus9() {
        ma.text.setText("You Arrested Chief Moody for the murder of Cedric Diggory. Harry doesn't understand why he would do this and refuses to think Chief Moody would kill anyone but despite that, you are confident that you caught the killer!");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus10() {
        ma.text.setText("You arrested Albus Dumbledore for the murder of Cedric Diggory. Both you and Harry looked at each other having a gut feeling that you arrested someone innocent");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void sus11() {
        ma.text.setText("You arrested Professor Snape in that moment for the murder of Cedric Diggory. Both you and Harry looked at each other having a gut feeling that you arrested someone completely innocent");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
    public void Result4(){
        ma.text.setText("You left the scene and Chief Moody took over the entire investigation. A week later Albus Dumbledore was arrested for the murder of Cedric Diggory. Everyone in Hogwarts was devastated, in denial, and felt betrayed. Everyone eventually left Hogwarts for good");

        ma.btn4.setText("Restart");

        ma.btn1.setVisibility(View.INVISIBLE);
        ma.btn2.setVisibility(View.INVISIBLE);
        ma.btn3.setVisibility(View.INVISIBLE);

        nextPage4 = "startingPoint";
    }
}


