function comprar(){
    let tipoIngresso = document.getElementById('tipo-ingresso').value;
    let quantidade = parseInt(document.getElementById('qtd').value);

    if(tipoIngresso == 'pista'){
        comprarPista(quantidade);
    }
    else if(tipoIngresso == 'superior'){
        comprarSuperior(quantidade);
    }
    else{
        comprarInferior(quantidade);
    }
}

function comprarPista(quantidade){
    let quantidadePista = parseInt(document.getElementById('qtd-pista').textContent);
    if(quantidade > quantidadePista.textContent){
        alert('Quantidade indisponível!');
    }
    else{
        quantidadePista = quantidadePista - quantidade;
        document.getElementById('qtd-pista').innerHTML = quantidadePista;
        alert('Sua compra foi realizada com sucesso!');
    }
}

function comprarSuperior(quantidade){
        let quantidadeSuperior = parseInt(document.getElementById('qtd-superior').textContent);
    if(quantidade > quantidadeSuperior.textContent){
        alert('Quantidade indisponível!');
    }
    else{
        quantidadeSuperior = quantidadeSuperior - quantidade;
        document.getElementById('qtd-superior').innerHTML = quantidadeSuperior;
        alert('Sua compra foi realizada com sucesso!');
    }
}

function comprarInferior(quantidade){
    let quantidadeInferior = parseInt(document.getElementById('qtd-inferior').textContent);
    if(quantidade > quantidadeInferior.textContent){
        alert('Quantidade indisponível!');
    }
    else{
        quantidadeInferior = quantidadeInferior - quantidade;
        document.getElementById('qtd-inferior').innerHTML = quantidadeInferior;
        alert('Sua compra foi realizada com sucesso!');
    }
}