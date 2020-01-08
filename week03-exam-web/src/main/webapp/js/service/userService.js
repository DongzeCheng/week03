/**
 * 
 */
app.service('userService',function($http){
	this.register=function(entity){
		return $http.post('../user/register.do',entity)
	}
	
	this.updatepwd=function(entity){
		return $http.post('../user/updatepwd.do',entity)
	}
	
	this.login=function(entity){
		return $http.post('../user/login.do',entity)
	}
})