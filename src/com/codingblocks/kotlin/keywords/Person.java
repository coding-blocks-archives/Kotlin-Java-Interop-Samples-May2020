package com.codingblocks.kotlin.keywords;

import java.util.HashMap;

public class Person {

    private String mood = "normal";
    private HashMap<String, Action> moodActions = new HashMap<>();

    void setMood(String newMood) {
        this.mood = newMood;
        if (moodActions.get(this.mood) != null) {
            moodActions.get(this.mood).perform();
        }
    }

    Action when(String mood) {
        Action action = new Action();
        moodActions.put(mood, action);
        return action;
    }

    class Action {
        private String say = "";
        private String shout = "";

        void say(String it) {
            this.say = it;
        }

        void shout(String it) {
            this.shout = it;
        }

        void perform() {
            if (!say.equals("")) System.out.println(say);
            if (!shout.equals("")) System.out.println(shout.toUpperCase());
        }
    }

}
