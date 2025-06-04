let numero = gerarNumero();
let tentativas = 1;

function exibirTextoNaTela(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function exibirMensagemInicial(){
    exibirTextoNaTela('h1', 'Descubra o número');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');
}

exibirMensagemInicial();

function verificarChute(){
    let chute = document.querySelector('input').value;
    if(chute == numero){
        exibirTextoNaTela('h1', 'Você acertou!');
        let palavra = tentativas > 1 ? 'tentativas' : 'tentativa';
        let menssagem = `Parabéns, você conseguiu acertar na ${tentativas} ${palavra}!`;
        exibirTextoNaTela('p', menssagem);
        document.getElementById('reiniciar').removeAttribute('disabled');
    }
    else{
        if(chute > numero){
            exibirTextoNaTela('p', 'O número é menor que o chute!')
        }
        else{
            exibirTextoNaTela('p', 'O número é maior que o chute!')
        }
        tentativas++;
        limparCampo();
    }
}

function gerarNumero(){
    return parseInt(Math.random() * 10 + 1);
}

function limparCampo(){
    chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo(){
    numero = gerarNumero();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true)
}