grammar Tok;
import Keyword;
tokens {TN}

stat: SELECT WS+ el+=fs[] WS+ FROM WS+ TN;

fs[String[] columns]
     returns [Map<String,String> values]
     locals [int col=0]
  	@init {
  	$values = new HashMap<String,String>();
  	}
  	@after {
  	if ($values!=null && $values.size()>0) {
  	System.out.println("values = "+$values);
  	}
  	}
    : FN(',' FN)* | '*'
    ;


WS : ' ';
FN : [a-z]+;




