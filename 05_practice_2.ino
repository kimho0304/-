#define PIN_LED 7
unsigned int cnt, tgl;

void setup() {
  pinMode(PIN_LED, OUTPUT);
  Serial.begin(115200);
  while (!Serial){
    ;  
  }
  Serial.println("Hello World! 20223067 Kim Ho");
  tgl = 0;
  digitalWrite(PIN_LED, tgl);
  delay(1000);
  tgl = tgl_state(tgl);
}

void loop() {
  for(int i=0; i < 12; i++){
    delay(100);
    tgl = tgl_state(tgl);
    digitalWrite(PIN_LED, tgl);
   }
  
 while(1){}

}

int tgl_state(int tgl){
  tgl = !tgl;
  return tgl;
}
