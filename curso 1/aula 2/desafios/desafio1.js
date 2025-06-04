let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do desafio';

function mostrarConsole(){
    console.log('O botão foi clicado');
}

function mostrarAlerta(){
    alert('Eu amo JS')
}

function mostarPrompt(){
    let cidade = prompt('Me diga o nome de uma cidade do Brasil');
    alert("Estive em " + cidade + " e lembrei de você");
}

function mostrarSoma(){
    let num1 = prompt('Digite um número');
    let num2 = prompt('Digite um número');
    let resultado = num1 + num2;

    alert("A soma dos números é " + resultado);
}