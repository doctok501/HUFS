//놀이공원 입장료
<?php
    $age = 68;
    $welfare = "no";
    $youkong = "yes";
    $after = "no";

    if($age < 3)
        $fee = "free";
    elseif((3 <= $age && $age <= 13) || ($after == "yes"))
        $fee = "4dollar";
    elseif((14 <= $age && $age <= 18) || (70 <= $age) || 
        ($welfare == "yes") || ($youkong == "yes"))
        $fee = "8dollar";
    else
        $fee = "10dollar"

    echo "복지 카드 : $welfare<br>"
    echo "국가 유공자증 소지 : $youkong<br>"
    echo "17시 이후 입장 : $after<br>"
    echo "age : $age 살<br><br>"
    echo "입장료 : $fee"

    ?>
