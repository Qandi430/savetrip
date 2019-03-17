$(document).ready(function(){
    $(".confg").click(function(){
        $(".confgNav").addClass("on")
    })
    $(".closeConfg").click(function(){
        $(".confgNav").removeClass("on")
    })

    /*modal*/
    $("[data-event=modal]").click(function(){
        var target = $(this).data("target");
        $("#modal").addClass("open")
        $("#modal").append("<div class='modalBackdrop' onclick='closeModal()'></div>")
        $("#modal .modalBackdrop").animate({"opacity":"1"},500)
        setTimeout(function(){
            $(target).addClass("active")
            $(target).animate({"opacity":"1"},500)
        },500);
    });



    $("#modal .cancle").click(function(){
        closeModal();
    });



    /**addExpensse */
    $(".infoNav ul li.add").click(function(e){
        e.preventDefault();
        $("body").addClass("openExpense")
        $("body").append(`
        <div id="expense">
            <a href="#" class="plus"><i class="fas fa-plus"></i><br>수입</a>
            <a href="#" class="minus"><i class="fas fa-minus"></i><br>지출</a>
            <a href="#" class="cancle"><i class="fas fa-times"></i></a>
        </div>
        `)
        $("#expense .cancle").click(function(e){
            e.preventDefault();
            $("#expense").animate({"opacity":"0"},500);
            setTimeout(() => {
                $("body").removeClass("openExpense");
                $("#expense").remove();
            }, 500);
        })
    })

})
function closeModal(){
    $(".modalInner").animate({"opacity":"0"},500)
    setTimeout(function(){
        $(".modalInner").removeClass("active");
        setTimeout(function(){
            $("#modal .modalBackdrop").animate({"opacity":"0"},500)
            setTimeout(function(){
                $("#modal .modalBackdrop").remove();
                $("#modal").removeClass("open");
            },500);
        },500);
    },500)
};


// function customBtn(className,colorName){
//     var target = $(className);
//     target.click(function(e){
//         unCheckCustomBtn(colorName);
//         checkCustomBtn(e.currentTarget,colorName);
//     })
// };
