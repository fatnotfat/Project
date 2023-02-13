(function($) {

    // Handle click on toggle search button
    $('#toggle-search').click(function() {
        $('#search-form, #toggle-search').toggleClass('open');
        return false;
    });

    // Handle click on search submit button
    $('#search-form input[type=submit]').click(function() {
        $('#search-form, #toggle-search').toggleClass('open');
        return true;
    });

    // Clicking outside the search form closes it
    $(document).click(function(event) {
        var target = $(event.target);
  
        if (!target.is('#toggle-search') && !target.closest('#search-form').size()) {
            $('#search-form, #toggle-search').removeClass('open');
        }
    });

})(jQuery);