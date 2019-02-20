SYNCHRONIZACJA - METODY WAIT ORAZ NITIFYALL:


Program pokazuje jak dwie stworzone klasy moga pobierac jeden zasób w różnych wątkach.
Za pomocą metod wait oraz  notifyAll program pokazuje działanie zsynchronizowanych
wątków, korzystającyhc z jednego zasobu w nieskonczonośc

wait () - zmusza wątek do czekania chyba, ze inny wątek wywola notify  na tym obiekcie
notify () - odblokowywuije wątek

- korzystanie z bloków synchronized()