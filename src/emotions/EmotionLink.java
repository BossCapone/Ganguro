package emotions;
/*
 * Resources:
    http://en.wikipedia.org/wiki/PAD_emotional_state_model

*/
public enum EmotionLink {
    //The primary 6 emotions
    ANGER   (-.50f, .50f, .50f),
    DISGUST (-.5f, -.2f, -.2f), 
    FEAR (-.6f, .5f, -.5f),
    HAPPINESS (1f, 1f, 0f), 
    SURPRISE (0f, 1f, -1f);
    
    /*    
    // The Secondary and Tershiary subtypes
    // Listed by emotion:
    //anger
    Agressive (ANGER),
        Hostile (Agressive),
        Provoked (Agressive),
    Critical (ANGER),
        Suspiscious (ANGER),
        Skeptical (ANGER),
    Distant (ANGER),
        Withdrawn (ANGER),
        Suspicious (ANGER),
    Fustrated (ANGER),
        Infuriated (ANGER),
        Irritated (ANGER),
    Hateful (ANGER),
        Violated (ANGER),
        Resentful (ANGER),
    Hurt (ANGER),
        Devastated (ANGER),
        Embarrased (ANGER),
    Threatened (ANGER),
        Jealous (ANGER),
      //Insecure,
    
    //disgust
    Avoidance,
        Aversion,
        Hesitant,
    Aweful,
        Revusion,
        Detestable,
    Disappointed,
        Loathing,
        Repugnant,
    Disapproval,
        Judgemental,
      //Loathing,
    
    //fear
    Anxious,
        Worried,
        Overwhelmed,
    Humiliated,
        Ridiculed,
        Disrespected,
    Insecure,
        Inferior,
        Inadequate,
    Rejected,
        Alienated,
      //Inadequate,
    Scared,
        Frightened, 
        Terrified,
    Submissive,
        Insignificant,
        Worthless,
        
    //happiness
    Accepted,
        Respected,
        Fufilled,
    Joyful,
        Liberated,
        Estatic,
    Interested,
        Amused,
        Inquisitive,
    Powerful,
        Provocative,
        Couregous,
    Proud,
        Important,
        Confidant,
    Peaceful,
        Hopeful,
        Loving,
    Intimate,
        Playful,
        Sensitive,
    Optimistic,
        Inspired,
        Open,
    
    //suprise
    Amazed,
        Astonished,
        Awe,
    Confused,
        Dillusioned,
        Perplexed,
    Excited,
        Eager,
        Energetic,
    Startled,
        Shocked,
        Dismayed,

    
        
//Other Emotions,
        /* 
    Angst,
    Anguish,
    Annoyance,
    Anxiety,
    Apathy,
    Arousal,
    Boredom (-.65f, -.62f, -.33f),
    Contempt,
    Contentiment,
    Courage,
    Curiouity,
    Depression,
    Desire,
    Despair,
    Disapointment,
    Distrust,
    Dread,
    Ecstay,
    Envy,
	DESPAIR,
	DISAPPOINTMENT, 
	
	DISTRUST, 
	DREAD, 
	ECSTASY, 
	EMBARRASSMENT, 
	ENVY, 
	EUPHORIA,
	EXCITEMENT, 
	
	FRUSTRATION, 
	GRATITUDE, 
	GRIEF, 
	GUILT, 
	
	HATRED, 
	HOPE,
	HORROR, 
	HOSTILITY, 
	HURT, 
	HYSTERIA, 
	INDIFFERENCE, 
	INTEREST, 
	JEALOUSY, 
	JOY, 
      //LOATHING,
	LONELINESS, 
	LOVE (.87f, .24f, -.18f), 
	LUST, 
	OUTRAGE, 
	PANIC, 
	PASSION, 
	PITY, 
	PLEASURE, 
	PRIDE, 
	RAGE, 
	REGRET,
	REMORSE, 
	SADNESS, 
	SATISFACTION, 
	SHAME, 
	SHOCK, 
	SHYNESS, 
	SORROW, 
	SUFFERING, 
	
	TERROR, 
	TRUST, 
	WONDER, 
	WORRY, 
	ZEAL, 
	ZEST;
        */
	

	private float P=0;
	private float A=0;
	private float D=0;
        private Emotion emo;
	
	EmotionLink() {	// for non stated emotions
                emo = new Emotion(); 
                emo.setEmotionLink(this);
	}
	EmotionLink(float p, float a, float d) {
            emo = new Emotion(p,a,d);
            emo.setEmotionLink(this);
	}
        EmotionLink(EmotionLink link) {
            emo = new Emotion(link);
        }
        EmotionLink(String id, EmotionLink link, boolean[] base, float p, float a, float d) {
            emo = new Emotion(id,link,base,p,a,d);
    }
        
        
        
        
	public float[] getValuePAD() {
		return emo.getValuePAD();
	}
	public boolean[] getSignPAD() {
            return emo.getSignPAD();
	}
        public Emotion getEmotion() {
            return emo;
        }
        public String getEmoName() {
            return emo.getEmoId();
        }
        

}

//Emo.Anger new Emotion(-.2f, .5f, .1f);