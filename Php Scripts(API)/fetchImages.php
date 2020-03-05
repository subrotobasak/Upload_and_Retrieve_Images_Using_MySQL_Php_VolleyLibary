<?php
    $connect = mysqli_connect("localhost","id12226132_shawon","12345678","id12226132_employee_management_system");


        if($_SERVER['REQUEST_METHOD'] =='POST')
            {
    
     
			$result = array();
			$result['data'] = array();
			$select= "SELECT *from imageData";
			$responce = mysqli_query($connect,$select);
	
            
			while($row = mysqli_fetch_array($responce))
			{
		
		    $index['id']      = $row['0'];
		    $index['image']   = $row['1'];
				
			array_push($result['data'], $index);
			
				
			}
			$result["success"]="1";
		    echo json_encode($result);
			mysqli_close($connect);
	


            }	
?>