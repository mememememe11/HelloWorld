/**
 * 
 */
		
const svc = {
	selectList(
successCallBack
  	, errorCallBack
) {
fetch('eventList.do')
	.then(data => data.toJson())
	.then(successCallBack)
	.catch(errorCallBack);
},
addEvent(
param={title, startEvent, endEvent, url}
, successCallBack
  	, errorCallBack
) {
fetch('addEvent.do?title=' 
+ param.title 
+ '&se=' // startDay => se로 줄여서 사용
+ param.startEvent
+ '&ee=' // endDay => ee로 줄여서 사용
+ param.ee
+ '&url='
+ url
)
.then(data => data.toJson())
.then(successCallBack)
.catch(errorCallBack);	
},
// removeEvent는 title의 값을 조건으로 삭제
removeEvent(
title
, successCallBack
, errorCallBack

) {
	fetch('removeEvent.do?title=' + ttile)
		

}
};

	