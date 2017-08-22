﻿/**
 * grid数据列表操作与controller配合支持分页。
 * @param scope
 * @param filter
 */
function gridInit(scope, filter) {
    if (!scope.sortingOrder) {
        scope.sortingOrder = '';
    }
    if (!scope.reverse) {
        scope.reverse = false;
    }

    scope.range = function (start, end) {
        var ret = [];
        if (!end) {
            end = start;
            start = 0;
        }
        for (var i = start; i < end; i++) {
            ret.push(i);
        }
        return ret;
    };

    scope.prevPage = function () {
        if (scope.currentPage > 0) {
            scope.currentPage--;
        }
        clearChecks();
        scope.load();
    };

    scope.nextPage = function () {
        if (scope.currentPage < scope.pagedCount - 1) {
            scope.currentPage++;
        }
        clearChecks();
        scope.load();
    };

    var searchMatch = function (haystack, needle) {
        if (!needle) {
            return true;
        }
        if (!haystack) {
            return false;
        }
        return haystack.toString().toLowerCase().indexOf(needle.toString().toLowerCase()) !== -1;
    };

    // 搜索
    scope.search = function () {
        /*scope.filteredItems = filter('filter')(scope.items, function (item) {
            for (var attr in item) {
                if (searchMatch(item[attr], scope.query))
                    return true;
            }
            return false;
        });
        if (scope.sortingOrder !== '') {
            scope.filteredItems = filter('orderBy')(scope.filteredItems, scope.sortingOrder, scope.reverse);
        }
        scope.currentPage = 0;
        scope.groupToPages();
        scope.rowSpinOff(scope.filteredItems);*/
    	scope.currentPage = 0;
    	scope.load();
    };

    scope.groupToPages = function () {
    	if(scope.pagedItems.length() > 10)
    		scope.pagedItems = [];

        for (var i = 0; i < scope.filteredItems.length; i++) {
            if (i == 0) {
                scope.pagedItems[scope.currentPage] = [scope.filteredItems[i]];
            } else {
                scope.pagedItems[scope.currentPage].push(scope.filteredItems[i]);
            }
        }
    };

    scope.setPage = function () {
        scope.currentPage = this.n;
        clearChecks();
        scope.load();
    };

    scope.sort_by = function (newSortingOrder, e) {
        if (scope.sortingOrder == newSortingOrder)
            scope.reverse = !scope.reverse;

        scope.sortingOrder = newSortingOrder;
    };

    scope.gridFilter = function (field, value, fltr) {
        $("#fltr-all").removeClass('active');
        $("#fltr-apr").removeClass('active');
        $("#fltr-pnd").removeClass('active');
        $("#fltr-spm").removeClass('active');
        $("#fltr-png").removeClass('active');
        $("#fltr-pub").removeClass('active');
        $("#fltr-dft").removeClass('active');

        $("#fltr-" + fltr).addClass('active');

        scope.filter = fltr;

        scope.filteredItems = filter('filter')(scope.items, function (item) {
            if (value == 'all') {
                return true;
            }             
            return item[field] === value;
        });
        if (scope.sortingOrder !== '') {
            scope.filteredItems = filter('orderBy')(scope.filteredItems, scope.sortingOrder, scope.reverse);
        }
        scope.currentPage = 0;
        scope.groupToPages();
        scope.rowSpinOff(scope.filteredItems);
        return false;
    };

    scope.checkAll = function (e) {
        /*for (var i = 0; i < scope.pagedItems[scope.currentPage].length; i++) {
            // don't check comments that have child comments
            if (scope.commentsPage) {
                if (scope.pagedItems[scope.currentPage][i].HasChildren === false &&
                    scope.pagedItems[scope.currentPage][i].Email != 'pingback') {
                    scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
                }
            }
            // for blogs, do not check primary
            else if (scope.blogsPage) {
                if (scope.pagedItems[scope.currentPage][i].IsPrimary === false) {
                    scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
                }
            }
            // for themes, do not check current or not installed from gallery
            else if (scope.themesPage) {
                if (scope.pagedItems[scope.currentPage][i].Id != scope.activeTheme.Theme && 
                    scope.pagedItems[scope.currentPage][i].Id != scope.activeTheme.Mobile &&
                    scope.pagedItems[scope.currentPage][i].OnlineVersion != '')
                {
                    scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
                }
            }
            // do not check packages not installed from gallery
            else if (scope.fltr === 'extensions' || scope.fltr === 'widgets') {
                if (scope.pagedItems[scope.currentPage][i].OnlineVersion != '') {
                    scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
                }
            }
            // do not check pages if have children
            else if (scope.fltr === 'pages') {
                if (scope.pagedItems[scope.currentPage][i].HasChildren === false) {
                    scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
                }
            }
            else {
                // for others toggle all
                scope.pagedItems[scope.currentPage][i].IsChecked = e.target.checked;
            }
        }*/
    	for (var i = 0; i < scope.filteredItems.length; i++) {
    		scope.filteredItems[i].IsChecked = e.target.checked;
    	}
    };

    scope.itemsChecked = function () {
        var i = scope.filteredItems.length;
        var checked = [];
        while (i--) {
            var item = scope.filteredItems[i];
            if (item.IsChecked === true) {
                return true;
            }
        }
        return false;
    }

    function clearChecks() {
        for (var i = 0; i < scope.items.length; i++)
            scope.items[i].IsChecked = false;

        $('#chkAll').prop('checked', false);
    };

    scope.rowSpinOff = function (items) {
        if (items.length > 0) {
            $('#tr-spinner').hide();
        }
        else {
            $('#tr-spinner').show();
            $('#div-spinner').html("暂无内容");
        }
    }

    //scope.search();
    scope.filteredItems = scope.items;
    scope.rowSpinOff(scope.filteredItems);
}