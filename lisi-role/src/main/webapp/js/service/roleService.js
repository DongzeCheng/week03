/**
 * 
 */
app.service('roleService',function($http){
	this.rolelist=function(){
		return $http.get("../role/rolelist.do")
	}

	this.authlist=function(){
		return $http.get("../role/authlist.do")
	}
})