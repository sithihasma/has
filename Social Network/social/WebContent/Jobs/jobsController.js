app.controller("jobsController", function($scope, $http, $location) {
	function fetchAllJobs() {
		console.log("fetched all jobs")
		$http.get("http://localhost:8090/AppRest/getAllJobs")

		.then(function(response) {
			$scope.jobsdata = response.data;
			console.log("all jobs fetched")
		});
	}
	;
	fetchAllJobs();
	$scope.insertJobs = function() {
		console.log('entered insertJobs');
		$http.post('http://localhost:8090/AppRest/insertJobs',
				$scope.jobs).then(fetchAllJobs(), function(response) {
			console.log("successful jobs entered");
			$location.path("/jobs")
		});
	}
});