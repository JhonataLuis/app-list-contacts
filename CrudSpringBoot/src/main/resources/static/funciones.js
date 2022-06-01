function eliminar(id){
	
	swal({
  title: "Tem certeza de Eliminar?",
  text: "Uma vez excluído, você não poderá recuperar este arquivo imaginário!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	
	$.ajax({
		url: "/eliminar/"+id,
		success: function(res){
			console.log(res);
		}
	});
    swal("Puf! Seu arquivo imaginário foi excluído!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/listar";
		}
});
  } else {
    swal("Seu arquivo imaginário está seguro!");
  }
});
}

function eliminarUsuario(id){
	
	swal({
  title: "Tem certeza de Eliminar?",
  text: "Uma vez excluído, você não poderá recuperar este arquivo imaginário!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	
		$.ajax({
				url: "/delete/"+id,
				success: function(res){
					console.log(res);
				}
		});
    swal("Puf! Seu arquivo imaginário foi excluído!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/listarUsuario"
		}
});
  } else {
    swal("Seu arquivo imaginário está seguro!");
  }
});
	
}