package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Client;
import com.terrain.reservationTerrain.repository.ClientRepository;
import com.terrain.reservationTerrain.service.ClientService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Client")
public class ClientRestController {
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Autowired
    ClientService clientService;
    @Autowired
    ClientRepository clientRepository;

    @RequestMapping(method = RequestMethod.POST )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    //ajouter
    public ResponseEntity<?> ajoutClient(@RequestBody Client client){
        //client.setMdp(this.bCryptPasswordEncoder.encode(client.getMdp()));
        //Client saveclient=clientRepository.save(client);
        return clientService.ajouterClient(client);


    }

    //midifier avec cryptage de mdp
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Client modifierClient(@RequestBody Client client, @PathVariable("id")Long id){
        client.setMdp(this.bCryptPasswordEncoder.encode(client.getMdp()));
        Client saveuser= clientRepository.save(client);
        return clientService.modifierClient(client);
    }

    //select(afficher)
    @RequestMapping(method = RequestMethod.GET)
    public List<Client> afficherClient(){
        return clientService.afficherClient();
    }

    //selectbyid
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Client> afficherbyid(@PathVariable("id")Long id){
        Optional<Client> clientid=clientService.afficherClientById(id);
        return clientid;
    }
    //delete
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteClient(@PathVariable("id")Long id){
        clientService.supprimerClient(id);
    }
    //login
    @PostMapping(path = "loginc")
    public ResponseEntity<Map<String, Object>> loginAdmin(@RequestBody Client client) {

        HashMap<String, Object> response = new HashMap<>();

        Client userFromDB = clientRepository.findClientByEmail(client.getEmail());

        if (userFromDB == null) {
            response.put("message", "CLient not found !");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }  else {
            boolean compare=this.bCryptPasswordEncoder.matches(client.getMdp(),userFromDB.getMdp());
            if (!compare){
                response.put("message", "Client not found !");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            }
            else {
                String token = Jwts.builder()
                        .claim("data", userFromDB)
                        .signWith(SignatureAlgorithm.HS256, "SECRET")
                        .compact();
                response.put("token", token);


                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
        }
    }

    @RequestMapping(value = "/confirmationCompte", method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseEntity<?> confirmationClient(@RequestParam("token")String confirmationToken){
        return clientService.confirmationEmail(confirmationToken);
    }
}
