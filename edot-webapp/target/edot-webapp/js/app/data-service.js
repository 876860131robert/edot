angular.module('app').factory("dataService", ["$http", "$q", function ($http, $q) { 
    return {
        getItems: function (url, p) {
            return $http.get(webRoot(url), {
                // query string like { userId: user.id } -> ?userId=value
                params: p
            });
        },
        addItem: function (url, item) {
            return $http({
                url: webRoot(url),
                method: 'POST',
                data: item
            });
        },
        deleteItem: function (url, item) {
            if (item.Id) {
                return $http({
                    url: webRoot(url) + "/" + item.Id,
                    method: 'GET'
                });
            }
            else {
                return $http({
                    url: webRoot(url),
                    method: 'POST',
                    data: item,
                    headers: { 'Content-Type': 'application/json' }
                });
            }
        },
        // when item does not have "Id" field
        // we can pass name etc. as id here
        deleteById: function (url, id) {
            return $http({
                url: webRoot(url) + "/" + id,
                method: 'GET'
            });
        },
        // delete selected items
        deleteChecked: function (url, items) {
            return $http({
                url: webRoot(url) + url,
                method: 'POST',
                data: items
            });
        },
        updateItem: function (url, item) {
            return $http({
                url: webRoot(url),
                method: 'POST',
                data: item
            });
        },
        // pass list to process all in one go
        processChecked: function (url, items) {
            return $http({
                url: webRoot(url),
                method: 'POST',
                data: items
            });
        },
        // file upload
        uploadFile: function (url, file) {
            return $http({
                url: webRoot(url),
                method: 'POST',
                data: file,
                withCredentials: true,
                headers: { 'Content-Type': undefined },
                transformRequest: angular.identity
            });
        }
    };
}]);