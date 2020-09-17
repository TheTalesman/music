angular.module('demo', [])
.controller('Album', function($scope, $http) {
    $http.get('localhost:8080/music/albumList').
        then(function(response) {
            $scope.list = response.data;
        });
});
