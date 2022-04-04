package com.hotcoa.testappproject;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;

import java.util.List;

public class Analyze {
    public static void main(String[] args){
        maTest();
        extractTest();
    }

    public static String maTest()
    {
        String result_string = "";
        String string = "안녕";
        try {
            MorphemeAnalyzer ma = new MorphemeAnalyzer();
            ma.createLogger(null);
            List<MExpression> ret = ma.analyze(string);
            ret = ma.postProcess(ret);
            ret = ma.leaveJustBest(ret);
            List<Sentence> stl = ma.divideToSentences(ret);

            for( int i = 0; i < stl.size(); i++ ) {
                Sentence st = stl.get(i);
                //System.out.println("=============================================  " + st.getSentence());
                result_string=result_string.concat(st.getSentence());
                for( int j = 0; j < st.size(); j++ ) {
                    //System.out.println(st.get(j));
                    result_string=result_string.concat(st.get(j).toString());
                    result_string=result_string.concat("\n");
                }
            }
            ma.closeLogger();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result_string;

    }


    public static void extractTest(){
        String string = "이부분은명사만추출할것이고오늘은오월12일입니다.";
        KeywordExtractor ke = new KeywordExtractor();
        KeywordList kl = ke.extractKeyword(string, true);
        for( int i = 0; i < kl.size(); i++ ){
            Keyword kwrd = kl.get(i);
            System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
        }
    }




}
