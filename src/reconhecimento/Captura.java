/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reconhecimento;

import java.awt.event.KeyEvent;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

/**
 *
 * @author 38586286893
 */
public class Captura {
    
    public static void main(String args[]) throws FrameGrabber.Exception {
        KeyEvent tecla = null;

        OpenCVFrameConverter.ToMat converteMat = new OpenCVFrameConverter.ToMat();
        OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0);
        camera.start();

        CanvasFrame cFrame = new CanvasFrame("Preview", CanvasFrame.getDefaultGamma() / camera.getGamma());
        Frame frameCapturado = null;

        while ((frameCapturado = camera.grab()) != null) {
            if (cFrame.isVisible()) {
                cFrame.showImage(frameCapturado); // Corrigido para passar o frame capturado
            }
        }

        cFrame.dispose(); // Certifique-se de liberar recursos
        camera.stop(); // Certifique-se de parar a câmera
    }
}
