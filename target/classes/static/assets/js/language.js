$('[lang]').hide(); // hide all language input at the start
$('[lang="en"]').show(); // show default language
$('#lang-switch').change(function () { //show language based on switch cases
    var lang = $(this).val();
    switch (lang) {
        case 'de':
            $('[lang]').hide();
            $('[lang="de"]').show();
            break;
        case 'en':
            $('[lang]').hide();
            $('[lang="en"]').show();
            break;
        default:
            $('[lang]').hide();
            $('[lang="de"]').show();
    }
});