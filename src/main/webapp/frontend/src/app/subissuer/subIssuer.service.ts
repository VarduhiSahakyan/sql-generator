import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Subissuer} from "./subissuer";

@Injectable({
  providedIn: 'root'
})
export class SubIssuerService {

  constructor(private http: HttpClient) {
  }

  getAllSubIssuer() {
    return this.http.get('/subissuer');
  }

  add(subIssuer: Subissuer) {

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      }),
      observe: 'response' as 'response'
    };

    return this.http.post(
      '/subissuer',
      JSON.stringify({ acsId: subIssuer.acsId ,authenticationTimeOut: subIssuer.authenticationTimeOut,
        defaultLanguage: subIssuer.defaultLanguage,
        codeSvi: subIssuer.codeSvi, currencyCode: subIssuer.currencyCode,
        personnalDataStorage: subIssuer.personnalDataStorage,
        name: subIssuer.name, code: subIssuer.code,
        authentMeans: subIssuer.authentMeans, label:subIssuer.label}),
      httpOptions
    );
  }

  sendSubIssuerData(subIssuerData: any) {
    return this.http.post('/subissuer', subIssuerData, {responseType: 'text'});
  }

  downloadFile(filename: String) {
    return this.http.get('/subissuer/script/download/' + filename, {responseType: 'blob'});
  }

}

