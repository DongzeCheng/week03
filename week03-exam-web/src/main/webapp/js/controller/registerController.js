/**
 * 
 */
app.controller('userController',function($scope,userService){
	$scope.register=function(){
		userService.register($scope.entity).success(function(re) {
			alert(re.message)
		})
	}
	
	$scope.upadatepwd=function(){
		userService.upadatepwd($scope.entity).success(function(re) {
			alert(re.message)
		})
	}
	
	$scope.login=function(){
		userService.login($scope.entity).success(function(re) {
			alert(re.message)
		})
	}
})