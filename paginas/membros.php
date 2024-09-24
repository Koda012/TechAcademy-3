<main>

    <div class="div-membros">

        <div class="div-card">
            <div>
                <img src="img/mv.jpg" alt="Marcos Vinicius" title="Marcos Vinicius" class="img-membros">
            </div>

            <div class="text-membros">
                <h4>Marcos Vinicius</h4>
                <p>Estudante TADS 2° Período, e a procura de um estágio. Tenho 20 anos e resido em Campo Mourão.</p>
            </div>
            <div class="sociais-membros">
                <a class="a-icon" href="https://www.instagram.com/marcosvn06/" target="_blank">
                    Instagram<i id="icon-instagram" class="fa-brands fa-instagram"></i>
                </a>

                <a class="a-icon" href="https://github.com/Marcosvini0001" target="_blank">
                    GitHub<i id="icon-github" class="fa-brands fa-github"></i></i>
                </a>
            </div>
        </div>


        <div class="div-card">
            <div>
                <img src="img/lucas.png" alt="Lucas Koji" title="Lucas Koji" class="img-membros">
            </div>

            <div class="text-membros">
                <h4>Lucas Koji</h4>
                <p>Estudante TADS 2° Período, Estudante de Direito 6° Período. Tenho 20 anos e resido em Campo Mourão.</p>
            </div>
            <div class="sociais-membros">
                <a class="a-icon" href="https://www.instagram.com/_koji_n/" target="_blank">
                    Instagram<i id="icon-instagram" class="fa-brands fa-instagram"></i>
                </a>

                <a class="a-icon" href="https://github.com/Koda012" target="_blank">
                    GitHub<i id="icon-github" class="fa-brands fa-github"></i>
                </a>
            </div>
        </div>


    </div>
    <div class="div-btn-voltar">
        <button class="btn-membrosvoltar" id="btn-membrosvoltar"><i class="fa-solid fa-arrow-left"></i>Voltar</button>
    </div>
    <script>
        document.getElementById('btn-membrosvoltar').addEventListener('click', function() {
            window.location.href = 'home';
        })
    </script>
</main>

<style>
    .div-membros {
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 40px;
        margin: 80px;

        .div-card {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            width: 300px;
            gap: 20px;
            padding: 16px;
            box-shadow: 2px 2px 10px 2px var(--primary);
        }

        .img-membros {
            width: 150px;
            border-radius: 50%;
        }

        .text-membros {
            display: flex;
            text-align: center;
            flex-direction: column;
        }

        .sociais-membros {
            a {
                text-decoration: none;
                color: var(--primary);
                padding: 8px;
            }

            #icon-github {
                color: white;
                font-size: 15px;
            }

            #icon-instagram {
                color: #E1306C;
                font-size: 15px;
            }

            #icon-instagram,
            #icon-github {
                padding: 4px;
            }
        }

        .a-icon:hover {
            background-color: #ccc;
            transition: 0.5s;
            border-radius: 20px;
            color: black;

            #icon-github {
                color: black;
                transition: 0.5s;
            }
        }
    }

    .div-btn-voltar {
        display: flex;
        justify-content: center;
        align-items: center;

    }

    .btn-membrosvoltar{
        background-color: #B8860B;
        padding: 8px;
        border-radius: 8px;
        border: 1px solid #B8860B;
        cursor: pointer;
    }


    .btn-membrosvoltar:hover {
        background-color: transparent;
        color: white;
        cursor: pointer;
    }
</style>