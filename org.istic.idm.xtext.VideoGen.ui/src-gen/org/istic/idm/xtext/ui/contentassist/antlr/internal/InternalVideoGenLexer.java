package org.istic.idm.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalVideoGenLexer() {;} 
    public InternalVideoGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVideoGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:11:7: ( 'MP4' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:11:9: 'MP4'
            {
            match("MP4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:12:7: ( 'FLV' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:12:9: 'FLV'
            {
            match("FLV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:13:7: ( 'MPEGTS' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:13:9: 'MPEGTS'
            {
            match("MPEGTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:14:7: ( 'MPEG' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:14:9: 'MPEG'
            {
            match("MPEG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:15:7: ( 'WEBM' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:15:9: 'WEBM'
            {
            match("WEBM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:16:7: ( 'WMV' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:16:9: 'WMV'
            {
            match("WMV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:17:7: ( 'AVI' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:17:9: 'AVI'
            {
            match("AVI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:18:7: ( 'VideoGen' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:18:9: 'VideoGen'
            {
            match("VideoGen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:19:7: ( '@Optional' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:19:9: '@Optional'
            {
            match("@Optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:20:7: ( '@Mandatory' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:20:9: '@Mandatory'
            {
            match("@Mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:21:7: ( 'Alternatives' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:21:9: 'Alternatives'
            {
            match("Alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:22:7: ( '@Probability(' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:22:9: '@Probability('
            {
            match("@Probability("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:23:7: ( ')' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:24:7: ( 'Sequence' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:24:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:25:7: ( 'url=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:25:9: 'url='
            {
            match("url="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:26:7: ( 'description=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:26:9: 'description='
            {
            match("description="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:27:7: ( 'length=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:27:9: 'length='
            {
            match("length="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:28:7: ( 'mimetype=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:28:9: 'mimetype='
            {
            match("mimetype="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_LEFT_BRACKET"
    public final void mRULE_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1679:19: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1679:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKET"

    // $ANTLR start "RULE_RIGHT_BRACKET"
    public final void mRULE_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1681:20: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1681:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKET"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1683:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1683:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1683:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1683:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1683:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1685:10: ( ( '0' .. '9' )+ )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1685:12: ( '0' .. '9' )+
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1685:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1685:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1687:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1689:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1689:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1689:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1689:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:41: ( '\\r' )? '\\n'
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1691:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1693:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1695:16: ( . )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1695:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:118: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 20 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:136: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 21 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\5\30\1\26\1\uffff\5\30\2\uffff\1\26\2\uffff\3\26\2\uffff\1\30\1\uffff\6\30\4\uffff\5\30\7\uffff\1\74\1\30\1\76\1\30\1\100\1\101\7\30\1\uffff\1\112\1\uffff\1\113\2\uffff\3\30\1\uffff\4\30\2\uffff\6\30\1\131\6\30\1\uffff\4\30\1\uffff\2\30\1\146\1\147\3\30\2\uffff\1\30\1\uffff\4\30\1\160\2\uffff";
    static final String DFA12_eofS =
        "\161\uffff";
    static final String DFA12_minS =
        "\1\0\1\120\1\114\1\105\1\126\1\151\1\115\1\uffff\1\145\1\162\2\145\1\151\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\64\1\uffff\1\126\1\102\1\126\1\111\1\164\1\144\4\uffff\1\161\1\154\1\163\1\156\1\155\7\uffff\1\60\1\107\1\60\1\115\2\60\2\145\1\165\1\75\1\143\1\147\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff\1\162\1\157\1\145\1\uffff\1\162\2\164\1\123\2\uffff\1\156\1\107\1\156\1\151\1\150\1\171\1\60\1\141\1\145\1\143\1\160\1\75\1\160\1\uffff\1\164\1\156\1\145\1\164\1\uffff\1\145\1\151\2\60\1\151\1\75\1\166\2\uffff\1\157\1\uffff\1\145\1\156\1\163\1\75\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\120\1\114\1\115\1\154\1\151\1\120\1\uffff\1\145\1\162\2\145\1\151\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\105\1\uffff\1\126\1\102\1\126\1\111\1\164\1\144\4\uffff\1\161\1\154\1\163\1\156\1\155\7\uffff\1\172\1\107\1\172\1\115\2\172\2\145\1\165\1\75\1\143\1\147\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff\1\162\1\157\1\145\1\uffff\1\162\2\164\1\123\2\uffff\1\156\1\107\1\156\1\151\1\150\1\171\1\172\1\141\1\145\1\143\1\160\1\75\1\160\1\uffff\1\164\1\156\1\145\1\164\1\uffff\1\145\1\151\2\172\1\151\1\75\1\166\2\uffff\1\157\1\uffff\1\145\1\156\1\163\1\75\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\15\5\uffff\1\23\1\24\1\uffff\1\25\1\26\3\uffff\1\32\1\33\1\uffff\1\25\6\uffff\1\11\1\12\1\14\1\15\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32\15\uffff\1\1\1\uffff\1\2\1\uffff\1\6\1\7\3\uffff\1\17\4\uffff\1\4\1\5\15\uffff\1\3\4\uffff\1\21\7\uffff\1\10\1\16\1\uffff\1\22\5\uffff\1\20\1\13";
    static final String DFA12_specialS =
        "\1\2\21\uffff\1\1\1\0\135\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\1\26\1\7\5\26\1\24\12\21\6\26\1\6\1\4\4\20\1\2\6\20\1\1\5\20\1\10\2\20\1\5\1\3\3\20\3\26\1\17\1\20\1\26\3\20\1\12\7\20\1\13\1\14\7\20\1\11\5\20\1\15\1\26\1\16\uff82\26",
            "\1\27",
            "\1\31",
            "\1\32\7\uffff\1\33",
            "\1\34\25\uffff\1\35",
            "\1\36",
            "\1\40\1\uffff\1\37\1\41",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\57\20\uffff\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\75",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\77",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\12\30\7\uffff\23\30\1\111\6\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='M') ) {s = 1;}

                        else if ( (LA12_0=='F') ) {s = 2;}

                        else if ( (LA12_0=='W') ) {s = 3;}

                        else if ( (LA12_0=='A') ) {s = 4;}

                        else if ( (LA12_0=='V') ) {s = 5;}

                        else if ( (LA12_0=='@') ) {s = 6;}

                        else if ( (LA12_0==')') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='u') ) {s = 9;}

                        else if ( (LA12_0=='d') ) {s = 10;}

                        else if ( (LA12_0=='l') ) {s = 11;}

                        else if ( (LA12_0=='m') ) {s = 12;}

                        else if ( (LA12_0=='{') ) {s = 13;}

                        else if ( (LA12_0=='}') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( ((LA12_0>='B' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='e' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='t')||(LA12_0>='v' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 18;}

                        else if ( (LA12_0=='\'') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='('||(LA12_0>='*' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='?')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}