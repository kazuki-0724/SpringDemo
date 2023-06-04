/**
 * 
 */

document.addEventListener('DOMContentLoaded',

	function(){
	 	
	 	var type = /*[[${type}]]*/"else"; 
		
		var cssTarget = document.getElementById('sampleCss');
		                
	    if(type == "test"){
	    	cssTarget.href = '/css/sample1.css'
	    	
	    }else if(type == "test2"){
	        cssTarget.href = '/css/sample2.css'
	                
	    }else{
	        cssTarget.href = '/css/sample1.css'
	
	    }
	                
	}


)
