<main>

    <div class="div-membros">

        <div class="div-card">
            <div>
                <img src="img/mv.jpg" alt="Marcos Vinicius" title="Marcos Vinicius" class="img-membros">
            </div>

            <div class="text-membros">
                <h4>Marcos Vinicius</h4>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Totam rem error sit,
                    exercitationem labore eius accusantium voluptatem quod odit eaque aliquid doloremque
                    ad sed? Dicta ipsum architecto qui sunt aliquid.</p>
            </div>
            <div class="sociais-membros">
                <a class="a-icon" href="">
                    Instagram<i id="icon-instagram" class="fa-brands fa-instagram"></i>
                </a>

                <a class="a-icon" href="">
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
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Totam rem error sit,
                    exercitationem labore eius accusantium voluptatem quod odit eaque aliquid doloremque
                    ad sed? Dicta ipsum architecto qui sunt aliquid.</p>
            </div>
            <div class="sociais-membros">
                <a class="a-icon" href="">
                    Instagram<i id="icon-instagram" class="fa-brands fa-instagram"></i>
                </a>

                <a class="a-icon" href="">
                    GitHub<i id="icon-github" class="fa-brands fa-github"></i>
                </a>
            </div>
        </div>


    </div>

</main>

<style>
    .div-membros {
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        gap: 40px;
        margin: 40px;

        .div-card {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            border: 1px solid var(--primary);
            width: 500px;
            gap: 20px;
            padding: 16px;
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

            #icon-github{
                color: white;
                font-size: 15px;
            }

            #icon-instagram{
                color: #E1306C;
                font-size: 15px;
            }

            #icon-instagram, #icon-github {
                padding: 4px;
            }
        }
        .a-icon:hover{
            background-color: #ccc;
            transition: 0.5s;
            border-radius: 20px;
            color: black;
            #icon-github{
                color: black;
                transition: 0.5s;
            }
        }
    }
</style>