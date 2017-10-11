<%@ include file="templates/header.jsp" %>  

<title>Form</title>

<%@ include file="templates/menu.jsp" %>


<div class="container">
	<div class="row">
		<div class="col-md-12 text-center">
			<h1>Formulario</h1>
		</div>
		
		<div class="col-md-12 text-center">
			<h1>Cilindro:</h1>
		</div>
		<form action="./servlet/figuras" method="post" class="form-horizontal">
			<input type="hidden" name="type" value="cilindro">
		
			<div class="form-group">
                <label for="radio" class="col-md-2 control-label">Radio: </label>
                <div class="col-md-2">
                    <input type="text" id="radio"class="form-control" name="radio" value="" autofocus>
                </div>
            </div>
            			
			<div class="form-group">
                <label for="altura" class="col-md-2 control-label">Altura: </label>
                <div class="col-md-2">
                    <input type="text" id="altura"class="form-control" name="altura" value="" >
                </div>
            </div>		
            
            <div class="form-group">  
            	<div class="col-md-4">    
            		<label class="checkbox-inline"><input type="checkbox" name="area" value="1">Area</label>
					<label class="checkbox-inline"><input type="checkbox" name="volumen" value="1">Volumen</label>
            	</div>              	
            </div>	          	
			
			<div class="form-group">
                <div class="col-md-6 col-md-offset-4">
					<input type="submit" class="btn btn-primary" role="button" value="Submit" />
				</div>
			</div>
		</form>
		
		
		<div class="col-md-12 text-center">
			<h1>Cono:</h1>
		</div>
		<form action="./servlet/figuras" method="post" class="form-horizontal">
			<input type="hidden" name="type" value="cono">
			<div class="form-group">
                <label for="radio" class="col-md-2 control-label">Radio: </label>
                <div class="col-md-2">
                    <input type="text" id="radio"class="form-control" name="radio" value="" autofocus>
                </div>
            </div>
            			
			<div class="form-group">
                <label for="altura" class="col-md-2 control-label">Altura: </label>
                <div class="col-md-2">
                    <input type="text" id="altura"class="form-control" name="altura" value="" >
                </div>
            </div>		
            
            <div class="form-group">  
            	<div class="col-md-4">    
            		<label class="checkbox-inline"><input type="checkbox" name="area" value="1">Area</label>
					<label class="checkbox-inline"><input type="checkbox" name="volumen" value="1">Volumen</label>
            	</div>              	
            </div>	          	
			
			<div class="form-group">
                <div class="col-md-6 col-md-offset-4">
					<input type="submit" class="btn btn-primary" role="button" value="Submit" />
				</div>
			</div>
		</form>
		
		
		
		<div class="col-md-12 text-center">
			<h1>Cubo:</h1>
		</div>
		<form action="./servlet/figuras" method="post" class="form-horizontal">
			<input type="hidden" name="type" value="cubo">
			<div class="form-group">
                <label for="altura" class="col-md-2 control-label">Altura: </label>
                <div class="col-md-2">
                    <input type="text" id="altura"class="form-control" name="altura" value="" autofocus>
                </div>
            </div>
            
            <div class="form-group">  
            	<div class="col-md-4">    
            		<label class="checkbox-inline"><input type="checkbox" name="area" value="1">Area</label>
					<label class="checkbox-inline"><input type="checkbox" name="volumen" value="1">Volumen</label>
            	</div>              	
            </div>	          	
			
			<div class="form-group">
                <div class="col-md-6 col-md-offset-4">
					<input type="submit" class="btn btn-primary" role="button" value="Submit" />
				</div>
			</div>
		</form>
		
		
		
		<div class="col-md-12 text-center">
			<h1>Esfera:</h1>
		</div>
		<form action="./servlet/figuras" method="post" class="form-horizontal">
			<input type="hidden" name="type" value="esfera">
			<div class="form-group">
                <label for="radio" class="col-md-2 control-label">Radio: </label>
                <div class="col-md-2">
                    <input type="text" id="radio"class="form-control" name="radio" value="" autofocus>
                </div>
            </div>
                        
            <div class="form-group">  
            	<div class="col-md-4">    
            		<label class="checkbox-inline"><input type="checkbox" name="area" value="1">Area</label>
					<label class="checkbox-inline"><input type="checkbox" name="volumen" value="1">Volumen</label>
            	</div>              	
            </div>	          	
			
			<div class="form-group">
                <div class="col-md-6 col-md-offset-4">
					<input type="submit" class="btn btn-primary" role="button" value="Submit" />
				</div>
			</div>
		</form>
		
		
	</div>
</div>

<%@ include file="templates/footer.jsp" %>  