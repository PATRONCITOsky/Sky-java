/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global swal */

$(document).ready(function () {
    $("tr #btnDelete").click(function () {
        /* Acá se hace la captura del id producto*/
        var idp = $(this).parent().find("#idp").val();
        swal({
            title: "Está seguro de eliminarlo?",
            text: "Usted puede agregarlo de nuevo!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(idp);
                        swal("Puf! Su archivo ha sido eliminado! Perdio :c", {
                            icon: "success",
                        }).then((willDelete) => {
                            if (willDelete) {
                                parent.location.href = "Ccar?menu=usuario&accion=carrito";
                            }
                        });
                    } else {
                        swal("El registro no se elimino");
                    }
                });

    });
    function eliminar(idp) {
        var url = "Ccar?menu=usuario&accion=Delete";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp="+idp,
            success: function (data, textStatus, jqXHR) {
                
            }
        });
    }
    
    $(" tr #cantidad").click(function () {
        var idp = $(this).parent().find("#idpr").val();
        var can = $(this).parent().find("#cantidad").val();
        var url ="Ccar?menu=usuario&accion=EditCan";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp="+idp+"&can="+can,
            success: function (data, textStatus, jqXHR) {
                location.href = "Ccar?menu=usuario&accion=carrito";
            }
        });
        
        
    });
    
    
});
