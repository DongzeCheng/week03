/**
 * 
 */
app.controller('roleController',function($scope,roleService){
	$scope.rolelist=function(){
		roleService.rolelist().success(function (re) {
			$scope.rolelist=re;
		})
	}
	$scope.authlist=function(){
		roleService.authlist().success(function (re) {
			$scope.authlist=re;
		})
	}
})