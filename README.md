# Projeto: Reconhecimento Facial em Java com OpenCV e JavaCV

## Descrição

Este projeto implementa um sistema de reconhecimento facial em Java utilizando OpenCV e JavaCV. Ele possui três principais funcionalidades:

1. **Captura de Imagens e Vídeos**: A classe `Captura` captura frames da câmera em tempo real e exibe o vídeo em uma janela gráfica. Os frames capturados podem ser convertidos em imagens cinza e analisados para detectar faces utilizando o classificador Haarcascade.

2. **Treinamento de Modelos de Reconhecimento Facial**: A classe `Treinamento` processa imagens previamente capturadas e as utiliza para treinar três tipos de reconhecedores faciais:
   - Eigenfaces (`EigenFaceRecognizer`)
   - Fisherfaces (`FisherFaceRecognizer`)
   - LBPH (`LBPHFaceRecognizer`)

   Estes modelos são salvos em arquivos `.yml` para serem utilizados posteriormente na etapa de reconhecimento.

3. **Reconhecimento Facial em Tempo Real**: A classe `Reconhecimento` carrega os modelos treinados e utiliza a câmera para capturar frames em tempo real. As faces detectadas são comparadas com os modelos treinados para identificar pessoas.

## Funcionalidades das Classes

### Classe `Captura`

Captura frames da câmera, detecta faces e salva imagens para treinamento.

### Classe `Treinamento`

Treina modelos de reconhecimento facial utilizando Eigenfaces, Fisherfaces e LBPH, e salva os modelos treinados.

### Classe `Reconhecimento`

Utiliza os modelos treinados para reconhecer faces em tempo real.

## Dependências

- Java Development Kit (JDK)
- OpenCV
- JavaCV
- Haarcascade (`haarcascade_frontalface_alt.xml`)

## Instruções para Execução

1. **Captura de Imagens para Treinamento**:
   - Execute a classe `Captura`.
   - Digite seu ID quando solicitado.
   - Pressione a tecla `q` para capturar uma imagem. Repita até que o número de amostras desejado seja alcançado.

2. **Treinamento dos Modelos**:
   - Execute a classe `Treinamento` para treinar os modelos de reconhecimento facial com as imagens capturadas.

3. **Reconhecimento Facial**:
   - Execute a classe `Reconhecimento` para iniciar a detecção e reconhecimento facial em tempo real.

## Estrutura do Projeto

- `src/recursos/`: Contém o classificador Haarcascade e os arquivos de modelo treinado.
- `src/fotos/`: Contém as imagens capturadas para treinamento.

## Observações

- Ajuste o caminho para o arquivo Haarcascade (`haarcascade_frontalface_alt.xml`) conforme necessário.
- Ajuste o threshold dos reconhecedores faciais conforme necessário para melhorar a precisão do reconhecimento.

## Autor

- Francis Campos
