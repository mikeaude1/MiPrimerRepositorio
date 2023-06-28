$(function(){
    if ((document.location.host.indexOf('.dev') > -1) || (document.location.host.indexOf('modernui') > -1) ) {
        $("<script/>").attr('src', '/public/javascripts/new/metro-loader.js').appendTo($('head'));
    }
})