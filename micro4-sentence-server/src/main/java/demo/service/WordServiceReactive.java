package demo.service;

import rx.Observable;
import demo.domain.Word;

public interface WordServiceReactive {

	Observable<Word> getSubject();
	Observable<Word> getVerb();
	Observable<Word> getArticle();
	Observable<Word> getAdjective();
	Observable<Word> getNoun();	

}
