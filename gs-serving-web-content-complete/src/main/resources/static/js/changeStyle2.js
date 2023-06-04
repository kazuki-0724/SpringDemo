/**
 * 
 */



function changeStyle(type){
		 		
	var cssTarget = document.getElementById('sampleCss');
	console.log(type);
	//alert(type);
	
	if(type == "test"){
		cssTarget.setAttribute("th:href","/css/sample1.css");
		cssTarget.href = '/css/sample1.css'	    
	}else if(type == "test2"){
		cssTarget.href = '/css/sample2.css'	                
	}else{
		cssTarget.href = '/css/sample1.css'
	}
}




