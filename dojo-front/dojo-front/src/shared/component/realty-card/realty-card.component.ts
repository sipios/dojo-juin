import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { AssetsService } from 'src/shared/services/assets.service';
import { RealtiesService } from 'src/shared/services/realties.service';
import { Realty } from '../../interface/realty';

@Component({
  selector: 'app-realty-card',
  templateUrl: './realty-card.component.html',
  styleUrls: ['./realty-card.component.scss'],
})
export class RealtyCardComponent {
  @Input()
  realty!: Realty;

  constructor(
    public router: Router,
    private realtiesService: RealtiesService,
    private assetsService: AssetsService
  ) {}

  buyProperty() {
    this.realtiesService.buyRealty(this.realty.id).subscribe((_) => {
      this.refreshPage();
    });
  }

  sellProperty() {
    this.assetsService.sellRealty(this.realty.id).subscribe((_) => {
      this.refreshPage();
    });
  }

  private refreshPage() {
    window.location.reload();
  }
}
