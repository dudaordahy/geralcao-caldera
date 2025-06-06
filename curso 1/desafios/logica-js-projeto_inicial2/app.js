function somarImc(peso, altura){
    return peso / altura;
}

console.log(somarImc(70, 1.60));
somarImc();

function valorFatorial(numero){
    if(numero === 0 || numero === 1){
        return 1;
    }
    else{
        return numero * valorFatorial(numero - 1);
    }
}
 let numero = 4;
 let resultado = valorFatorial(numero);
 console.log(`O fatorial de ${numero} é ${resultado}`);
