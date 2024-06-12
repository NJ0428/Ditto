/* 마진 구하는 함수 */

function autoCal(){
	
	var sprice = document.getElementById("salePrice").value;
	var oprice = document.getElementById("originPrice").value;
		
	document.getElementById('margin').value = (parseInt(sprice) / parseInt(oprice));
	
	var margin = document.getElementById('margin').value;

}


//------------------------------------------------------------------------------------------

/* 원가와 판매가에 대해, 3자리 단위당 comma 찍어주는 방식으로는 마진계산이 불가하였음
	이에 원가와 판매가는 단위당 한글표기 + comma 찍지 않는 것으로 대체함 */


 const thousandUnits = ["", "만", "억"];

 // 배열 쪼개기
 function chunkAtEnd(value = "", n = 1) {
   const result = [];

   for (let end = value.length; end > 0; end -= n) {
     result.push(value.substring(Math.max(0, end - n), end));
   }

   return result;
 }

 // 4자리씩 숫자로 변환
 function formatNumber(number) {
	 
   return chunkAtEnd(String(number), 4)
     .reduce((acc, item, index) => {
       const unit = thousandUnits[index] ?? "";

       if (!Number(item)) {
         return acc;
       }

       return `${Number(item)}${unit} ${acc}`;
     }, "")
     .trim();
 }


 function onInput1(target) {
   // 숫자만 남기기
   const value = target.value.replace(/[^0-9]+/g, "");

   document.querySelector("#oparse span").innerHTML = formatNumber(value);

   target.value = value;
 }
 
 
 function onInput2(target) {
	   // 숫자만 남기기
	   const value = target.value.replace(/[^0-9]+/g, "");

	   document.querySelector("#sparse span").innerHTML = formatNumber(value);

	   target.value = value;
	 }

  
//------------------------------------------------------------------------------------------
 
 /* 판매수량, 운송비, 반품비 3자리 단위당 comma 찍어주기 */
 

 /* 판매수량 */
const input3 = document.querySelector('#realcnt');
input3.addEventListener('keyup', function(e) {
  let value = e.target.value;
  value = Number(value.replaceAll(',', ''));
  if(isNaN(value)) {
    input3.value = 0;
  }else {
    const formatValue = value.toLocaleString('ko-KR');
    input3.value = formatValue;
  }
})


/* 운송비 */
const input4 = document.querySelector('#dlvycost');
input4.addEventListener('keyup', function(e) {
  let value = e.target.value;
  value = Number(value.replaceAll(',', ''));
  if(isNaN(value)) {
    input4.value = 0;
  }else {
    const formatValue = value.toLocaleString('ko-KR');
    input4.value = formatValue;
  }
})


/* 반품비 */
const input5 = document.querySelector('#dlvycostre');
input5.addEventListener('keyup', function(e) {
  let value = e.target.value;
  value = Number(value.replaceAll(',', ''));
  if(isNaN(value)) {
    input5.value = 0;
  }else {
    const formatValue = value.toLocaleString('ko-KR');
    input5.value = formatValue;
  }
})


//------------------------------------------------------------------------------------------
    
    /* submit 버튼 클릭시의 이벤트 */
    /*
     $('#submit').click(()=>{
    	     	 
    	 //alert("세이브버튼 클릭됨");
    	 
    	 var formData = new FormData();
    	 
    	 alert("휴... 일단 여기까지");
    	 
     	 $.ajax({
			   
			   url:'/pordReg',
			   processData:false,
			   contentType:false,
			   data:formData,
			   type:'POST',
			   dataType:'json',
			   success:(res)=>{
				   console.log("업로드 성공: " + res);

			   },
			   error:(errStatus)=>{
				   console.log("업로드 에러: " + errStatus);
			   }
			   
	  	 }); 
	  	 
	  	
	  	
    	 
     }); */
    

