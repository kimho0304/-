#define PIN_LED 13
unsigned int cnt, tgl;

void setup() {
  pinMode(PIN_LED, OUTPUT);
  Serial.begin(115200);
  while (!Serial){
    ;  
  }
  Serial.println("Hello World! 20223067 Kim Ho");
  cnt = tgl = 0;
  digitalWrite(PIN_LED, tgl);
}

void loop() {
  Serial.println(++cnt);
  tgl = tgl_state(tgl);
  digitalWrite(PIN_LED, tgl);
  delay(1000);

}

int tgl_state(int tgl){
  tgl = !tgl;
  return tgl;
}
