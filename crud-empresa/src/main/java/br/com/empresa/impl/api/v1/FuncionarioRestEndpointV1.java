package br.com.empresa.impl.api.v1;

import java.util.List;

import br.com.empresa.impl.business.dto.FuncionarioDTOV1;
import org.springframework.http.ResponseEntity;

public interface FuncionarioRestEndpointV1 {

    ResponseEntity<List<FuncionarioDTOV1>> buscaFuncionariosList();

    ResponseEntity<FuncionarioDTOV1> buscaFuncionario(Long codigoFuncionario);

    ResponseEntity<Void> adicionaFuncionario(FuncionarioDTOV1 associado);

    ResponseEntity<Void> atualizaFuncionario(Long codigoFuncionario, FuncionarioDTOV1 funcionario);

}
