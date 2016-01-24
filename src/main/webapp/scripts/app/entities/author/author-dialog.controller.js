'use strict';

angular.module('bookexcerptsApp').controller('AuthorDialogController',
    ['$scope', '$stateParams', '$uibModalInstance', 'entity', 'Author',
        function($scope, $stateParams, $uibModalInstance, entity, Author) {

        $scope.author = entity;
        $scope.load = function(id) {
            Author.get({id : id}, function(result) {
                $scope.author = result;
            });
        };

        var onSaveSuccess = function (result) {
            $scope.$emit('bookexcerptsApp:authorUpdate', result);
            $uibModalInstance.close(result);
            $scope.isSaving = false;
        };

        var onSaveError = function (result) {
            $scope.isSaving = false;
        };

        $scope.save = function () {
            $scope.isSaving = true;
            if ($scope.author.id != null) {
                Author.update($scope.author, onSaveSuccess, onSaveError);
            } else {
                Author.save($scope.author, onSaveSuccess, onSaveError);
            }
        };

        $scope.clear = function() {
            $uibModalInstance.dismiss('cancel');
        };
}]);
