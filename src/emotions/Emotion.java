package emotions;

public class Emotion {

    public EmotionLink emotionLink;
    private String emoId;
    private boolean[] basesign = new boolean[3]; // default normalsign of the values
    private float P; // Pleasure/Displeasure value
    private float A; // Arousal/Nonarousal value
    private float D; // Dominance/Submissive value

    // default emotion
    public Emotion() {
        emoId = "";
        P = A = D = 0.0f;
        setBaseSign(true, true, true);
    }

    public Emotion(boolean[] base) {
        this.emoId = "";
        P = A = D = 0f;
        setBaseSign(base);
    }

    public Emotion(Emotion e) {
        emoId = e.getEmoId();
        setValuePAD(e.getValuePAD());
        setBaseSign(e.getBaseSign());
        emotionLink = e.getEmotionLink();
    }

    public Emotion(EmotionLink link) {
        setEmoId("");
        setValuePAD(link.getValuePAD());
        setBaseSign(link.getSignPAD());
        setEmotionLink(link);

    }

    public Emotion(float p, float a, float d) {
        setEmoId("");
        setValueP(p);
        setValueA(a);
        setValueD(d);
        basesign = new boolean[3];
        basesign[0] = (P > 0);
        basesign[1] = (A > 0);
        basesign[2] = (D > 0);
    }

    public Emotion(String id, EmotionLink link, boolean[] base, float p, float a, float d) {
        setEmoId(id);
        setEmotionLink(link);
        setBaseSign(base);
        setValueP(p);
        setValueA(a);
        setValueD(d);
    }

    public String getEmoId() {
        return emoId;
    }

    public void setEmoId(String name) {
        emoId = name;
    }

    // get the PAD values
    public float getValueP() {
        return P;
    }

    public float getValueA() {
        return A;
    }

    public float getValueD() {
        return D;
    }

    public float[] getValuePAD() {
        return new float[]{P, A, D};
    }

    // get the current PAD signs
    public boolean getSignP() {
        if (P > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getSignA() {
        if (A > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getSignD() {
        if (D > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean[] getSignPAD() {
        return new boolean[]{getSignP(), getSignA(), getSignD()};
    }

    // set the PAD values
    void setValueP(float p) {
        if (p <= 1 && p >= -1) {
            P = p;
        }
    }

    void setValueA(float a) {
        if (a <= 1 && a >= -1) {
            A = a;
        }
    }

    void setValueD(float d) {
        if (d <= 1 && d >= -1) {
            D = d;
        }
    }

    void setValuePAD(float p, float a, float d) {
        setValueP(p);
        setValueA(a);
        setValueD(d);
    }

    void setValuePAD(float[] value) {
        P = value[0];
        A = value[1];
        D = value[2];
    }

    // increment PAD by 1%
    void incP() {
        if (P + .01 <= 1.0) {
            P += .01;
        }
    }

    void incA() {
        if (A + .01 <= 1) {
            A += .01;
        }
    }

    void incD() {
        if (D + .01 <= 1) {
            D += .01;
        }
    }

    //decrement PAD by 1%
    void decP() {
        if (P - .01 >= -1) {
            P -= .01;
        }
    }

    void decA() {
        if (A - .01 >= -1) {
            A -= .01;
        }
    }

    void decD() {
        if (D - .01 >= -1) {
            D -= .01;
        }
    }

    // Modify PAD by +-n%
    void modP(float p) {
        if (P + p <= 1f && P + p >= -1f) {
            P += p;
        }
    }

    void modA(float a) {
        if (A + a <= 1f && A + a >= -1f) {
            A += a;
        }
    }

    void modD(float d) {
        if (D + d <= 1f && D + d >= -1f) {
            D += d;
        }
    }

    //get/Set the normal sign of the emotion
    public boolean[] getBaseSign() {
        return basesign;
    }

    private void setBaseSign(boolean p, boolean a, boolean d) {
        basesign[0] = p;
        basesign[1] = a;
        basesign[2] = d;
    }

    private void setBaseSign(boolean[] sign) {
        basesign[0] = sign[0];
        basesign[1] = sign[1];
        basesign[2] = sign[2];
    }

    // increment the emotions natural attributes based on the default normalsign
    void inc() {
        if (basesign[0]) {
            incP();
        } else {
            decP();
        }
        if (basesign[1]) {
            incA();
        } else {
            decA();
        }
        if (basesign[2]) {
            incD();
        } else {
            decD();
        }
    }

    void dec() {
        if (!basesign[0]) {
            incP();
        } else {
            decP();
        }
        if (!basesign[1]) {
            incA();
        } else {
            decA();
        }
        if (!basesign[2]) {
            incD();
        } else {
            decD();
        }
    }

    public Emotion getEmotion() {
        return new Emotion(this);
    }

    public void setEmotionLink(EmotionLink link) {
        emotionLink = link;
    }

    public EmotionLink getEmotionLink() {
        return emotionLink;
    }
    //Emotion math

    // Return the PAD as a string
    @Override
    public String toString() {
        return ("" + +P + "," + A + ", " + D);
    }

}
