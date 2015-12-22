/*
 * generated by Xtext
 */
package org.istic.idm.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.istic.idm.xtext.services.VideoGenGrammarAccess;

public class VideoGenParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.istic.idm.xtext.parser.antlr.internal.InternalVideoGenParser createParser(XtextTokenStream stream) {
		return new org.istic.idm.xtext.parser.antlr.internal.InternalVideoGenParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "VideoGen";
	}
	
	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
