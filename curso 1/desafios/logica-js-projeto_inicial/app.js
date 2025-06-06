function exibir(){
    console.log('Olá Mundo')
}

exibir();

function exibirNome(nome){
    return nome = 'Enrique';
}

console.log('Olá', exibirNome());
exibirNome();

function numeroDobro(numero){
    return numero * 2;
}

console.log(numeroDobro(7));
numeroDobro();

function mediaNotas(num1, num2, num3){
    let soma = num1 + num2 + num3;
    let media = soma / 3;
    return media;
}

console.log(mediaNotas(10,9,8));
mediaNotas();

function exibirNumeroMaior(num1, num2){
    if(num1 > num2){
        return ('O número ' + num1 + ' é maior');
    }
    else{
        return ('O número ' + num2 + ' é maior');
    }
}

console.log(exibirNumeroMaior(8,4));
exibirNumeroMaior();

function numeroMultiplicado(numero){
    return numero * numero;
}

console.log(numeroMultiplicado(8));
numeroMultiplicado();