if("undefined"===typeof jQuery)throw Error("AdminLTE requires jQuery");$.AdminLTE={};
$.AdminLTE.options={navbarMenuSlimscroll:!0,navbarMenuSlimscrollWidth:"3px",navbarMenuHeight:"200px",animationSpeed:500,sidebarToggleSelector:"[data-toggle\x3d'offcanvas']",sidebarPushMenu:!0,sidebarSlimScroll:!0,sidebarExpandOnHover:!1,enableBoxRefresh:!0,enableBSToppltip:!0,BSTooltipSelector:"[data-toggle\x3d'tooltip']",enableFastclick:!0,enableControlSidebar:!0,controlSidebarOptions:{toggleBtnSelector:"[data-toggle\x3d'control-sidebar']",selector:".control-sidebar",slide:!0},enableBoxWidget:!0,
boxWidgetOptions:{boxWidgetIcons:{collapse:"fa-minus",open:"fa-plus",remove:"fa-times"},boxWidgetSelectors:{remove:'[data-widget\x3d"remove"]',collapse:'[data-widget\x3d"collapse"]'}},directChat:{enable:!0,contactToggleSelector:'[data-widget\x3d"chat-pane-toggle"]'},colors:{lightBlue:"#3c8dbc",red:"#f56954",green:"#00a65a",aqua:"#00c0ef",yellow:"#f39c12",blue:"#0073b7",navy:"#001F3F",teal:"#39CCCC",olive:"#3D9970",lime:"#01FF70",orange:"#FF851B",fuchsia:"#F012BE",purple:"#8E24AA",maroon:"#D81B60",
black:"#222222",gray:"#d2d6de"},screenSizes:{xs:480,sm:768,md:992,lg:1200}};
$(function(){$("body").removeClass("hold-transition");"undefined"!==typeof AdminLTEOptions&&$.extend(!0,$.AdminLTE.options,AdminLTEOptions);var a=$.AdminLTE.options;_init();$.AdminLTE.layout.activate();$.AdminLTE.tree(".sidebar");a.enableControlSidebar&&$.AdminLTE.controlSidebar.activate();a.navbarMenuSlimscroll&&"undefined"!=typeof $.fn.slimscroll&&$(".navbar .menu").slimscroll({height:a.navbarMenuHeight,alwaysVisible:!1,size:a.navbarMenuSlimscrollWidth}).css("width","100%");a.sidebarPushMenu&&$.AdminLTE.pushMenu.activate(a.sidebarToggleSelector);
a.enableBSToppltip&&$("body").tooltip({selector:a.BSTooltipSelector});a.enableBoxWidget&&$.AdminLTE.boxWidget.activate();a.enableFastclick&&"undefined"!=typeof FastClick&&FastClick.attach(document.body);if(a.directChat.enable)$(document).on("click",a.directChat.contactToggleSelector,function(){$(this).parents(".direct-chat").first().toggleClass("direct-chat-contacts-open")});$('.btn-group[data-toggle\x3d"btn-toggle"]').each(function(){var a=$(this);$(this).find(".btn").on("click",function(c){a.find(".btn.active").removeClass("active");
$(this).addClass("active");c.preventDefault()})})});
function _init(){$.AdminLTE.layout={activate:function(){var a=this;a.fix();a.fixSidebar();$(window,".wrapper").resize(function(){a.fix();a.fixSidebar()})},fix:function(){var a=$(".main-header").outerHeight()+$(".main-footer").outerHeight(),b=$(window).height(),c=$(".sidebar").height();$("body").hasClass("fixed")?$(".content-wrapper, .right-side").css("min-height",b-$(".main-footer").outerHeight()):(b>=c?($(".content-wrapper, .right-side").css("min-height",b-a),a=b-a):($(".content-wrapper, .right-side").css("min-height",
c),a=c),b=$($.AdminLTE.options.controlSidebarOptions.selector),"undefined"!==typeof b&&b.height()>a&&$(".content-wrapper, .right-side").css("min-height",b.height()))},fixSidebar:function(){$("body").hasClass("fixed")?("undefined"==typeof $.fn.slimScroll&&window.console&&window.console.error("Error: the fixed layout requires the slimscroll plugin!"),$.AdminLTE.options.sidebarSlimScroll&&"undefined"!=typeof $.fn.slimScroll&&($(".sidebar").slimScroll({destroy:!0}).height("auto"),$(".sidebar").slimscroll({height:$(window).height()-
$(".main-header").height()+"px",color:"rgba(0,0,0,0.2)",size:"3px"}))):"undefined"!=typeof $.fn.slimScroll&&$(".sidebar").slimScroll({destroy:!0}).height("auto")}};$.AdminLTE.pushMenu={activate:function(a){var b=$.AdminLTE.options.screenSizes;$(a).on("click",function(a){a.preventDefault();$(window).width()>b.sm-1?$("body").hasClass("sidebar-collapse")?$("body").removeClass("sidebar-collapse").trigger("expanded.pushMenu"):$("body").addClass("sidebar-collapse").trigger("collapsed.pushMenu"):$("body").hasClass("sidebar-open")?
$("body").removeClass("sidebar-open").removeClass("sidebar-collapse").trigger("collapsed.pushMenu"):$("body").addClass("sidebar-open").trigger("expanded.pushMenu")});$(".content-wrapper").click(function(){$(window).width()<=b.sm-1&&$("body").hasClass("sidebar-open")&&$("body").removeClass("sidebar-open")});($.AdminLTE.options.sidebarExpandOnHover||$("body").hasClass("fixed")&&$("body").hasClass("sidebar-mini"))&&this.expandOnHover()},expandOnHover:function(){var a=this,b=$.AdminLTE.options.screenSizes.sm-
1;$(".main-sidebar").hover(function(){$("body").hasClass("sidebar-mini")&&$("body").hasClass("sidebar-collapse")&&$(window).width()>b&&a.expand()},function(){$("body").hasClass("sidebar-mini")&&$("body").hasClass("sidebar-expanded-on-hover")&&$(window).width()>b&&a.collapse()})},expand:function(){$("body").removeClass("sidebar-collapse").addClass("sidebar-expanded-on-hover")},collapse:function(){$("body").hasClass("sidebar-expanded-on-hover")&&$("body").removeClass("sidebar-expanded-on-hover").addClass("sidebar-collapse")}};
$.AdminLTE.tree=function(a){var b=this,c=$.AdminLTE.options.animationSpeed;$(document).on("click",a+" li a",function(a){var h=$(this),f=h.next();if(f.is(".treeview-menu")&&f.is(":visible"))f.slideUp(c,function(){f.removeClass("menu-open")}),f.parent("li").removeClass("active");else if(f.is(".treeview-menu")&&!f.is(":visible")){var k=h.parents("ul").first();k.find("ul:visible").slideUp(c).removeClass("menu-open");var e=h.parent("li");f.slideDown(c,function(){f.addClass("menu-open");k.find("li.active").removeClass("active");
e.addClass("active");b.layout.fix()})}f.is(".treeview-menu")&&a.preventDefault()})};$.AdminLTE.controlSidebar={activate:function(){var a=this,b=$.AdminLTE.options.controlSidebarOptions,c=$(b.selector);$(b.toggleBtnSelector).on("click",function(g){g.preventDefault();c.hasClass("control-sidebar-open")||$("body").hasClass("control-sidebar-open")?a.close(c,b.slide):a.open(c,b.slide)});var g=$(".control-sidebar-bg");a._fix(g);$("body").hasClass("fixed")?a._fixForFixed(c):$(".content-wrapper, .right-side").height()<
c.height()&&a._fixForContent(c)},open:function(a,b){b?a.addClass("control-sidebar-open"):$("body").addClass("control-sidebar-open")},close:function(a,b){b?a.removeClass("control-sidebar-open"):$("body").removeClass("control-sidebar-open")},_fix:function(a){var b=this;$("body").hasClass("layout-boxed")?(a.css("position","absolute"),a.height($(".wrapper").height()),$(window).resize(function(){b._fix(a)})):a.css({position:"fixed",height:"auto"})},_fixForFixed:function(a){a.css({position:"fixed","max-height":"100%",
overflow:"auto","padding-bottom":"50px"})},_fixForContent:function(a){$(".content-wrapper, .right-side").css("min-height",a.height())}};$.AdminLTE.boxWidget={selectors:$.AdminLTE.options.boxWidgetOptions.boxWidgetSelectors,icons:$.AdminLTE.options.boxWidgetOptions.boxWidgetIcons,animationSpeed:$.AdminLTE.options.animationSpeed,activate:function(a){var b=this;a||(a=document);$(a).on("click",b.selectors.collapse,function(a){a.preventDefault();b.collapse($(this))});$(a).on("click",b.selectors.remove,
function(a){a.preventDefault();b.remove($(this))})},collapse:function(a){var b=a.parents(".box").first(),c=b.find("\x3e .box-body, \x3e .box-footer, \x3e form  \x3e.box-body, \x3e form \x3e .box-footer");b.hasClass("collapsed-box")?(a.children(":first").removeClass(this.icons.open).addClass(this.icons.collapse),c.slideDown(this.animationSpeed,function(){b.removeClass("collapsed-box")})):(a.children(":first").removeClass(this.icons.collapse).addClass(this.icons.open),c.slideUp(this.animationSpeed,
function(){b.addClass("collapsed-box")}))},remove:function(a){a.parents(".box").first().slideUp(this.animationSpeed)}}}
(function(a){a.fn.boxRefresh=function(b){function c(a){a.append(h);g.onLoadStart.call(a)}var g=a.extend({trigger:".refresh-btn",source:"",onLoadStart:function(a){return a},onLoadDone:function(a){return a}},b),h=a('\x3cdiv class\x3d"overlay"\x3e\x3cdiv class\x3d"fa fa-refresh fa-spin"\x3e\x3c/div\x3e\x3c/div\x3e');return this.each(function(){if(""===g.source)window.console&&window.console.log("Please specify a source first - boxRefresh()");else{var b=a(this);b.find(g.trigger).first().on("click",function(a){a.preventDefault();
c(b);b.find(".box-body").load(g.source,function(){b.find(h).remove();g.onLoadDone.call(b)})})}})}})(jQuery);(function(a){a.fn.activateBox=function(){a.AdminLTE.boxWidget.activate(this)}})(jQuery);
(function(a){a.fn.todolist=function(b){var c=a.extend({onCheck:function(a){return a},onUncheck:function(a){return a}},b);return this.each(function(){if("undefined"!=typeof a.fn.iCheck)a("input",this).on("ifChecked",function(){var b=a(this).parents("li").first();b.toggleClass("done");c.onCheck.call(b)}),a("input",this).on("ifUnchecked",function(){var b=a(this).parents("li").first();b.toggleClass("done");c.onUncheck.call(b)});else a("input",this).on("change",function(){var b=a(this).parents("li").first();
b.toggleClass("done");a("input",b).is(":checked")?c.onCheck.call(b):c.onUncheck.call(b)})})}})(jQuery);
(function(a,b){function c(c){a("body").toggleClass(c);b.layout.fixSidebar();"layout-boxed"==c&&b.controlSidebar._fix(a(".control-sidebar-bg"));a("body").hasClass("fixed")&&"fixed"==c&&(b.pushMenu.expandOnHover(),b.layout.activate());b.controlSidebar._fix(a(".control-sidebar-bg"));b.controlSidebar._fix(a(".control-sidebar"))}function g(b){a.each(h,function(b){a("body").removeClass(h[b])});a("body").addClass(b);"undefined"!==typeof Storage?localStorage.setItem("skin",b):window.alert("Please use a modern browser to properly view this template!");
return!1}var h="skin-blue skin-black skin-red skin-yellow skin-purple skin-green skin-blue-light skin-black-light skin-red-light skin-yellow-light skin-purple-light skin-green-light".split(" "),f=a("\x3cdiv /\x3e",{id:"control-sidebar-theme-demo-options-tab","class":"tab-pane active"}),k=a("\x3cli /\x3e",{"class":"active"}).html("\x3ca href\x3d'#control-sidebar-theme-demo-options-tab' data-toggle\x3d'tab'\x3e\x3ci class\x3d'fa fa-wrench'\x3e\x3c/i\x3e\x3c/a\x3e");a("[href\x3d'#control-sidebar-home-tab']").parent().before(k);
k=a("\x3cdiv /\x3e");k.append("\x3ch4 class\x3d'control-sidebar-heading'\x3eLayout Options\x3c/h4\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-layout\x3d'fixed' class\x3d'pull-right'/\x3e Fixed layout\x3c/label\x3e\x3cp\x3eActivate the fixed layout. You can't use fixed and boxed layouts together\x3c/p\x3e\x3c/div\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-layout\x3d'layout-boxed'class\x3d'pull-right'/\x3e Boxed Layout\x3c/label\x3e\x3cp\x3eActivate the boxed layout\x3c/p\x3e\x3c/div\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-layout\x3d'sidebar-collapse' class\x3d'pull-right'/\x3e Toggle Sidebar\x3c/label\x3e\x3cp\x3eToggle the left sidebar's state (open or collapse)\x3c/p\x3e\x3c/div\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-enable\x3d'expandOnHover' class\x3d'pull-right'/\x3e Sidebar Expand on Hover\x3c/label\x3e\x3cp\x3eLet the sidebar mini expand on hover\x3c/p\x3e\x3c/div\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-controlsidebar\x3d'control-sidebar-open' class\x3d'pull-right'/\x3e Toggle Right Sidebar Slide\x3c/label\x3e\x3cp\x3eToggle between slide over content and push content effects\x3c/p\x3e\x3c/div\x3e\x3cdiv class\x3d'form-group'\x3e\x3clabel class\x3d'control-sidebar-subheading'\x3e\x3cinput type\x3d'checkbox' data-sidebarskin\x3d'toggle' class\x3d'pull-right'/\x3e Toggle Right Sidebar Skin\x3c/label\x3e\x3cp\x3eToggle between dark and light skins for the right sidebar\x3c/p\x3e\x3c/div\x3e");
var e=a("\x3cul /\x3e",{"class":"list-unstyled clearfix"}),d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-blue' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px; background: #367fa9;'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-light-blue' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222d32;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3eBlue\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-black' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv style\x3d'box-shadow: 0 0 2px rgba(0,0,0,0.1)' class\x3d'clearfix'\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px; background: #fefefe;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 7px; background: #fefefe;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3eBlack\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-purple' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-purple-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-purple' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222d32;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3ePurple\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-green' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-green-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-green' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222d32;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3eGreen\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-red' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-red-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-red' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222d32;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3eRed\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-yellow' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-yellow-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-yellow' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #222d32;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin'\x3eYellow\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-blue-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px; background: #367fa9;'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-light-blue' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px'\x3eBlue Light\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-black-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv style\x3d'box-shadow: 0 0 2px rgba(0,0,0,0.1)' class\x3d'clearfix'\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px; background: #fefefe;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 7px; background: #fefefe;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px'\x3eBlack Light\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-purple-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-purple-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-purple' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px'\x3ePurple Light\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-green-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-green-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-green' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px'\x3eGreen Light\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-red-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-red-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-red' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px'\x3eRed Light\x3c/p\x3e");
e.append(d);d=a("\x3cli /\x3e",{style:"float:left; width: 33.33333%; padding: 5px;"}).append("\x3ca href\x3d'javascript:void(0);' data-skin\x3d'skin-yellow-light' style\x3d'display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)' class\x3d'clearfix full-opacity-hover'\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 7px;' class\x3d'bg-yellow-active'\x3e\x3c/span\x3e\x3cspan class\x3d'bg-yellow' style\x3d'display:block; width: 80%; float: left; height: 7px;'\x3e\x3c/span\x3e\x3c/div\x3e\x3cdiv\x3e\x3cspan style\x3d'display:block; width: 20%; float: left; height: 20px; background: #f9fafc;'\x3e\x3c/span\x3e\x3cspan style\x3d'display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;'\x3e\x3c/span\x3e\x3c/div\x3e\x3c/a\x3e\x3cp class\x3d'text-center no-margin' style\x3d'font-size: 12px;'\x3eYellow Light\x3c/p\x3e");
e.append(d);k.append("\x3ch4 class\x3d'control-sidebar-heading'\x3eSkins\x3c/h4\x3e");k.append(e);f.append(k);a("#control-sidebar-home-tab").after(f);(function(){var d;"undefined"!==typeof Storage?d=localStorage.getItem("skin"):(window.alert("Please use a modern browser to properly view this template!"),d=void 0);d&&a.inArray(d,h)&&g(d);a("[data-skin]").on("click",function(b){b.preventDefault();g(a(this).data("skin"))});a("[data-layout]").on("click",function(){c(a(this).data("layout"))});a("[data-controlsidebar]").on("click",
function(){c(a(this).data("controlsidebar"));var d=!b.options.controlSidebarOptions.slide;(b.options.controlSidebarOptions.slide=d)||a(".control-sidebar").removeClass("control-sidebar-open")});a("[data-sidebarskin\x3d'toggle']").on("click",function(){var b=a(".control-sidebar");b.hasClass("control-sidebar-dark")?(b.removeClass("control-sidebar-dark"),b.addClass("control-sidebar-light")):(b.removeClass("control-sidebar-light"),b.addClass("control-sidebar-dark"))});a("[data-enable\x3d'expandOnHover']").on("click",
function(){a(this).attr("disabled",!0);b.pushMenu.expandOnHover();a("body").hasClass("sidebar-collapse")||a("[data-layout\x3d'sidebar-collapse']").click()});a("body").hasClass("fixed")&&a("[data-layout\x3d'fixed']").attr("checked","checked");a("body").hasClass("layout-boxed")&&a("[data-layout\x3d'layout-boxed']").attr("checked","checked");a("body").hasClass("sidebar-collapse")&&a("[data-layout\x3d'sidebar-collapse']").attr("checked","checked")})()})(jQuery,$.AdminLTE);