'use strict';

angular.module('bookexcerptsApp')
    .controller('AuthorDetailController', function ($scope, $rootScope, $stateParams, entity, Author) {
        $scope.author = entity;
        $scope.load = function (id) {
            Author.get({id: id}, function(result) {
                $scope.author = result;
            });
        };
        var unsubscribe = $rootScope.$on('bookexcerptsApp:authorUpdate', function(event, result) {
            $scope.author = result;
        });
        $scope.$on('$destroy', unsubscribe);

    });
