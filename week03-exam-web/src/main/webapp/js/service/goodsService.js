/**
 * 
 */
app.service('goodsService',function($http){
	this.getList=function(){
		return $http.get('../goods/list.do');
	}
	
	this.out=function(id){
		return $http.get('../goods/out.do?id='+id);
	}
	
	this.back=function(id){
		return $http.get('../goods/back.do?id='+id);
	}
	
	this.tegezer=function(){
		return $http.get('../goods/tegezer.do');
	}

	this.getSolrList=function(){
		return $http.get('../goods/getSolrList.do');
	}
	
	this.deleteId=function(id){
		return $http.get('../goods/delete.do?id='+id);
	}
	
	this.cx=function(name){
		return $http.get('../goods/cx.do?name='+name);
	}
})