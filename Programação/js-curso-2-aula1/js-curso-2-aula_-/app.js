let tentativas = 1;
let listaDeNumerosSorteados = [];

const exibirTextoNaTela = (tag, texto) => {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, "Brazilian Portuguese Female", { rate: 1.1 });
};

const verificarChute = () => {
    let chute = document.querySelector("input").value;

    if (chute == numeroSecreto) {
        let mensagemTentativas = `Você descobriu o número secreto com ${tentativas} ${
            tentativas > 1 ? "tentativas" : "tentativa"
        }!`;
        exibirTextoNaTela("h1", "Acertou!");
        exibirTextoNaTela("p", mensagemTentativas);
        document.getElementById("reiniciar").removeAttribute("disabled");
    } else {
        if (chute > numeroSecreto) {
            exibirTextoNaTela("p", "O número secreto é menor");
        } else {
            exibirTextoNaTela("p", "O número secreto é maior");
        }
        tentativas++;
        limparCampo();
    }
};

const exibirMensagemInicial = () => {
    exibirTextoNaTela("h1", "Jogo do número secreto");
    exibirTextoNaTela("p", "Escolha um número de 1 a 10!");
};

const limparCampo = () => {
    chute = document.querySelector("input");
    chute.value = "";
};

const gerarNumeroAletorio = () => {
    let numeroEscolhido = parseInt(Math.random() * 10 + 1);
    let quantidadeDeElementos = listaDeNumerosSorteados.length();

    if (quantidadeDeElementos == 3) {
        listaDeNumerosSorteados = [];
    }

    if (listaDeNumerosSorteados.includes(numeroEscolhido)) {
        return gerarNumeroAletorio();
    } else {
        listaDeNumerosSorteados.push(numeroEscolhido);
        return numeroEscolhido;
    }
};

let numeroSecreto = gerarNumeroAletorio();

const reiniciarJogo = () => {
    numeroSecreto = gerarNumeroAletorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial();
    document.getElementById("reiniciar").setAttribute("disabled", true);
};

exibirTextoNaTela("h1", "Jogo do número secreto");
exibirTextoNaTela("p", "Escolha um número de 1 a 10!");
exibirMensagemInicial();
