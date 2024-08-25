
const indexes = document.querySelectorAll('.indexes li');
const tabs = document.querySelectorAll('.tab');
const contents = document.querySelectorAll('.tab-content');

function reset() {
  for (let i = 0; i < tabs.length; i++) {
    indexes[i].style.borderColor = 'transparent';
    tabs[i].style.zIndex = 0;
    tabs[i].classList.remove('active');
    contents[i].classList.remove('active');
  }
}

function showTab(i) {
  indexes[i].style.borderColor = 'rgba(211,38,38,0.6)';
  tabs[i].style.opacity = 1;
  tabs[i].style.zIndex = 5;
  tabs[i].classList.add('active');
  contents[i].classList.add('active');
}

function activate(e) {
  if (!e.target.matches('.indexes li')) return;
  reset();
  showTab(e.target.dataset.index);
}

const init = () => showTab(0);

window.addEventListener('load',init,false);
window.addEventListener('click',activate,false);


// ADD CODIGOS ABAIXO PARA PAG MEMBROS
document.addEventListener('DOMContentLoaded', () => {
  const membrosTab = document.getElementById('membros-tab');
  const membrosContent = document.getElementById('membros-content');
  const container = document.querySelector('.container');

  // Função para mostrar a .container quando clicar em MEMBROS
  membrosTab.addEventListener('click', () => {
    container.style.display = 'block';
  });

  // Função para esconder a .container quando sair da aba MEMBROS
  const tabs = document.querySelectorAll('.indexes li');
  tabs.forEach(tab => {
    tab.addEventListener('click', () => {
      if (tab !== membrosTab) {
        container.style.display = 'none';
      }
    });
  });
});
