$(window).on("load",function(){
	'use strict';

	// Cache document for fast access.

	$('a.toggle-menu').click(function(){
        $('.responsive .main-menu').toggle();
        return false;
    });

    $('.responsive .main-menu a').click(function(){
        $('.responsive .main-menu').hide();
        

    });
    
});

