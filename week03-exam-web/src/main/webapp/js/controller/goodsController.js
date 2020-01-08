/**
 * 
 */
app.controller('goodsController',function($scope,goodsService){
	$scope.search={};
	
	$scope.getList=function(){
		goodsService.getList().success(function(re) {
			$scope.list=re;
		})
	}
	
	$scope.out=function(id){
		goodsService.out(id).success(function(re) {
			$scope.getList();
		})
	}
	
	$scope.back=function(id){
		goodsService.back(id).success(function(re) {
			$scope.getList();
		})
	}
	
	$scope.tegezer=function(){
		goodsService.tegezer().success(function(re) {
			$scope.getList();
		})
	}
	
	$scope.getSolrList=function(){
		goodsService.getSolrList().success(function(re) {
			console.log(re);
			$scope.solrlist=re;
		})
	}
	
	$scope.deleteId=function(id){
		goodsService.deleteId(id).success(function(re) {
			$scope.getSolrList();
		})
	}
	
	$scope.cx=function(){
		goodsService.cx($scope.search.name).success(function(re) {
			$scope.solrlist();
		})
	}
})