    <script>
        let input = document.getElementById('hexc');
        let message = document.getElementById('message');
        let smessage = document.getElementById('smessage');
        let asking = document.getElementById('asking');
        let place = document.getElementById('counter');
        let turn = document.getElementById('turn');
        let counter = 0;
        let turns = 0;

        function add() {
            place.style.visibility = 'visible';
            place.innerHTML = counter;
            turn.innerHTML = "Turns: " + turns;
            counter += 1;
            turns += 1;
        }

        function subtract() {
            place.style.visibility = 'visible';
            place.innerHTML = counter;
            turn.innerHTML = "Turns: " + turns;
            counter -= 1;
            turns += 1;
        }

        function dav() {
            asking.style.display = 'none';
            message.style.display = 'block';
            smessage.style.visibility = 'visible';

            if (input.value !== "") {
                message.innerHTML = input.value;
            } else {
                message.innerHTML = "Enter a your name";
            }
        }
