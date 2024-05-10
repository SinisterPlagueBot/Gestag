<%@page import="beans.Stage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Page4StyleSheet.css">
    <title>Inscription Stage - Creation Stagiaire</title>
    <script>
    // Function to redirect to NvInscription.page2 with codeStage parameter
    function redirectToNvInscription(codeStage) {
        window.location.href = "NvInscription.page2?codeStage=" + codeStage;
    }

    // Function to redirect to ListByDate.page1
    function redirectToListByDate() {
        window.location.href = "ListByDate.page1";
    }
</script>
</head>
<body>
	<header>
        <div class="header">
            <h1 id="title">Inscription � Un Stage</h1>
            <h2 id="copyright">&copy;opyright Gestag-app 2024.</h2>
        </div>
        <svg class="header-line" viewBox="0 0 1069 7" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M2 2L1067 4.97209" stroke="#109E34" stroke-width="4" stroke-linecap="round"/>
        </svg>     
    </header>
    <main>
      <svg class="devellopement" width="888" height="84" viewBox="0 0 888 84" fill="none" xmlns="http://www.w3.org/2000/svg">
        <circle cx="38" cy="38" r="38" transform="matrix(-1 0 0 1 76 8)" fill="#0D912E"/>
        <path d="M36.8655 59V36.84L32.2655 37.92V34L39.0255 31H42.1855V59H36.8655Z" fill="white"/>
        <circle cx="38" cy="38" r="38" transform="matrix(-1 0 0 1 346 8)" fill="#0D912E"/>
        <path d="M298.614 59V55.28C300.321 53.8667 301.974 52.4667 303.574 51.08C305.201 49.6933 306.641 48.32 307.894 46.96C309.174 45.6 310.188 44.28 310.934 43C311.708 41.6933 312.094 40.4267 312.094 39.2C312.094 38.0533 311.774 37.04 311.134 36.16C310.521 35.28 309.494 34.84 308.054 34.84C306.588 34.84 305.481 35.32 304.734 36.28C303.988 37.24 303.614 38.4 303.614 39.76H298.654C298.708 37.7067 299.161 36 300.014 34.64C300.868 33.2533 302.001 32.2267 303.414 31.56C304.828 30.8667 306.414 30.52 308.174 30.52C311.028 30.52 313.241 31.3067 314.814 32.88C316.414 34.4267 317.214 36.44 317.214 38.92C317.214 40.4667 316.854 41.9733 316.134 43.44C315.441 44.9067 314.521 46.32 313.374 47.68C312.228 49.04 310.988 50.32 309.654 51.52C308.321 52.6933 307.028 53.7867 305.774 54.8H317.894V59H298.614Z" fill="white"/>
        <circle cx="38" cy="38" r="38" transform="matrix(-1 0 0 1 617 8)" fill="#0D912E"/>
        <path d="M578.966 59.48C577.126 59.48 575.459 59.16 573.966 58.52C572.473 57.8533 571.273 56.84 570.366 55.48C569.459 54.12 568.979 52.4133 568.926 50.36H573.966C573.993 51.72 574.433 52.8667 575.286 53.8C576.166 54.7067 577.393 55.16 578.966 55.16C580.459 55.16 581.606 54.7467 582.406 53.92C583.206 53.0933 583.606 52.0533 583.606 50.8C583.606 49.3333 583.073 48.2267 582.006 47.48C580.966 46.7067 579.619 46.32 577.966 46.32H575.886V42.12H578.006C579.366 42.12 580.499 41.8 581.406 41.16C582.313 40.52 582.766 39.5733 582.766 38.32C582.766 37.28 582.419 36.4533 581.726 35.84C581.059 35.2 580.126 34.88 578.926 34.88C577.619 34.88 576.593 35.2667 575.846 36.04C575.126 36.8133 574.726 37.76 574.646 38.88H569.646C569.753 36.2933 570.646 34.2533 572.326 32.76C574.033 31.2667 576.233 30.52 578.926 30.52C580.846 30.52 582.459 30.8667 583.766 31.56C585.099 32.2267 586.099 33.12 586.766 34.24C587.459 35.36 587.806 36.6 587.806 37.96C587.806 39.5333 587.366 40.8667 586.486 41.96C585.633 43.0267 584.566 43.7467 583.286 44.12C584.859 44.44 586.139 45.2133 587.126 46.44C588.113 47.64 588.606 49.16 588.606 51C588.606 52.5467 588.233 53.96 587.486 55.24C586.739 56.52 585.646 57.5467 584.206 58.32C582.793 59.0933 581.046 59.48 578.966 59.48Z" fill="white"/>
        <circle cx="38" cy="38" r="38" transform="matrix(-1 0 0 1 888 8)" fill="#EFF0F6"/>
        <path d="M852.708 59V53.8H838.908V49.72L852.028 31H857.828V49.36H861.508V53.8H857.828V59H852.708ZM844.388 49.36H853.028V36.64L844.388 49.36Z" fill="#0D912E"/>
        <rect x="361" y="40" width="165" height="13" rx="6.5" fill="#EFF0F7"/>
        <rect x="631" y="40" width="165" height="13" rx="6.5" fill="#EFF0F7"/>
        <rect x="93" y="40" width="165" height="13" rx="6.5" fill="#EFF0F7"/>
        <rect x="93" y="40" width="165" height="13" rx="6.5" fill="#0D912E"/>
        <rect x="362" y="40" width="165" height="13" rx="6.5" fill="#EFF0F7"/>
        <rect x="361" y="40" width="166" height="13" rx="6.5" fill="#0D912E"/>
        <rect x="631" y="40" width="75" height="13" rx="6.5" fill="#0D912E"/>
      </svg>
        
      <%
      Stage s = (Stage)request.getAttribute("s");
      %>
        
      <h1 class="title">Cr�ation Stagiaire</h1>

      <form action="create.page4" method="get">
      <input type="hidden" name="codeStage" value="<%=s.getCode_stage() %>">
        <div class="labelsInputContainer">
          <label class="labels" for="Nom">Nom</label>
          <input class="inputs" type="text" id="Nom" name="Nom" placeholder="Nom" required>
        </div>
        <div class="labelsInputContainer">
          <label class="labels" for="Prenom">Prenom</label>
          <input class="inputs" type="text" id="Prenom" name="Prenom" placeholder="Prenom" required>
        </div>
        <div class="labelsInputContainer">
          <label class="labels" for="Date_de_Naissance">Date de Naissance</label>
          <input class="inputs" type="text" id="Date_de_Naissance" name="DateDeNaissance" placeholder="YYYY-MM-DD" pattern="[0-9]{4}-{0-9}{2}-{0-9}{2}" required>
        </div>
        <div class="labelsInputContainer">
          <label class="labels" for="Diplome">Diplome</label>
          <input class="inputs" type="text" id="Diplome" name="Diplome" placeholder="Diplome" required>
        </div>
        <div class="labelsInputContainer">
          <label class="labels" for="Sexe">Sexe</label>
          <select  id="Sexe" name="Sexe">
            <option value="Femme">Femme</option>
            <option value="Homme">Homme</option>
          </select>
        </div>
        <div class="buttonContainer">
            <!-- Use input type="button" with onclick event for leftBtn -->
            <input type="button" class="leftBtn" value="Retour Inscription" onclick="redirectToNvInscription('<%=s.getCode_stage() %>')">
            <!-- Use input type="submit" for middleBtn -->
            <input type="submit" class="middleBtn" value="Creation">
            <!-- Use input type="button" with onclick event for rightBtn -->
            <input type="button" class="rightBtn" value="Retour Debut" onclick="redirectToListByDate()">
        </div>
      </form>
    </main>    
</body>
</html>