/* fadein
---------------------------------------------------- */
$(function() {
	$('.fadein_b').on('inview', function(event, isInView, visiblePartX, visiblePartY) {
		if(isInView){
			$(this).stop().addClass('fadein');
		}
	});
});


$(function(){
  $('.hamburger').on('click', function(){
    $('#navigation').animate({width: 'toggle'}, 400);
    $(this).toggleClass('active');
  });
});